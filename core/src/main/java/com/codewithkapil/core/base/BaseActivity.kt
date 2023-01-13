package com.codewithkapil.core.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding

/**
 * 1. [BaseActivity] which has DataBinding Support for inflating activity layouts.
 * 2. [initialize] method will be called as soon as [binding] will be initialized, so that child
 *    activities can initialize their class level variables and start performing task related to ui setup.
 * 3. All the activities must extend this [BaseActivity].
 *
 * Author: @codewithkapil
 */
abstract class BaseActivity<Binding : ViewBinding> : AppCompatActivity() {

    lateinit var binding: Binding

    abstract fun getViewBinding(): Binding

    abstract fun initialize()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = getViewBinding()
        setContentView(binding.root)
        initialize()
    }
}