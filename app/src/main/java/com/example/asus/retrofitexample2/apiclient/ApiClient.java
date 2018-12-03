package com.example.asus.retrofitexample2.apiclient;

import android.util.Log;

import retrofit2.GsonConverterFactory;
import retrofit2.Retrofit;

public class ApiClient {

public static String BASE_URL = "http://54.252.134.98/venue-music/api_V2/";
private static Retrofit retrofit = null;

public static Retrofit getClient(){
    if (retrofit == null){
        retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        Log.e("Base Url :",BASE_URL);
    }
    return retrofit;
}
}
