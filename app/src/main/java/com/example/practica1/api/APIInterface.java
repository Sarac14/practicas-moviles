package com.example.practica1.api;

import com.example.practica1.dto.UserList;
import com.example.practica1.dto.UserSingle;

import retrofit2.Call;
import retrofit2.http.*;

public interface APIInterface {

    @GET("users")
    Call<UserList> findAll();

    @GET("users/{id}")
    Call<UserSingle> find(@Path("id") int id);


}
