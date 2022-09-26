package com.example.weatherapplication.database.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.weatherapplication.domain.DailyWeather

@Entity(tableName = "databasedailyweather")
data class DatabaseDailyWeather(
    @PrimaryKey
    val icon: Int,
    val temperature: String,
    val weather: String,
    val date: String
)

fun DatabaseDailyWeather.asDomain(): DailyWeather {
    return DailyWeather(
        icon = icon,
        temperature = temperature,
        weather = weather,
        date = date
    )
}