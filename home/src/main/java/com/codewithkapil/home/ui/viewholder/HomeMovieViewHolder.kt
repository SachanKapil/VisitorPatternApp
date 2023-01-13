package com.codewithkapil.home.ui.viewholder

import androidx.annotation.LayoutRes
import com.codewithkapil.home.R
import com.codewithkapil.home.databinding.LayoutHomeMovieItemBinding
import com.codewithkapil.home.domain.model.HomeMovieItem
import com.codewithkapil.home.domain.model.HomeVisitable
import com.codewithkapil.home.ui.base.HomeBaseViewHolder


class HomeMovieViewHolder(private val binding: LayoutHomeMovieItemBinding) :
    HomeBaseViewHolder(binding.root) {

    companion object {
        @LayoutRes
        val LAYOUT: Int = R.layout.layout_home_movie_item
    }

    override fun bind(item: HomeVisitable) {
        if (item is HomeMovieItem) {
            binding.tvName.text = item.movieName
        }
    }
}