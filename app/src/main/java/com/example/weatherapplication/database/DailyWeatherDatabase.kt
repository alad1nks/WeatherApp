package com.example.weatherapplication.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.weatherapplication.database.model.DatabaseDailyWeather

@Database(entities = [DatabaseDailyWeather::class], version = 1, exportSchema = false)
abstract class DailyWeatherDatabase: RoomDatabase() {

    abstract fun dailyWeatherDao(): DailyWeatherDao
}