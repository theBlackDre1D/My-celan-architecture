package com.example.use_cases

import com.example.data.LocationsRepository
import com.example.domain.Location


class GetLocations(private val locationsRepository: LocationsRepository) {

    operator fun invoke(): List<Location> = locationsRepository.getSavedLocations()

}