package com.example.weatherapplication.repositories

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import com.example.weatherapplication.database.CurrentWeatherDao
import com.example.weatherapplication.database.CurrentWeatherDatabase
import com.example.weatherapplication.database.model.asDomainModel
import com.example.weatherapplication.domain.CurrentWeather
import com.example.weatherapplication.network.ApiService
import com.example.weatherapplication.network.domain.asDatabase
import com.example.weatherapplication.network.domain.asDomain
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class CurrentWeatherRepository @Inject constructor(
    private val database: CurrentWeatherDatabase,
    private val api: ApiService
) : UserCurrentWeatherRepository {

    private val db = database.currentWeatherDao()

    override suspend fun getCurrentWeatherDatabase(): CurrentWeather {
        return db.getCurrentWeather().asDomainModel()
    }

    override suspend fun getCurrentWeatherApi(): CurrentWeather {
        val current = api.getCurrentWeather(
            "Almaty",
            "metric",
            "25bce8a1d881a71732d233bd579371f0"
        )
        db.insertCurrentWeather(current.asDatabase())
        return current.asDomain()
    }
}