package com.example.weatherapplication.network.domain

import android.os.Parcelable
import com.example.weatherapplication.R
import com.example.weatherapplication.database.model.DatabaseCurrentWeather
import com.example.weatherapplication.domain.CurrentWeather
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlinx.parcelize.Parcelize
import kotlin.math.ceil

@Parcelize
@JsonClass(generateAdapter = true)
data class GetCurrentWeatherResponse(

    @Json(name = "coord")
    val coord: Coord? = null,

    @Json(name = "weather")
    val weather: List<Weather?>? = null,

    @Json(name = "base")
    val base: String? = null,

    @Json(name = "main")
    val main: Main? = null,

    @Json(name = "visibility")
    val visibility: Int? = null,

    @Json(name = "wind")
    val wind: Wind? = null,

    @Json(name = "clouds")
    val clouds: Clouds? = null,

//    @Json(name = "rain")
//    val rain: Rain? = null,
//
//    @Json(name = "snow")
//    val snow: Snow? = null,

    @Json(name = "dt")
    val dt: Long? = null,

    @Json(name = "sys")
    val sys: Sys? = null,

    @Json(name = "timezone")
    val timezone: Int? = null,

    @Json(name = "id")
    val id: Long? = null,

    @Json(name = "name")
    val name: String? = null,

    @Json(name = "cod")
    val cod: Int? = null,

    ) : Parcelable

fun GetCurrentWeatherResponse.asDomain(): CurrentWeather {
    return CurrentWeather(
        city = "Almaty",
        icon = when(weather!![0]!!.icon!!) {
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
        temperature = main!!.temp!!.toInt().toString() + "°C",
        weather = weather[0]!!.main!!,
        wind = ceil(wind!!.speed!!).toInt().toString() + "km/h",
        humidity = main.humidity!!.toString() + "%",
        perception = ceil(main.feels_like!!).toInt().toString() + "°C"
    )
}

fun GetCurrentWeatherResponse.asDatabase(): DatabaseCurrentWeather {
    return DatabaseCurrentWeather(
        city = "Almaty",
        icon = when(weather!![0]!!.icon!!) {
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
        temperature = main!!.temp!!.toInt().toString() + "°C",
        weather = weather[0]!!.main!!,
        wind = ceil(wind!!.speed!!).toInt().toString() + "km/h",
        humidity = main.humidity!!.toString() + "%",
        perception = ceil(main.feels_like!!).toInt().toString() + "°C"
    )
}