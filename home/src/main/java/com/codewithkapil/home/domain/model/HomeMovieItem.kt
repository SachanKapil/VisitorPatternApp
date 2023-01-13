package com.codewithkapil.home.domain.model

import com.codewithkapil.home.ui.viewholder.HomeViewHolderVisitor

data class HomeMovieItem(val id: String, val movieName: String) : HomeVisitable {
    override fun type(visitor: HomeViewHolderVisitor) = visitor.type(this)
    override fun areItemsTheSame(oldItem: HomeVisitable) = (oldItem as HomeMovieItem).id == this.id
    override fun areContentsTheSame(oldItem: HomeVisitable) = oldItem == this
}