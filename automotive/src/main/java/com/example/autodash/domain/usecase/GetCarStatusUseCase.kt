package com.example.autodash.domain.usecase

import com.example.autodash.domain.repository.CarRepository
import javax.inject.Inject

class GetCarStatusUseCase @Inject constructor(
    private val repository: CarRepository
) {
    operator fun invoke() = repository.getCarStatus()
}
