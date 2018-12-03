package com.example.asus.retrofitexample2.apiclient;

import com.example.asus.retrofitexample2.model.ModelHomeList;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface ApiInterface {
    @FormUrlEncoded
    @POST("api-HomeList.php")
    Call<ModelHomeList> getHomeList(@Field("access_token") String apikey);
}
