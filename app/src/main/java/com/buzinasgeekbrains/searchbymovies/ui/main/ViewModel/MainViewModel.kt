package com.buzinasgeekbrains.searchbymovies.ui.main.ViewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel(private val liveDataToObserve: MutableLiveData<AppState> = MutableLiveData()) :
    ViewModel() {

    fun getLiveData() = liveDataToObserve
    fun getCardInfo() = getDataFromNetworkSource()

    private fun getDataFromNetworkSource() {
        TODO("Not yet implemented")
        liveDataToObserve.value = AppState.Loading
        Thread {


            liveDataToObserve.postValue(AppState.Success(Any()))
        }.start()
    }

}