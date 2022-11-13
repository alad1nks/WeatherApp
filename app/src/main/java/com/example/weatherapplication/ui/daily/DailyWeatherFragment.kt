package com.example.weatherapplication.ui.daily

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.weatherapplication.R
import com.example.weatherapplication.WeatherApp
import com.example.weatherapplication.databinding.FragmentDailyWeatherBinding
import com.example.weatherapplication.ui.daily.adapter.DailyWeatherAdapter
import com.example.weatherapplication.ui.daily.viewmodel.DailyWeatherViewModel
import javax.inject.Inject

class DailyWeatherFragment : Fragment(R.layout.fragment_daily_weather) {
    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    private val viewModel by viewModels<DailyWeatherViewModel> { viewModelFactory }

    private var _binding: FragmentDailyWeatherBinding? = null

    private val binding get() = _binding!!

    override fun onAttach(context: Context) {
        super.onAttach(context)

        (requireActivity().application as WeatherApp).appComponent.dailyWeatherComponent().create().inject(this)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentDailyWeatherBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val adapter = DailyWeatherAdapter()
        binding.recyclerDailyWeather.adapter = adapter
        binding.recyclerDailyWeather.layoutManager = LinearLayoutManager(context, RecyclerView.VERTICAL, false)

        viewModel.dailyWeather.observe(viewLifecycleOwner) {
            it?.let {
                adapter.submitList(it)
            }
        }
    }
    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }
}