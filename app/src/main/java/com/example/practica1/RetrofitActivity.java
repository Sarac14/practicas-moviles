package com.example.practica1;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.example.practica1.api.APIClient;
import com.example.practica1.api.APIInterface;
import com.example.practica1.databinding.*;
import com.example.practica1.dto.UserSingle;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RetrofitActivity extends AppCompatActivity {

    ActivityRetrofitBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityRetrofitBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        APIInterface api = APIClient.getClient().create(APIInterface.class);

       /* api.find(2).enqueue(new Callback<UserSingle>() {
            @Override
            public void onResponse(Call<UserSingle> call, Response<UserSingle> response) {
                Log.w("onResponse", response.body().data.toString());
            }

            @Override
            public void onFailure(Call<UserSingle> call, Throwable t) {
                Log.w("onFailure", t.getLocalizedMessage());
                call.cancel();
            }
        });*/

//        api.findAll().enqueue(new Callback<UserList>() {
//            @Override
//            public void onResponse(Call<UserList> call, Response<UserList> response) {
//                Log.w("onResponse", response.body().data.toString());
//            }
//
//            @Override
//            public void onFailure(Call<UserList> call, Throwable t) {
//                Log.w("onFailure", t.getLocalizedMessage());
//                call.cancel();
//            }
//        });


//        api.findAll().enqueue(new Callback<UserList>() {
//            @Override
//            public void onResponse(Call<UserList> call, Response<UserList> response) {
//                Log.d("onResponse", response.code() + "");
//            }
//
//            @Override
//            public void onFailure(Call<UserList> call, Throwable t) {
//                Log.i("onFailure", t.getMessage());
//                call.cancel();
//            }
//        });
//
//        api.find(1).enqueue(new Callback<UserSingle>() {
//            @Override
//            public void onResponse(Call<UserSingle> call, Response<UserSingle> response) {
//                Log.d("onResponse", response.code() + "");
//            }
//
//            @Override
//            public void onFailure(Call<UserSingle> call, Throwable t) {
//                Log.i("onFailure", t.getMessage());
//                call.cancel();
//            }
//        });


    }
}