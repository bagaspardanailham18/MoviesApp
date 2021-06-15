package com.bagas.jetpackpro.moviesapp.ui.detail.movie

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.bagas.jetpackpro.moviesapp.data.source.MovieCatalogueRepository
import com.bagas.jetpackpro.moviesapp.data.source.local.DetailEntity
import com.bagas.jetpackpro.moviesapp.data.source.local.DetailTvshowEntity

class DetailMovieViewModel(private val repository: MovieCatalogueRepository) : ViewModel() {

    lateinit var movieId: String

    fun setSelectedMovie(movieId: String) {
        this.movieId = movieId
    }

    fun getMovieDetail(): LiveData<DetailEntity> = repository.getDetailMovie(movieId)
}