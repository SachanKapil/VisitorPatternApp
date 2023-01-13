package com.codewithkapil.home.data.datasource

import com.codewithkapil.core.di.IoDispatcher
import com.codewithkapil.home.domain.model.HomeArtistItem
import com.codewithkapil.home.domain.model.HomeMovieItem
import com.codewithkapil.home.domain.model.HomeSongItem
import com.codewithkapil.home.domain.model.HomeVisitable
import dagger.hilt.android.scopes.ViewModelScoped
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.withContext
import javax.inject.Inject

@ViewModelScoped
class HomeRemoteDataSource @Inject constructor(@IoDispatcher private val dispatcher: CoroutineDispatcher) {
    suspend fun getHomeItemList(): List<HomeVisitable> =
        withContext(dispatcher) {
            mutableListOf<HomeVisitable>().apply {
                this.add(HomeArtistItem("1", "Artist-1"))
                this.add(HomeMovieItem("2", "Movie-1"))
                this.add(HomeSongItem("3", "Song-1"))
                this.add(HomeArtistItem("4", "Artist-2"))
                this.add(HomeMovieItem("5", "Movie-2"))
                this.add(HomeSongItem("6", "Song-2"))
            }
        }
}