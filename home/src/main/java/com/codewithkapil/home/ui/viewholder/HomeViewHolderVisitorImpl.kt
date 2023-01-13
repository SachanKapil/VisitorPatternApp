package com.codewithkapil.home.ui.viewholder

import android.view.View
import androidx.annotation.LayoutRes
import com.codewithkapil.home.databinding.LayoutHomeArtistItemBinding
import com.codewithkapil.home.databinding.LayoutHomeMovieItemBinding
import com.codewithkapil.home.databinding.LayoutHomeSongItemBinding
import com.codewithkapil.home.domain.model.HomeArtistItem
import com.codewithkapil.home.domain.model.HomeMovieItem
import com.codewithkapil.home.domain.model.HomeSongItem
import com.codewithkapil.home.ui.base.HomeBaseViewHolder
import javax.inject.Inject

class HomeViewHolderVisitorImpl @Inject constructor() : HomeViewHolderVisitor {

    override fun type(movieItem: HomeMovieItem) = HomeMovieViewHolder.LAYOUT

    override fun type(artistItem: HomeArtistItem) = HomeArtistViewHolder.LAYOUT

    override fun type(songItem: HomeSongItem) = HomeSongViewHolder.LAYOUT

    override fun createViewHolder(view: View, @LayoutRes viewType: Int): HomeBaseViewHolder =
        when (viewType) {
            HomeArtistViewHolder.LAYOUT -> HomeArtistViewHolder(
                LayoutHomeArtistItemBinding.bind(
                    view
                )
            )
            HomeMovieViewHolder.LAYOUT -> HomeMovieViewHolder(
                LayoutHomeMovieItemBinding.bind(
                    view
                )
            )
            HomeSongViewHolder.LAYOUT -> HomeSongViewHolder(
                LayoutHomeSongItemBinding.bind(
                    view
                )
            )
            else -> {
                throw IllegalStateException("IllegalStateException: Not Supported Home View Type")
            }
        }
}