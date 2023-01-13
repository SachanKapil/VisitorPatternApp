package com.codewithkapil.home.ui.viewholder

import androidx.annotation.LayoutRes
import com.codewithkapil.home.R
import com.codewithkapil.home.databinding.LayoutHomeSongItemBinding
import com.codewithkapil.home.domain.model.HomeSongItem
import com.codewithkapil.home.domain.model.HomeVisitable
import com.codewithkapil.home.ui.base.HomeBaseViewHolder

class HomeSongViewHolder(private val binding: LayoutHomeSongItemBinding) :
    HomeBaseViewHolder(binding.root) {

    companion object {
        @LayoutRes
        val LAYOUT: Int = R.layout.layout_home_song_item
    }

    override fun bind(item: HomeVisitable) {
        if (item is HomeSongItem) {
            binding.tvName.text = item.songName
        }
    }
}