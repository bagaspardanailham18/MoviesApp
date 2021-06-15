package com.bagas.jetpackpro.moviesapp.data.source

import androidx.lifecycle.LiveData
import com.bagas.jetpackpro.moviesapp.data.source.local.DetailEntity
import com.bagas.jetpackpro.moviesapp.data.source.local.DetailTvshowEntity
import com.bagas.jetpackpro.moviesapp.data.source.local.MovieEntity
import com.bagas.jetpackpro.moviesapp.data.source.local.TvshowEntity

interface MovieCatalogueDataSource {
    fun getMovies(): LiveData<List<MovieEntity>>
    fun getDetailMovie(movieId: String): LiveData<DetailEntity>
    fun getTvShows(): LiveData<List<TvshowEntity>>
    fun getDetailTvShow(tvShowId: String): LiveData<DetailTvshowEntity>
}