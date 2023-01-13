package com.codewithkapil.home.domain.repo

import com.codewithkapil.home.domain.model.HomeVisitable

interface HomeRepo {
    suspend fun getHomeItemList(): List<HomeVisitable>
}