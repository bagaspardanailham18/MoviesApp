package com.bagas.jetpackpro.moviesapp.injection

import android.content.Context
import com.bagas.jetpackpro.moviesapp.data.source.MovieCatalogueRepository
import com.bagas.jetpackpro.moviesapp.data.source.local.LocalDataSource
import com.bagas.jetpackpro.moviesapp.data.source.remote.RemoteDataSource

object Injection {
    fun provideRepository(context: Context): MovieCatalogueRepository {
        val remoteDataSource = RemoteDataSource.getInstance()
        val localDataSource = LocalDataSource.getInstance()
        return MovieCatalogueRepository.getInstance(remoteDataSource, localDataSource)
    }
}