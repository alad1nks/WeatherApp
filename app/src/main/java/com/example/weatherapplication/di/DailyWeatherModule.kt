package com.example.weatherapplication.di

import androidx.lifecycle.ViewModel
import com.example.weatherapplication.ui.current.viewmodel.CurrentWeatherViewModel
import com.example.weatherapplication.ui.daily.viewmodel.DailyWeatherViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class DailyWeatherModule {

    @Binds
    @IntoMap
    @ViewModelKey(DailyWeatherViewModel::class)
    abstract fun bindViewModel(viewmodel: DailyWeatherViewModel): ViewModel
}