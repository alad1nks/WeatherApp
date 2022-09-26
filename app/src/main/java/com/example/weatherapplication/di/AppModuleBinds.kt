package com.example.weatherapplication.di

import com.example.weatherapplication.repositories.CurrentWeatherRepository
import com.example.weatherapplication.repositories.DailyWeatherRepository
import com.example.weatherapplication.repositories.UserCurrentWeatherRepository
import com.example.weatherapplication.repositories.UserDailyWeatherRepository
import dagger.Binds
import dagger.Module
import javax.inject.Singleton

@Module
abstract class AppModuleBinds {

    @Singleton
    @Binds
    abstract fun bindRepository(repo: CurrentWeatherRepository): UserCurrentWeatherRepository


    @Singleton
    @Binds
    abstract fun bindDailyRepository(repo: DailyWeatherRepository): UserDailyWeatherRepository
}