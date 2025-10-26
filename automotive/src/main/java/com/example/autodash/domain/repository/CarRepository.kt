package com.example.autodash.domain.repository

import com.example.autodash.domain.model.CarStatus
import kotlinx.coroutines.flow.Flow

interface CarRepository {
    fun getCarStatus(): Flow<CarStatus>
}
