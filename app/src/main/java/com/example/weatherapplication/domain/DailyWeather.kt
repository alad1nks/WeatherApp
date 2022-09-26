package com.example.weatherapplication.domain

import androidx.room.PrimaryKey

data class DailyWeather(
    val icon: Int,
    val temperature: String,
    val weather: String,
    val date: String
)
