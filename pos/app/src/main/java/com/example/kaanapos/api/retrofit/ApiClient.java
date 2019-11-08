package com.example.kaanapos.api.retrofit;

import com.facebook.stetho.BuildConfig;
import com.facebook.stetho.okhttp3.StethoInterceptor;
import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {

    private static Retrofit retrofit = null;
    public static String Server_Api ="";
//    public static String Server_Api = BuildConfig.EABL;

    private static OkHttpClient okClient() {
        return new OkHttpClient.Builder()
                .connectTimeout(20000, TimeUnit.SECONDS)
                .writeTimeout(20000, TimeUnit.SECONDS)
                .retryOnConnectionFailure(true)
                .readTimeout(20000, TimeUnit.SECONDS)
                .build();
    }

    private static OkHttpClient client(){
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient client = new OkHttpClient.Builder().addInterceptor(interceptor).build();
        return client;
    }

    private static OkHttpClient getStethoClient() {
        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .addNetworkInterceptor(new StethoInterceptor())
                .build();
        return  okHttpClient;
    }

    public static Retrofit getClientServer() {

        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(Server_Api)
//                    .client(getStethoClient())
                    .client(okClient())
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }


    private static OkHttpClient okHttpClient;

    public static Retrofit getClient() {
        if (okHttpClient == null)
            initOkHttp();

        retrofit = new Retrofit.Builder()
                .baseUrl(Server_Api)
//                .client(getStethoClient())
                .client(okHttpClient)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return retrofit;
    }

    private static void initOkHttp() {

        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient.Builder httpClient = new OkHttpClient().newBuilder()
                .connectTimeout(20000, TimeUnit.SECONDS)
                .readTimeout(20000, TimeUnit.SECONDS)
                .writeTimeout(20000, TimeUnit.SECONDS)
                .addInterceptor(interceptor);

        okHttpClient = httpClient.build();
    }

}
