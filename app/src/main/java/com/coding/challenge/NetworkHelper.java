package com.coding.challenge;

import android.util.Log;

import com.google.gson.Gson;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class NetworkHelper {

    public NetworkHelper() {
    }

    public Retrofit createRetrofit() {
        HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor(message -> Log.d("Network", message));
        loggingInterceptor.level(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient okHttpClient = new OkHttpClient().newBuilder()
                .connectTimeout(60_000, TimeUnit.MILLISECONDS)
                .readTimeout(60_000, TimeUnit.MILLISECONDS)
                .addNetworkInterceptor(loggingInterceptor)
                .build();
        return createRetrofitHelper(okHttpClient);
    }

    private Retrofit createRetrofitHelper(OkHttpClient okHttpClient) {
        return new Retrofit.Builder().baseUrl("https://ghibliapi.vercel.app/")
                .addConverterFactory(GsonConverterFactory.create(new Gson()))
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .client(okHttpClient)
                .build();
    }
}
