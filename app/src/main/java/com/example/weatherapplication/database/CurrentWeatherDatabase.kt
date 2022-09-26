package com.example.weatherapplication.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.weatherapplication.database.model.DatabaseCurrentWeather


@Database(entities = [DatabaseCurrentWeather::class], version = 1, exportSchema = false)
abstract class CurrentWeatherDatabase: RoomDatabase() {

    abstract fun currentWeatherDao(): CurrentWeatherDao
}