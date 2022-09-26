package com.example.weatherapplication.database.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.weatherapplication.domain.CurrentWeather

@Entity(tableName = "databasecurrentweather")
data class DatabaseCurrentWeather(
    @PrimaryKey
    val city: String,
    val icon: Int,
    val temperature: String,
    val weather: String,
    val wind: String,
    val humidity: String,
    val perception: String
)

fun DatabaseCurrentWeather.asDomainModel() : CurrentWeather {
    return CurrentWeather(
        city = city,
        icon = icon,
        temperature = temperature,
        weather = weather,
        wind = wind,
        humidity = humidity,
        perception = perception
    )
}