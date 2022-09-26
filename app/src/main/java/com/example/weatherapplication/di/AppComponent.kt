package com.example.weatherapplication.di

import android.app.Application
import android.content.Context
import com.example.weatherapplication.WeatherApp
import com.example.weatherapplication.repositories.UserCurrentWeatherRepository
import com.example.weatherapplication.repositories.UserDailyWeatherRepository
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

    fun currentWeatherComponent(): CurrentWeatherComponent.Factory
    fun dailyWeatherComponent(): DailyWeatherComponent.Factory

    val userCurrentWeatherRepository: UserCurrentWeatherRepository
    val userDailyWeatherRepository: UserDailyWeatherRepository
}

@Module(
    subcomponents = [
        CurrentWeatherComponent::class,
        DailyWeatherComponent::class
    ]
)
object SubcomponentsModule