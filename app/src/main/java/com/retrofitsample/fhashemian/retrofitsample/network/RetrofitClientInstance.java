package com.retrofitsample.fhashemian.retrofitsample.network;

import android.text.TextUtils;
import android.util.JsonReader;
import android.util.JsonToken;
import android.util.JsonWriter;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.TypeAdapter;
import com.retrofitsample.fhashemian.retrofitsample.helper.NetDateTimeAdapter;

import java.io.IOException;
import java.util.Date;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClientInstance {

    private static Retrofit retrofit;
    private static final String BASE_URL = "http://85.133.187.40:20003/TrackingService.svc/";//"https://jsonplaceholder.typicode.com";//


    private RetrofitClientInstance() {
    }

    public static Retrofit getRetrofitInstance() {
        if (retrofit == null) {
            Gson gson = new GsonBuilder().registerTypeAdapter(java.sql.Date.class, new NetDateTimeAdapter()).create();
            retrofit = new Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create(gson)).build();
        }
        return retrofit;
    }

}

