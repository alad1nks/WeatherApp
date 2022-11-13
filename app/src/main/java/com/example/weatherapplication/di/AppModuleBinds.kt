package com.example.weatherapplication.di

import android.app.Application
import android.content.Context
import com.example.weatherapplication.MainActivity
import com.example.weatherapplication.preferences.AppPreference
import com.example.weatherapplication.preferences.AppPreferenceImpl
import com.example.weatherapplication.repositories.*
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

    @Singleton
    @Binds
    abstract fun bindSettingsRepository(repo: SettingsRepository): UserSettingsRepository

    @Binds
    abstract fun bindSharedPreferences(appPreferenceImpl: AppPreferenceImpl): AppPreference
}