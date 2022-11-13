package com.example.weatherapplication.preferences

interface AppPreference {
    fun getCity(): String
    fun setCity(city: String)
}