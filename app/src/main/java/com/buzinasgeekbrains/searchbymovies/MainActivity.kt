package com.buzinasgeekbrains.searchbymovies

import android.content.ContentValues.TAG
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import com.buzinasgeekbrains.searchbymovies.databinding.MainActivityBinding
import com.buzinasgeekbrains.searchbymovies.ui.main.ActorsFragment
import com.buzinasgeekbrains.searchbymovies.ui.main.FavoritesFragment
import com.buzinasgeekbrains.searchbymovies.ui.main.MainFragment

class MainActivity : AppCompatActivity() {

    private lateinit var binding: MainActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = MainActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container_for_fragments, MainFragment.newInstance())
                .commitNow()
        }

        binding.toolbar.toolbarMovieBtn.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container_for_fragments, MainFragment.newInstance())
                .commitNow()
        }

        binding.toolbar.toolbarPeopleBtn.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container_for_fragments, ActorsFragment.newInstance())
                .commitNow()
        }
        binding.toolbar.toolbarFavoriteBtn.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container_for_fragments, FavoritesFragment.newInstance())
                .commitNow()
        }

    }
}


