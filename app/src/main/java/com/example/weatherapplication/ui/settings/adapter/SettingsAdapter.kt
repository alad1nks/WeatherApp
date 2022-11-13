package com.example.weatherapplication.ui.settings.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.weatherapplication.R

class SettingsAdapter(private val onItemClicked: (String) -> Unit) : ListAdapter<String, SettingsAdapter.SettingsViewHolder>(DiffCallBack) {

    companion object DiffCallBack: DiffUtil.ItemCallback<String>() {
        override fun areItemsTheSame(oldItem: String, newItem: String): Boolean {
            return oldItem == newItem
        }

        override fun areContentsTheSame(oldItem: String, newItem: String): Boolean {
            return oldItem == newItem
        }
    }

    class SettingsViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val context: Context = view.context
        val findTextCity = view.findViewById<TextView>(R.id.settingsText)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SettingsViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return SettingsViewHolder(layoutInflater.inflate(R.layout.settings_item, parent, false))
    }

    override fun onBindViewHolder(holder: SettingsViewHolder, position: Int) {
        val item = getItem(position)
        holder.itemView.setOnClickListener {
            onItemClicked(item)
        }
        with(holder) {
            findTextCity.text = item
        }
    }

}