package com.example.weatherapplication.network.domain

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
data class Sys(

    @Json(name = "type")
    val type: Int? = null,

    @Json(name = "id")
    val id: Long? = null,

    @Json(name = "country")
    val country: String? = null,

    @Json(name = "sunrise")
    val sunrise: Long? = null,

    @Json(name = "sunset")
    val sunset: Long? = null,

    ) : Parcelable