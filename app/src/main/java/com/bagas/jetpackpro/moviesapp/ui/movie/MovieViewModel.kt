package com.bagas.jetpackpro.moviesapp.ui.movie

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.bagas.jetpackpro.moviesapp.data.source.MovieCatalogueRepository
import com.bagas.jetpackpro.moviesapp.data.source.local.MovieEntity
import com.bagas.jetpackpro.moviesapp.data.source.remote.MovieItem
import com.bagas.jetpackpro.moviesapp.utils.DataDummy

class MovieViewModel(private val repository: MovieCatalogueRepository) : ViewModel() {
    fun getMovies(): LiveData<List<MovieEntity>> = repository.getMovies()
}