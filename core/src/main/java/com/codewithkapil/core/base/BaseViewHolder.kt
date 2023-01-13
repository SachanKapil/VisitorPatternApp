package com.codewithkapil.core.base

import android.view.View
import androidx.recyclerview.widget.RecyclerView

/**
 * All the view holders must extend this [BaseViewHolder].
 *
 * Author: @codewithkapil
 */
abstract class BaseViewHolder<in T>(view: View) : RecyclerView.ViewHolder(view) {

    abstract fun bind(item: T)
}