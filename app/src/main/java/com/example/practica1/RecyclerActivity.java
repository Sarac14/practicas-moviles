package com.example.practica1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import com.example.practica1.adapters.StudentAdapter;
import com.example.practica1.api.APIClient;
import com.example.practica1.api.APIInterface;
import com.example.practica1.databinding.ActivityRecycleBinding;
import com.example.practica1.dto.User;
import com.example.practica1.dto.UserList;
import com.example.practica1.entities.Student;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RecyclerActivity extends AppCompatActivity {

    private ActivityRecycleBinding binding;
    private Button sent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityRecycleBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        RecyclerView recyclerView = binding.recycleView;

        int spanCount = 2;
        if (this.getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
            spanCount = 4;
        }

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new GridLayoutManager(getApplicationContext(), spanCount));

        APIInterface apiInterface = APIClient.getClient().create(APIInterface.class);
        Call<UserList> call = apiInterface.findAll();
        call.enqueue(new Callback<UserList>() {
            @Override
            public void onResponse(Call<UserList> call, Response<UserList> response) {
                if (response.isSuccessful()) {
                    UserList userList = response.body();
                    if (userList != null) {
                        List<Student> students = convertUsersToStudents(userList.getData());
                        recyclerView.setAdapter(new StudentAdapter(students));
                    }
                } else {
                    Toast.makeText(RecyclerActivity.this, "Error al obtener la lista de estudiantes", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<UserList> call, Throwable t) {
                Toast.makeText(RecyclerActivity.this, "Error de red: " + t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    private List<Student> convertUsersToStudents(List<User> users) {
        List<Student> students = new ArrayList<>();
        for (User user : users) {
            students.add(new Student(user.getFirstName(), user.getLastName(), user.getId().toString(),user.getEmail().toString()));
        }
        return students;
    }
}