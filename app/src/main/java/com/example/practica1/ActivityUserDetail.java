package com.example.practica1;


import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import android.widget.Toast;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.practica1.dto.UserSingle;
import com.bumptech.glide.Glide;

import com.example.practica1.api.APIInterface;
import com.example.practica1.api.APIClient;
import com.example.practica1.dto.User;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ActivityUserDetail extends AppCompatActivity {

    public static final String EXTRA_USER_ID = "EXTRA_USER_ID";

    private TextView tvEmail;
    private ImageView ivAvatar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_detail);

        // Obtén los datos del estudiante de los extras del Intent
        String studentName = getIntent().getStringExtra("student_name");
        String studentLastName = getIntent().getStringExtra("student_last_name");
        String studentId = getIntent().getStringExtra("student_id");
        String foto = getIntent().getStringExtra("student_foto_url");
        String email = getIntent().getStringExtra("student_email");


        // Muestra los datos en la vista de detalles
        TextView nameTextView = (TextView) findViewById(R.id.nameUser);
        TextView lastNameTextView = (TextView) findViewById(R.id.lastNameUser);
        TextView emailTextView = (TextView) findViewById(R.id.tvEmail);
        TextView idTextView = (TextView) findViewById(R.id.idstudent);

        nameTextView.setText("Nombre: " + studentName);
        lastNameTextView.setText("Apellido: " + studentLastName);
        idTextView.setText("ID: " + studentId);
        emailTextView.setText("Email: "+email);
//        Glide.with(this)
//                .load(fotoUrl) // Carga la foto desde la URL
//                .placeholder(R.drawable.placeholder_image) // Opcional: imagen de marcador de posición
//                .error(R.drawable.error_image) // Opcional: imagen de error en caso de fallo
//                .into(fotoImageView);



    }

    private void fetchUserDetails(int userId) {
        APIInterface api = APIClient.getClient().create(APIInterface.class);
        api.find(userId).enqueue(new Callback<UserSingle>() {
            @Override
            public void onResponse(Call<UserSingle> call, Response<UserSingle> response) {
                if (response.isSuccessful()) {
                    User user = response.body().getData();
                    tvEmail.setText(user.email);
                    Glide.with(ActivityUserDetail.this)
                            .load(user.avatar)
                            .into(ivAvatar);
                }
            }

            @Override
            public void onFailure(Call<UserSingle> call, Throwable t) {
            }
        });
    }

}