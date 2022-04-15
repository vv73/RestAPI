package com.example.restapi;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface RaspAPI {
    @GET("v3.0/nearest_stations")
    Call<Schedule> nearestStations(@Query("apikey") String apiKey, @Query("lat") double lat, @Query("lng") double lng);
}
