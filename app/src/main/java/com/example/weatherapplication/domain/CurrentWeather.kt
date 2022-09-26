package com.example.weatherapplication.domain

data class CurrentWeather(
    val city: String,
    val icon: Int,
    val temperature: String,
    val weather: String,
    val wind: String,
    val humidity: String,
    val perception: String
)
