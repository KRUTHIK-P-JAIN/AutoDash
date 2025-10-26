package com.example.autodash.presentation.dashboard

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.autodash.domain.model.CarStatus
import com.example.autodash.domain.usecase.GetCarStatusUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class DashboardViewModel @Inject constructor(
    private val getCarStatusUseCase: GetCarStatusUseCase
) : ViewModel() {

    private val _uiState = MutableStateFlow(CarStatus(0, 0, 0))
    val uiState: StateFlow<CarStatus> = _uiState

    init {
        viewModelScope.launch {
            getCarStatusUseCase().collectLatest {
                _uiState.value = it
            }
        }
    }
}
