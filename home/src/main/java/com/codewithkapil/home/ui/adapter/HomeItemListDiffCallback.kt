package com.codewithkapil.home.ui.adapter

import androidx.recyclerview.widget.DiffUtil
import com.codewithkapil.home.domain.model.HomeVisitable
import javax.inject.Inject

class HomeItemListDiffCallback @Inject constructor() : DiffUtil.ItemCallback<HomeVisitable>() {

    override fun areItemsTheSame(oldItem: HomeVisitable, newItem: HomeVisitable) =
        newItem.areItemsTheSame(oldItem)

    override fun areContentsTheSame(oldItem: HomeVisitable, newItem: HomeVisitable) =
        newItem.areContentsTheSame(oldItem)
}