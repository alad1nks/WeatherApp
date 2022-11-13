package com.example.weatherapplication.repositories

interface UserSettingsRepository {
    suspend fun getCities(): List<String>
}