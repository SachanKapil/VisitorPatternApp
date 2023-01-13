package com.codewithkapil.home.domain.model

import com.codewithkapil.home.ui.viewholder.HomeViewHolderVisitor

data class HomeArtistItem(val id: String, val artistName: String) : HomeVisitable {
    override fun type(visitor: HomeViewHolderVisitor) = visitor.type(this)
    override fun areItemsTheSame(oldItem: HomeVisitable) = (oldItem as HomeArtistItem).id == this.id
    override fun areContentsTheSame(oldItem: HomeVisitable) = oldItem == this
}