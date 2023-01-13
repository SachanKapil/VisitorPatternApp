package com.codewithkapil.home.data.di

import com.codewithkapil.home.data.repo_impl.HomeRepoImpl
import com.codewithkapil.home.domain.repo.HomeRepo
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
abstract class HomeDataModule {
    @Binds
    abstract fun provideHomeRepo(homeRepo: HomeRepoImpl): HomeRepo
}