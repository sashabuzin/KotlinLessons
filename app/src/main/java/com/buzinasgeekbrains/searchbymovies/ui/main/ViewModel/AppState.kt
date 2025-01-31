package com.buzinasgeekbrains.searchbymovies.ui.main.ViewModel

sealed class AppState {
    data class Success(val data: Any) : AppState()
    data class Error(val error: Throwable) : AppState()
    object Loading : AppState()
}
