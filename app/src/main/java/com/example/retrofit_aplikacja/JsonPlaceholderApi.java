package com.example.retrofit_aplikacja;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface JsonPlaceholderApi {
    @GET("pytania")

    public Call<List<pytanie>>getPytania();
}
