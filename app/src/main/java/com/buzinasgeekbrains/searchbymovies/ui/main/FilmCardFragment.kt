package com.buzinasgeekbrains.searchbymovies.ui.main

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.buzinasgeekbrains.searchbymovies.R
import com.buzinasgeekbrains.searchbymovies.ui.main.ViewModel.FilmCardViewModel

class FilmCardFragment : Fragment() {

    companion object {
        fun newInstance() = FilmCardFragment()
    }

    private lateinit var viewModel: FilmCardViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.film_card_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this).get(FilmCardViewModel::class.java)

    }


}