package com.codewithkapil.home.ui

import androidx.lifecycle.viewModelScope
import com.codewithkapil.core.base.BaseViewModel
import com.codewithkapil.home.domain.model.HomeVisitable
import com.codewithkapil.home.domain.usecase.HomeUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(private val homeUseCase: HomeUseCase) : BaseViewModel() {

    private val _homeItemListStateFlow = MutableStateFlow<List<HomeVisitable>>(emptyList())
    val homeItemListStateFlow = _homeItemListStateFlow.asStateFlow()

    init {
        getHomeItemList()
    }

    private fun getHomeItemList() {
        viewModelScope.launch {
            _homeItemListStateFlow.value = homeUseCase.getHomeItemList()
        }
    }

}