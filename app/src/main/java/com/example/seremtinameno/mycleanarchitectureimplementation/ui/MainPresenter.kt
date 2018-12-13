package com.example.seremtinameno.mycleanarchitectureimplementation.ui

import com.example.domain.Location
import com.example.use_cases.GetLocations
import com.example.use_cases.RequestNewLocation
import org.jetbrains.anko.coroutines.experimental.bg

class MainPresenter(
    private var view:                   View?,
    private val getLocations:           GetLocations,
    private val requestNewLocation:     RequestNewLocation
) {
    interface View {
        fun renderLocations(locations: List<Location>)
    }

//    fun onCreate() = launch(UI) {
//        val locations = bg { getLocations() }.await()
//        view?.renderLocations(locations)
//    }

//    fun newLocationClicked() = launch(UI) {
//        val locations = bg { requestNewLocation() }.await()
//        view?.renderLocations(locations)
//    }

    fun onDestroy() {
        view = null
    }
}