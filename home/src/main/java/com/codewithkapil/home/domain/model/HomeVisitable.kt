package com.codewithkapil.home.domain.model

import com.codewithkapil.home.ui.viewholder.HomeViewHolderVisitor

interface HomeVisitable {
    fun type(visitor: HomeViewHolderVisitor): Int
    fun areItemsTheSame(oldItem: HomeVisitable): Boolean
    fun areContentsTheSame(oldItem: HomeVisitable): Boolean
}