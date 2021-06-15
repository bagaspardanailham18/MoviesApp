package com.bagas.jetpackpro.moviesapp.ui.detail.tvshow

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.bagas.jetpackpro.moviesapp.data.source.MovieCatalogueRepository
import com.bagas.jetpackpro.moviesapp.data.source.local.DetailTvshowEntity

class DetailTvshowViewModel(private val repository: MovieCatalogueRepository) : ViewModel() {

    lateinit var tvshowId: String

    fun setSelectedTvshow(tvshowId: String) {
        this.tvshowId = tvshowId
    }

    fun getTvshowDetail(): LiveData<DetailTvshowEntity> = repository.getDetailTvShow(tvshowId)
}