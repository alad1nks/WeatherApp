package com.example.weatherapplication.di

import android.content.Context
import com.example.weatherapplication.MainActivity
import com.example.weatherapplication.ui.settings.SettingsActivity
import com.example.weatherapplication.repositories.UserCurrentWeatherRepository
import com.example.weatherapplication.repositories.UserDailyWeatherRepository
import com.example.weatherapplication.repositories.UserSettingsRepository
import dagger.BindsInstance
import dagger.Component
import dagger.Module
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AppModule::class,
        AppModuleBinds::class,
        SubcomponentsModule::class,
        ViewModelBuilderModule::class]
)
interface AppComponent {

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance context: Context): AppComponent
    }

    fun inject(activity: MainActivity)

    fun currentWeatherComponent(): CurrentWeatherComponent.Factory
    fun dailyWeatherComponent(): DailyWeatherComponent.Factory
    fun settingsComponent(): SettingsComponent.Factory

    val userCurrentWeatherRepository: UserCurrentWeatherRepository
    val userDailyWeatherRepository: UserDailyWeatherRepository
    val userSettingsRepository: UserSettingsRepository
}

@Module(
    subcomponents = [
        CurrentWeatherComponent::class,
        DailyWeatherComponent::class,
        SettingsComponent::class
    ]
)
object SubcomponentsModule