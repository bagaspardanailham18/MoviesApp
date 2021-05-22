package com.bagas.jetpackpro.moviesapp.ui.movie

import androidx.lifecycle.ViewModel
import com.bagas.jetpackpro.moviesapp.data.MovieEntity
import com.bagas.jetpackpro.moviesapp.utils.DataDummy

class MovieViewModel : ViewModel() {
    fun getMovies(): List<MovieEntity> = DataDummy.GenerateDummyMovies()
}