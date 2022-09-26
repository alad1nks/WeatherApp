package com.example.weatherapplication.di

import androidx.lifecycle.ViewModel
import com.example.weatherapplication.ui.current.viewmodel.CurrentWeatherViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class CurrentWeatherModule {

    @Binds
    @IntoMap
    @ViewModelKey(CurrentWeatherViewModel::class)
    abstract fun bindViewModel(viewmodel: CurrentWeatherViewModel): ViewModel
}