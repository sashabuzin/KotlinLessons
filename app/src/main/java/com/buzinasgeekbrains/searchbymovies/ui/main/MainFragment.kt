package com.buzinasgeekbrains.searchbymovies.ui.main

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.buzinasgeekbrains.searchbymovies.R
import com.buzinasgeekbrains.searchbymovies.databinding.MainFragmentBinding
import com.buzinasgeekbrains.searchbymovies.ui.main.ViewModel.MainViewModel

class MainFragment : Fragment() {

    private val binding: MainFragmentBinding by lazy {
        MainFragmentBinding.inflate(layoutInflater)
    }

    companion object {
        fun newInstance() = MainFragment()
    }

    private lateinit var viewModel: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.main_fragment, container, false)


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        binding.nowPlayingTextview.setOnClickListener { onStop() }
//        val observer = Observer<Any> { renderData(it) }
//        viewModel.getData().observe(viewLifecycleOwner, observer)

    }

    private fun renderData(data: Any) {

    }
}