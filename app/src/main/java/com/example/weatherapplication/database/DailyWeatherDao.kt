package com.example.weatherapplication.database

import androidx.room.*
import com.example.weatherapplication.database.model.DatabaseCurrentWeather
import com.example.weatherapplication.database.model.DatabaseDailyWeather

@Dao
interface DailyWeatherDao {
    @Query("SELECT * FROM databasedailyweather")
    fun getDailyWeather(): List<DatabaseDailyWeather>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertDailyWeather(dailyWeather: List<DatabaseDailyWeather>)

    @Query("DELETE FROM databasedailyweather")
    fun clear()
}