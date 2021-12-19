package com.buzinasgeekbrains.searchbymovies.ui.main

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import com.buzinasgeekbrains.searchbymovies.R
import com.buzinasgeekbrains.searchbymovies.databinding.MainFragmentBinding
import com.buzinasgeekbrains.searchbymovies.ui.main.ViewModel.MainViewModel

class MainFragment : Fragment() {

    private lateinit var binding: MainFragmentBinding

    companion object {
        fun newInstance() = MainFragment()
    }

    private lateinit var viewModel: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.main_fragment, container, false)
        binding = MainFragmentBinding.inflate(layoutInflater)
        binding.mainContainer.setOnClickListener { onStop() }

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
//        val observer = Observer<Any> { renderData(it) }
//        viewModel.getData().observe(viewLifecycleOwner, observer)

    }

    private fun renderData(data: Any) {

    }

    override fun onDestroyView() {
        super.onDestroyView()
    }

}