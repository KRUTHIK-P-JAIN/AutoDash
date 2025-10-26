package com.example.autodash.di

import com.example.autodash.data.repository.CarRepositoryImpl
import com.example.autodash.domain.repository.CarRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindCarRepository(
        impl: CarRepositoryImpl
    ): CarRepository
}
