package com.codewithkapil.home.ui.viewholder

import androidx.annotation.LayoutRes
import com.codewithkapil.home.R
import com.codewithkapil.home.databinding.LayoutHomeArtistItemBinding
import com.codewithkapil.home.domain.model.HomeArtistItem
import com.codewithkapil.home.domain.model.HomeVisitable
import com.codewithkapil.home.ui.base.HomeBaseViewHolder

class HomeArtistViewHolder(private val binding: LayoutHomeArtistItemBinding) :
    HomeBaseViewHolder(binding.root) {

    companion object {
        @LayoutRes
        val LAYOUT: Int = R.layout.layout_home_artist_item
    }

    override fun bind(item: HomeVisitable) {
        if (item is HomeArtistItem) {
            binding.tvName.text = item.artistName
        }
    }
}