package com.codewithkapil.home.domain.model

import com.codewithkapil.home.ui.viewholder.HomeViewHolderVisitor

data class HomeSongItem(val id: String, val songName: String) : HomeVisitable {
    override fun type(visitor: HomeViewHolderVisitor) = visitor.type(this)
    override fun areItemsTheSame(oldItem: HomeVisitable) = (oldItem as HomeSongItem).id == this.id
    override fun areContentsTheSame(oldItem: HomeVisitable) = oldItem == this
}