package com.example.weatherapplication.preferences

import android.content.Context
import javax.inject.Inject

class AppPreferenceImpl @Inject constructor(context: Context): AppPreference {

    companion object {
        const val CITY = "city"
    }

    private var preference = context.getSharedPreferences("dagger-pref", Context.MODE_PRIVATE)
    private var editor = preference.edit()


    override fun getCity(): String {
        return getString(CITY)
    }

    override fun setCity(city: String) {
        saveString(CITY, city)
    }

    private fun saveString(key: String, value: String) {
        editor.putString(key, value).apply()
    }

    private fun getString(key: String, defaultValue: String = ""): String {
        return preference.getString(key, defaultValue) ?: defaultValue
    }

}