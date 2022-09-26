package com.example.weatherapplication.repositories

import com.example.weatherapplication.database.DailyWeatherDatabase
import com.example.weatherapplication.database.model.asDomain
import com.example.weatherapplication.domain.DailyWeather
import com.example.weatherapplication.network.ApiService
import com.example.weatherapplication.network.domain.asDatabase
import com.example.weatherapplication.network.domain.asDomain
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class DailyWeatherRepository @Inject constructor(
    private val database: DailyWeatherDatabase,
    private val api: ApiService
): UserDailyWeatherRepository {

    private val db = database.dailyWeatherDao()
    override suspend fun getDailyWeatherDatabase(): List<DailyWeather> {
        return db.getDailyWeather().map {
            it.asDomain()
        }
    }

    override suspend fun getDailyWeatherApi(): List<DailyWeather> {
        val daily = api.getDailyWeather(
            "Almaty",
            "metric",
            "25bce8a1d881a71732d233bd579371f0"
        )
        db.insertDailyWeather(daily.asDatabase())
        return daily.asDomain()
    }
}