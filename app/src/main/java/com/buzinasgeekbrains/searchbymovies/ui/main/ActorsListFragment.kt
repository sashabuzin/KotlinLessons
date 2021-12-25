package com.buzinasgeekbrains.searchbymovies.ui.main

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.buzinasgeekbrains.searchbymovies.R
import com.buzinasgeekbrains.searchbymovies.ui.main.ViewModel.ActorsViewModel

class ActorsListFragment : Fragment() {

    companion object {
        fun newInstance() = ActorsListFragment()
    }

    private lateinit var viewModel: ActorsViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.actors_list_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this).get(ActorsViewModel::class.java)
    }

}