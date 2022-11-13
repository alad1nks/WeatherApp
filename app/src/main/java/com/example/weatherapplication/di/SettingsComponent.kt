package com.example.weatherapplication.di

import com.example.weatherapplication.ui.settings.SettingsActivity
import dagger.Subcomponent

@Subcomponent(modules = [SettingsModule::class])
interface SettingsComponent {
    @Subcomponent.Factory
    interface Factory {
        fun create(): SettingsComponent
    }

    fun inject(activity: SettingsActivity)
}