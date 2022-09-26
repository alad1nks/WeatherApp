package com.example.weatherapplication

import android.app.Application
import com.example.weatherapplication.di.AppComponent
import com.example.weatherapplication.di.DaggerAppComponent


open class WeatherApp : Application() {

    val appComponent: AppComponent by lazy {
        initializeComponent()
    }

    open fun initializeComponent(): AppComponent {
        return DaggerAppComponent.factory().create(applicationContext)
    }

}