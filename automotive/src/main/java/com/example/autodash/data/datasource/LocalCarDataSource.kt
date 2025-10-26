package com.example.autodash.data.datasource

import com.example.autodash.domain.model.CarStatus
import jakarta.inject.Inject
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class LocalCarDataSource @Inject constructor() {
    fun observeCarStatus(): Flow<CarStatus> = flow {
        var speed = 0
        while (true) {
            emit(CarStatus(speed = speed, fuelLevel = 80, outsideTemp = 26))
            speed = (speed + 10) % 200
            delay(1500)
        }
    }
}
