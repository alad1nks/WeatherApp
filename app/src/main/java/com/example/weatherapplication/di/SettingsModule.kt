package com.example.weatherapplication.di

import androidx.lifecycle.ViewModel
import com.example.weatherapplication.ui.daily.viewmodel.DailyWeatherViewModel
import com.example.weatherapplication.ui.settings.viewmodel.SettingsViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap


@Module
abstract class SettingsModule {
    @Binds
    @IntoMap
    @ViewModelKey(SettingsViewModel::class)
    abstract fun bindViewModel(viewmodel: SettingsViewModel): ViewModel
}