package com.example.weatherapplication.ui.current

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import com.example.weatherapplication.WeatherApp
import com.example.weatherapplication.databinding.FragmentCurrentWeatherBinding
import com.example.weatherapplication.ui.current.viewmodel.CurrentWeatherViewModel
import javax.inject.Inject

class CurrentWeatherFragment : Fragment() {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    private val viewModel by viewModels<CurrentWeatherViewModel> { viewModelFactory }

    private var _binding: FragmentCurrentWeatherBinding? = null

    private val binding get() = _binding!!


    override fun onAttach(context: Context) {
        super.onAttach(context)
        (requireActivity().application as WeatherApp).appComponent.currentWeatherComponent().create().inject(this)
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentCurrentWeatherBinding.inflate(inflater, container, false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.currentWeather.observe(viewLifecycleOwner) {
            it?.let {
                binding.currentWeatherItem.textCurrentWeather.text = it.weather
                binding.currentWeatherItem.textCurrentCity.text = it.city
                binding.currentWeatherItem.textCurrentTemp.text = it.temperature
                binding.currentWeatherItem.imageCurrentWeather.setImageResource(it.icon)
                binding.infoItem.windSpeed.text = it.wind
                binding.infoItem.humidity.text = it.humidity
                binding.infoItem.perception.text = it.perception
            }
        }
    }

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }
}