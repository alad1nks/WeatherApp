package com.example.weatherapplication.repositories

import androidx.lifecycle.LiveData
import com.example.weatherapplication.domain.CurrentWeather

interface UserCurrentWeatherRepository {
    suspend fun getCurrentWeatherDatabase(): CurrentWeather
    suspend fun getCurrentWeatherApi(): CurrentWeather
}