package com.example.weatherapplication.network

import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

object RetrofitService {
    private val retrofit = Retrofit.Builder()
        .baseUrl("https://api.openweathermap.org/data/2.5/")
        .addConverterFactory(MoshiConverterFactory.create(
            Moshi.Builder()
            .add(KotlinJsonAdapterFactory())
            .build()))
        .build()

    val api = retrofit.create(RetrofitService::class.java)
}