package com.buzinasgeekbrains.searchbymovies

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.buzinasgeekbrains.searchbymovies.databinding.MainActivityBinding
import com.buzinasgeekbrains.searchbymovies.ui.main.ActorsListFragment
import com.buzinasgeekbrains.searchbymovies.ui.main.FavoritesFragment
import com.buzinasgeekbrains.searchbymovies.ui.main.MainFragment

class MainActivity : AppCompatActivity() {

        private val binding: MainActivityBinding by lazy {
            MainActivityBinding.inflate(layoutInflater)
}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        binding = MainActivityBinding.inflate(layoutInflater)
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
                .replace(R.id.container_for_fragments, ActorsListFragment.newInstance())
                .commitNow()
        }
        binding.toolbar.toolbarFavoriteBtn.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container_for_fragments, FavoritesFragment.newInstance())
                .commitNow()
        }

    }
}


