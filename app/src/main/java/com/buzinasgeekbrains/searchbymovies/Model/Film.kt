package com.buzinasgeekbrains.searchbymovies.Model

import java.util.*

    data class Film(
        val id: Int, val name: String, val date: Date, val genre: String,
        var isFavorite: Boolean, val budget: Int, val revenue: Int,
        val rating: Double, val description: String, val cast: String,
        val similarMovies: String, val trailer: String
    )