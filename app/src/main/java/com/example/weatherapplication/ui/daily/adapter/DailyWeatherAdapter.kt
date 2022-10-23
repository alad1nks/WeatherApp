package com.example.weatherapplication.ui.daily.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.weatherapplication.R
import com.example.weatherapplication.domain.DailyWeather

class DailyWeatherAdapter : ListAdapter<DailyWeather, DailyWeatherAdapter.DailyWeatherViewHolder>(DiffCallBack) {

    companion object DiffCallBack: DiffUtil.ItemCallback<DailyWeather>() {
        override fun areItemsTheSame(oldItem: DailyWeather, newItem: DailyWeather): Boolean {
            return oldItem.date == newItem.date
        }

        override fun areContentsTheSame(oldItem: DailyWeather, newItem: DailyWeather): Boolean {
            return oldItem.weather == newItem.weather
        }
    }

    class DailyWeatherViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val context: Context = view.context
        val findTextDailyWeather = view.findViewById<TextView>(R.id.textDailyWeather)
        val findTextDailyTemp = view.findViewById<TextView>(R.id.textDailyTemp)
        val findDailyWeather = view.findViewById<ImageView>(R.id.imageDailyWeather)
        val findTextDay = view.findViewById<TextView>(R.id.textDay)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DailyWeatherViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return DailyWeatherViewHolder(layoutInflater.inflate(R.layout.daily_weather_item, parent, false))
    }

    override fun onBindViewHolder(holder: DailyWeatherViewHolder, position: Int) {
        val item = getItem(position)
        with(holder) {
            findTextDailyTemp.text = item.temperature + "°"
            findTextDailyWeather.text = item.weather
            findTextDay.text = item.date
            findDailyWeather.setImageResource(item.icon)
        }
    }

}