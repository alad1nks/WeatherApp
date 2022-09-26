package com.example.weatherapplication.network.domain

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
data class Main(

    @Json(name = "temp")
    val temp: Double?,

    @Json(name = "feels_like")
    val feels_like: Double?,

    @Json(name = "temp_min")
    val temp_min: Double?,

    @Json(name = "temp_max")
    val temp_max: Double?,

    @Json(name = "pressure")
    val pressure: Int?,

    @Json(name = "humidity")
    val humidity: Int?,

    ) : Parcelable
