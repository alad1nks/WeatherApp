package com.example.weatherapplication.repositories

import com.example.weatherapplication.domain.CurrentWeather

interface UserCurrentWeatherRepository {
    suspend fun getCurrentWeatherDatabase(): CurrentWeather
    suspend fun getCurrentWeatherApi(): CurrentWeather
}