package com.codewithkapil.home.data.repo_impl

import com.codewithkapil.home.data.datasource.HomeRemoteDataSource
import com.codewithkapil.home.domain.repo.HomeRepo
import javax.inject.Inject

class HomeRepoImpl @Inject constructor(
    private val homeRemoteDataSource: HomeRemoteDataSource
) : HomeRepo {
    override suspend fun getHomeItemList() = homeRemoteDataSource.getHomeItemList()
}