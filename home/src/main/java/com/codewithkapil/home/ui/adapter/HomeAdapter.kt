package com.codewithkapil.home.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.codewithkapil.home.domain.model.HomeVisitable
import com.codewithkapil.home.ui.base.HomeBaseViewHolder
import com.codewithkapil.home.ui.viewholder.HomeViewHolderVisitor
import javax.inject.Inject

class HomeAdapter @Inject constructor(
    private val visitor: HomeViewHolderVisitor,
    diffCallback: HomeItemListDiffCallback
) : ListAdapter<HomeVisitable, HomeBaseViewHolder>(diffCallback) {

    override fun getItemViewType(position: Int): Int {
        return currentList[position].type(visitor)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeBaseViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(viewType, parent, false)
        return visitor.createViewHolder(view, viewType)
    }

    override fun onBindViewHolder(holder: HomeBaseViewHolder, position: Int) {
        holder.bind(currentList[position])
    }
}
