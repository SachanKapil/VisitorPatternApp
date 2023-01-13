package com.codewithkapil.home.ui.viewholder

import android.view.View
import androidx.annotation.LayoutRes
import com.codewithkapil.home.domain.model.HomeArtistItem
import com.codewithkapil.home.domain.model.HomeMovieItem
import com.codewithkapil.home.domain.model.HomeSongItem
import com.codewithkapil.home.ui.base.HomeBaseViewHolder

interface HomeViewHolderVisitor {
    fun type(movieItem: HomeMovieItem): Int
    fun type(artistItem: HomeArtistItem): Int
    fun type(songItem: HomeSongItem): Int
    fun createViewHolder(view: View, @LayoutRes viewType: Int): HomeBaseViewHolder
}