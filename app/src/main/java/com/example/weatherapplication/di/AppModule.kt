package com.example.weatherapplication.di

import android.content.Context
import androidx.room.Room
import com.example.weatherapplication.database.CurrentWeatherDatabase
import com.example.weatherapplication.database.DailyWeatherDatabase
import com.example.weatherapplication.network.ApiService
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import javax.inject.Singleton

@Module
object AppModule {
    private lateinit var INSTANCE: CurrentWeatherDatabase
    private lateinit var INSTANCEDAILY: DailyWeatherDatabase


    @Provides
    @Singleton
    fun provideRetrofit(): ApiService = Retrofit.Builder()
        .baseUrl("https://api.openweathermap.org/data/2.5/")
        .addConverterFactory(
            MoshiConverterFactory.create(
            Moshi.Builder()
                .add(KotlinJsonAdapterFactory())
                .build()))
        .build()
        .create(ApiService::class.java)


    @Provides
    @Singleton
    fun provideCurrentWeatherDatabase(context: Context): CurrentWeatherDatabase {
        synchronized(CurrentWeatherDatabase::class.java) {
            if (!::INSTANCE.isInitialized) {
                INSTANCE = Room.databaseBuilder(context.applicationContext,
                    CurrentWeatherDatabase::class.java,
                    "current_weather_database").build()
            }
        }
        return INSTANCE
    }

    @Provides
    @Singleton
    fun provideDailyWeatherDatabase(context: Context): DailyWeatherDatabase {
        synchronized(DailyWeatherDatabase::class.java) {
            if (!::INSTANCEDAILY.isInitialized) {
                INSTANCEDAILY = Room.databaseBuilder(context.applicationContext,
                    DailyWeatherDatabase::class.java,
                    "daily_weather_database").build()
            }
        }
        return INSTANCEDAILY
    }
}