package com.example.autodash.data.repository

import com.example.autodash.data.datasource.LocalCarDataSource
import com.example.autodash.domain.model.CarStatus
import com.example.autodash.domain.repository.CarRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class CarRepositoryImpl @Inject constructor(
    private val localDataSource: LocalCarDataSource
) : CarRepository {

    override fun getCarStatus(): Flow<CarStatus> = localDataSource.observeCarStatus()
}
