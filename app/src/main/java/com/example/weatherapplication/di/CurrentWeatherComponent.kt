package com.example.weatherapplication.di

import com.example.weatherapplication.ui.current.CurrentWeatherFragment
import dagger.Subcomponent

@Subcomponent(modules = [CurrentWeatherModule::class])
interface CurrentWeatherComponent {
    @Subcomponent.Factory
    interface Factory {
        fun create(): CurrentWeatherComponent
    }

    fun inject(fragment: CurrentWeatherFragment)
}