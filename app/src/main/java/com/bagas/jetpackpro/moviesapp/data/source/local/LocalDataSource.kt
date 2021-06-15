package com.bagas.jetpackpro.moviesapp.data.source.local

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.bagas.jetpackpro.moviesapp.utils.DataDummy
import com.bagas.jetpackpro.moviesapp.utils.DetailDataDummy

class LocalDataSource {

    private val _movies = MutableLiveData<List<MovieEntity>>()
    val movies: LiveData<List<MovieEntity>> = _movies

    private val _tvshows = MutableLiveData<List<TvshowEntity>>()
    val tvshows: LiveData<List<TvshowEntity>> = _tvshows

    private val _detailMovies = MutableLiveData<List<DetailEntity>>()
    val detailMovies: LiveData<List<DetailEntity>> = _detailMovies

    private val _detailTvshows = MutableLiveData<List<DetailTvshowEntity>>()
    val detailTvshows: LiveData<List<DetailTvshowEntity>> = _detailTvshows

    companion object {
        private const val TAG = "LocalDataSource"

        @Volatile
        private var instance: LocalDataSource? = null

        fun getInstance(): LocalDataSource =
                instance ?: synchronized(this) {
                    instance ?: LocalDataSource().apply {
                        instance = this
                    }
                }
    }

    fun getMovies() {
        val dataDummyMovies = DataDummy.generateDummyMovies()
        _movies.value = dataDummyMovies
    }

    fun getTvshows() {
        val dataDummyTvshows = DataDummy.generateDummyTvshow()
        _tvshows.value = dataDummyTvshows
    }

    fun getDetailMovies() {
        val dummyDetailMovies = DetailDataDummy.generateDetailDummyMovies()
        _detailMovies.value = dummyDetailMovies
    }

    fun getDetailTvshows() {
        val dummyDetailTvshows = DetailDataDummy.generateDetailDummyTvshow()
        _detailTvshows.value = dummyDetailTvshows
    }

}