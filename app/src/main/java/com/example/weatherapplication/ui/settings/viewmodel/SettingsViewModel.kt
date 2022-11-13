package com.example.weatherapplication.ui.settings.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.weatherapplication.repositories.UserSettingsRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

class SettingsViewModel @Inject constructor(
    private val userSettingsRepository: UserSettingsRepository
): ViewModel()  {
    val cities = MutableLiveData<List<String>>()

    init {
        getCities()
    }

    private fun getCities() {
        viewModelScope.launch(Dispatchers.IO) {
            cities.postValue(userSettingsRepository.getCities())
        }
    }
}