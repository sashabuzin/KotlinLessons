package com.buzinasgeekbrains.searchbymovies

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.buzinasgeekbrains.searchbymovies.ui.main.FilmCardFragment
import com.buzinasgeekbrains.searchbymovies.ui.main.MainFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.main_container, FilmCardFragment.newInstance())
                .commitNow()
        }

    }
}