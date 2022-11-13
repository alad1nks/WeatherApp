package com.example.weatherapplication.ui.current.viewmodel

import androidx.lifecycle.*
import com.example.weatherapplication.domain.CurrentWeather
import com.example.weatherapplication.repositories.UserCurrentWeatherRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.io.IOException
import javax.inject.Inject

class CurrentWeatherViewModel @Inject constructor(
    private val userCurrentWeatherRepository: UserCurrentWeatherRepository
): ViewModel() {

    val currentWeather = MutableLiveData<CurrentWeather>()

    init {
        getCurrentWeather()
    }

    private fun getCurrentWeather() {
        viewModelScope.launch(Dispatchers.IO) {
            try {
                currentWeather.postValue(userCurrentWeatherRepository.getCurrentWeatherApi())
            } catch (e: IOException) {
                currentWeather.postValue(userCurrentWeatherRepository.getCurrentWeatherDatabase())
            }
        }
    }
}
