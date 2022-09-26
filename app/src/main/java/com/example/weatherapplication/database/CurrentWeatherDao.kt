package com.example.weatherapplication.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.weatherapplication.database.model.DatabaseCurrentWeather

@Dao
interface CurrentWeatherDao {

    @Query("SELECT * FROM databasecurrentweather")
    fun getCurrentWeather(): DatabaseCurrentWeather

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertCurrentWeather(currentWeather: DatabaseCurrentWeather)

}