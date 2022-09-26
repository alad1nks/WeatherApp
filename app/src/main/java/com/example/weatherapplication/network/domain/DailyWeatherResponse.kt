package com.example.weatherapplication.network.domain

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
data class DailyWeatherResponse(

    @Json(name = "dt")
    val dt: Long?,

    @Json(name = "main")
    val main: Main?,

    @Json(name= "weather")
    val weather: List<Weather?>?,

    @Json(name = "clouds")
    val clouds: Clouds? = null,

    @Json(name = "wind")
    val wind: Wind? = null,

    @Json(name = "visibility")
    val visibility: Int? = null,

    @Json(name = "dt_txt")
    val dt_txt: String? = null

) : Parcelable
