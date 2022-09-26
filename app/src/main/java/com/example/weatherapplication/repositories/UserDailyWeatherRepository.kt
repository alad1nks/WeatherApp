package com.example.weatherapplication.repositories

import com.example.weatherapplication.domain.DailyWeather

interface UserDailyWeatherRepository {
    suspend fun getDailyWeatherDatabase(): List<DailyWeather>
    suspend fun getDailyWeatherApi(): List<DailyWeather>
}