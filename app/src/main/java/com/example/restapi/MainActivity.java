package com.example.restapi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.util.Log;
import android.widget.TextView;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.rasp.yandex.net/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        RaspAPI service = retrofit.create(RaspAPI.class);

        Call<Schedule> call = service.nearestStations("v3.0",
                "269c4d05-3bb8-4c32-bcef-d42e3892c937",
                55.743692, 37.6822959);

        call.enqueue(new Callback<Schedule>() {
            @Override
            public void onResponse(Call<Schedule> call, Response<Schedule> response) {
                Schedule schedule = response.body();
                Log.d("RETROFIT", schedule.getStations().get(0).getTitle());
                TextView tv = findViewById(R.id.textView);
                tv.setText(Html.fromHtml("<a href=\"https://yandex.ru\">Яндекс</a>"));
                tv.setMovementMethod(LinkMovementMethod.getInstance());
            }

            @Override
            public void onFailure(Call<Schedule> call, Throwable t) {
                Log.e("RETROFIT", t.getMessage());
            }
        });


    }
}