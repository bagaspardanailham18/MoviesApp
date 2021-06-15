package com.bagas.jetpackpro.moviesapp.ui.tvshow

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.bagas.jetpackpro.moviesapp.data.source.MovieCatalogueRepository
import com.bagas.jetpackpro.moviesapp.data.source.local.MovieEntity
import com.bagas.jetpackpro.moviesapp.data.source.local.TvshowEntity
import com.bagas.jetpackpro.moviesapp.utils.DataDummy

class TvshowViewModel(private val repository: MovieCatalogueRepository) : ViewModel() {
    fun getTvshow(): LiveData<List<TvshowEntity>> = repository.getTvShows()
}