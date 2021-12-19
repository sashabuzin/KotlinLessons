package com.buzinasgeekbrains.searchbymovies

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.buzinasgeekbrains.searchbymovies.databinding.MainActivityBinding
import com.buzinasgeekbrains.searchbymovies.databinding.MainFragmentBinding
import com.buzinasgeekbrains.searchbymovies.ui.main.ActorsFragment
import com.buzinasgeekbrains.searchbymovies.ui.main.FavoritesFragment
import com.buzinasgeekbrains.searchbymovies.ui.main.FilmCardFragment
import com.buzinasgeekbrains.searchbymovies.ui.main.MainFragment

class MainActivity : AppCompatActivity() {

    private lateinit var binding: MainActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.main_container, MainFragment.newInstance())
                .commitNow()
        }
        binding = MainActivityBinding.inflate(layoutInflater)

//        findViewById<Button>(R.id.toolbar_favorite_btn).setOnClickListener { onStop() }

        binding.toolbar.toolbarMovieBtn.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.main_container, MainFragment.newInstance())
                .addToBackStack("")
                .commitNow()
        }
        binding.toolbar.toolbarPeopleBtn.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.main_container, ActorsFragment.newInstance())
                .commitNow()
        }
        binding.toolbar.toolbarFavoriteBtn.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.main_container, FavoritesFragment.newInstance())
                .commitNow()
        }




    }
}


