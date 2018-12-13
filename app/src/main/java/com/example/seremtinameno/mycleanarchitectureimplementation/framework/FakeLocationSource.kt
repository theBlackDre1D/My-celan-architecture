package com.example.seremtinameno.mycleanarchitectureimplementation.framework

import com.example.data.DeviceLocationSource
import com.example.domain.Location
import java.util.*
import kotlin.random.Random

class FakeLocationSource : DeviceLocationSource {

    private val random = Random(System.currentTimeMillis())

    override fun getDeviceLocation(): Location =
        Location(random.nextDouble() * 180 - 90,
            random.nextDouble() * 360 - 180, Date()
        )
}