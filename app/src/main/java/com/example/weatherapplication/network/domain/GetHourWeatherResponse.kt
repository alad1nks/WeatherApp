package com.example.weatherapplication.network.domain

import android.os.Parcelable
import com.example.weatherapplication.R
import com.example.weatherapplication.database.model.DatabaseDailyWeather
import com.example.weatherapplication.domain.DailyWeather
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
data class GetDailyWeatherResponse(
    @Json(name = "cod")
    val cod: String? = null,

    @Json(name = "message")
    val message: Int? = null,

    @Json(name = "cnt")
    val cnt: Int? = null,

    @Json(name = "list")
    val list: List<DailyWeatherResponse?>? = null
) : Parcelable

fun GetDailyWeatherResponse.asDomain(): List<DailyWeather> {
    return list!!.map {
        DailyWeather(
            icon = when(it!!.weather!![0]!!.icon!!) {
                "01d" -> R.drawable.sunny
                "02d" -> R.drawable.pcloudy
                "03d", "04d" -> R.drawable.mcloudy
                "09d" -> R.drawable.rain
                "10d" -> R.drawable.lrain
                "11d" -> R.drawable.tstorm
                "13d" -> R.drawable.snow
                "50d", "50n" -> R.drawable.foggy
                "01n" -> R.drawable.moon
                "02n" -> R.drawable.pcloudy_0
                "03n", "04n" -> R.drawable.mcloudy_0
                "09n" -> R.drawable.rain_0
                "10n" -> R.drawable.lrain_0
                "11n" -> R.drawable.tstorm_0
                "13n" -> R.drawable.snow_1
                else -> R.drawable.turnado
            },
            temperature = it.main!!.temp!!.toInt().toString(),
            weather = it.weather!![0]!!.main!!,
            date = it.dt_txt!!
        )
    }
}


fun GetDailyWeatherResponse.asDatabase(): List<DatabaseDailyWeather> {
    return list!!.map {
        DatabaseDailyWeather(
            icon = when(it!!.weather!![0]!!.icon!!) {
                "01d" -> R.drawable.sunny
                "02d" -> R.drawable.pcloudy
                "03d", "04d" -> R.drawable.mcloudy
                "09d" -> R.drawable.rain
                "10d" -> R.drawable.lrain
                "11d" -> R.drawable.tstorm
                "13d" -> R.drawable.snow
                "50d", "50n" -> R.drawable.foggy
                "01n" -> R.drawable.moon
                "02n" -> R.drawable.pcloudy_0
                "03n", "04n" -> R.drawable.mcloudy_0
                "09n" -> R.drawable.rain_0
                "10n" -> R.drawable.lrain_0
                "11n" -> R.drawable.tstorm_0
                "13n" -> R.drawable.snow_1
                else -> R.drawable.turnado
            },
            temperature = it.main!!.temp!!.toInt().toString(),
            weather = it.weather!![0]!!.main!!,
            date = it.dt_txt!!
        )
    }
}