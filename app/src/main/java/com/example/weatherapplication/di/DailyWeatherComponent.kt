package com.example.weatherapplication.di

import com.example.weatherapplication.ui.current.CurrentWeatherFragment
import com.example.weatherapplication.ui.daily.DailyWeatherFragment
import dagger.Subcomponent

@Subcomponent(modules = [DailyWeatherModule::class])
interface DailyWeatherComponent {
    @Subcomponent.Factory
    interface Factory {
        fun create(): DailyWeatherComponent
    }

    fun inject(fragment: DailyWeatherFragment)
}