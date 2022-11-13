package com.example.weatherapplication.ui.settings

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.weatherapplication.MainActivity
import com.example.weatherapplication.R
import com.example.weatherapplication.WeatherApp
import com.example.weatherapplication.databinding.ActivitySettingsBinding
import com.example.weatherapplication.preferences.AppPreference
import com.example.weatherapplication.ui.settings.adapter.SettingsAdapter
import com.example.weatherapplication.ui.settings.viewmodel.SettingsViewModel
import javax.inject.Inject


class SettingsActivity : AppCompatActivity() {

    @Inject
    lateinit var appPreference: AppPreference

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    private val viewModel by viewModels<SettingsViewModel> { viewModelFactory }

    private lateinit var binding: ActivitySettingsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySettingsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        (applicationContext as WeatherApp).appComponent.settingsComponent().create().inject(this)
        setSupportActionBar(binding.settingsToolbar)
    }

    override fun onStart() {
        super.onStart()
        val adapter = SettingsAdapter {
            val citySplit = it.split(',')[0]
            appPreference.setCity(citySplit)
            Toast.makeText(applicationContext, citySplit, Toast.LENGTH_SHORT).show()
            val intent = Intent(this, MainActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
            startActivity(intent)
        }
        binding.recyclerSettings.adapter = adapter
        binding.recyclerSettings.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)

        viewModel.cities.observe(this) {
            it?.let {
                adapter.submitList(it)
            }
        }
    }


    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.settings_toolbar_items, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.itemId
        if (id == R.id.exit) {
            finish()
            return true
        }
        return super.onOptionsItemSelected(item)
    }


}