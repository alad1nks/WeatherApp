package com.example.weatherapplication.network

import com.example.weatherapplication.network.domain.GetCurrentWeatherResponse
import com.example.weatherapplication.network.domain.GetDailyWeatherResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("weather")
    suspend fun getCurrentWeather(

        @Query("q")
        q: String,

        @Query("units")
        units: String,

        @Query("appid")
        appid: String

    ): GetCurrentWeatherResponse

    @GET("forecast")
    suspend fun getDailyWeather(

        @Query("q")
        q: String,

        @Query("units")
        units: String,

        @Query("appid")
        appid: String

    ): GetDailyWeatherResponse
}