package com.example.seremtinameno.mycleanarchitectureimplementation.framework

import com.example.data.LocationPersistenceSource
import com.example.domain.Location


class InMemoryLocationPersistenceSource : LocationPersistenceSource {

    private var locations: List<Location> = emptyList()

    override fun getPersistedLocations(): List<Location> = locations

    override fun saveNewLocation(location: Location) {
        locations += location
    }
}