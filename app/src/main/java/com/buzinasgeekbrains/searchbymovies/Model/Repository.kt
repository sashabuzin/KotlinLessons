package com.buzinasgeekbrains.searchbymovies.Model

interface Repository {
    fun getFilmFromServer() : Film
    fun getActorFromRepository() : Actor
}