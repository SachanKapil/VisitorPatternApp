package com.codewithkapil.home.domain.usecase

import com.codewithkapil.home.domain.repo.HomeRepo
import dagger.hilt.android.scopes.ViewModelScoped
import javax.inject.Inject

@ViewModelScoped
class HomeUseCase @Inject constructor(private val homeRepo: HomeRepo) {
    suspend fun getHomeItemList() = homeRepo.getHomeItemList()
}