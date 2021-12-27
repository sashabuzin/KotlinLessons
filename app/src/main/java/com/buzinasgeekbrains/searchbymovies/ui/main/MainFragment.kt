package com.buzinasgeekbrains.searchbymovies.ui.main

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.buzinasgeekbrains.searchbymovies.databinding.MainFragmentBinding
import com.buzinasgeekbrains.searchbymovies.ui.main.ViewModel.AppState
import com.buzinasgeekbrains.searchbymovies.ui.main.ViewModel.MainViewModel
import com.google.android.material.snackbar.Snackbar

class MainFragment : Fragment() {

    companion object {
        fun newInstance() = MainFragment()
    }

    private lateinit var nowPlayingRecyclerView: RecyclerView
    private lateinit var popularRecyclerView: RecyclerView
    private lateinit var topRatedRecyclerView: RecyclerView
    private lateinit var upcomingRecyclerView: RecyclerView
    private lateinit var appState: AppState

    private var _binding: MainFragmentBinding? = null
    private val binding get() = _binding!!

    private lateinit var viewModel: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = MainFragmentBinding.inflate(inflater, container, false)
        nowPlayingRecyclerView = binding.nowPlayingRv
        popularRecyclerView = binding.popularRv
        topRatedRecyclerView = binding.topRatedRv
        upcomingRecyclerView = binding.upcomingRv
        appState = AppState.Loading
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        viewModel.getLiveData().observe(viewLifecycleOwner, {
            render(appState)
        })

//        val observer = Observer<Any> { renderData(it) }
//        viewModel.getData().observe(viewLifecycleOwner, observer)

    }

    private fun render (state: AppState) {
        when (state) {
            is AppState.Success -> {
                binding.cardFilmPlug1.spinKitFilmCard.visibility = View.GONE
                binding.cardFilmPlug2.spinKitFilmCard.visibility = View.GONE
                binding.cardFilmPlug3.spinKitFilmCard.visibility = View.GONE
                binding.cardFilmPlug4.spinKitFilmCard.visibility = View.GONE
            }
            is AppState.Loading -> {
                binding.cardFilmPlug1.spinKitFilmCard.visibility = View.VISIBLE
                binding.cardFilmPlug2.spinKitFilmCard.visibility = View.VISIBLE
                binding.cardFilmPlug3.spinKitFilmCard.visibility = View.VISIBLE
                binding.cardFilmPlug4.spinKitFilmCard.visibility = View.VISIBLE
            }
            is AppState.Error -> {
                Snackbar.make(binding.root, state.error.toString(), Snackbar.LENGTH_INDEFINITE)
                    .setAction("Попробовать снова") {
//                    TODO reload
                }

            }
        }
    }

    private fun renderData(data: Any) {

    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}