package com.example.weatherapplication.ui.daily.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.weatherapplication.domain.CurrentWeather
import com.example.weatherapplication.domain.DailyWeather
import com.example.weatherapplication.repositories.UserDailyWeatherRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.io.IOException
import javax.inject.Inject

class DailyWeatherViewModel @Inject constructor(
    private val userDailyWeatherRepository: UserDailyWeatherRepository
): ViewModel() {
    val dailyWeather = MutableLiveData<List<DailyWeather>>()

    init {
        getDailyWeather()
    }

    private fun getDailyWeather() {
        viewModelScope.launch(Dispatchers.IO) {
            try {
                dailyWeather.postValue(userDailyWeatherRepository.getDailyWeatherApi())
            } catch (e: IOException) {
                dailyWeather.postValue(userDailyWeatherRepository.getDailyWeatherDatabase())
            }
        }
    }
}