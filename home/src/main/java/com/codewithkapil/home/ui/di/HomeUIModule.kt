package com.codewithkapil.home.ui.di

import com.codewithkapil.home.ui.viewholder.HomeViewHolderVisitor
import com.codewithkapil.home.ui.viewholder.HomeViewHolderVisitorImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@Module
@InstallIn(ActivityComponent::class)
abstract class HomeUIModule {
    @Binds
    abstract fun provideHomeViewHolderVisitor(homeViewHolderVisitor: HomeViewHolderVisitorImpl): HomeViewHolderVisitor
}