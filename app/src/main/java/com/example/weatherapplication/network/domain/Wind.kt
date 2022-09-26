package com.example.weatherapplication.network.domain

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
data class Wind(

    @Json(name = "speed")
    val speed: Double?,

    @Json(name = "deg")
    val deg: Int?
) : Parcelable
