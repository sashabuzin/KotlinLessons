package com.buzinasgeekbrains.searchbymovies.ui.main.ViewModel

sealed class AppState {
    data class Success(val data: Any) : AppState()
    object Loading : AppState()
}
