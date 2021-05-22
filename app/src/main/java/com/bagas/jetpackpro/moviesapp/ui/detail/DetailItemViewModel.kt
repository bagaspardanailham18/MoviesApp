package com.bagas.jetpackpro.moviesapp.ui.detail

import androidx.lifecycle.ViewModel
import com.bagas.jetpackpro.moviesapp.data.MovieEntity
import com.bagas.jetpackpro.moviesapp.data.TvshowEntity
import com.bagas.jetpackpro.moviesapp.utils.DataDummy

class DetailItemViewModel : ViewModel() {
    private lateinit var movieId: String
    private lateinit var tvShowId: String

    fun setSelectedMovie(movieId: String) {
        this.movieId = movieId
    }

    fun getMovie(): MovieEntity? {
        var movie: MovieEntity? = null
        for (movieEntity in DataDummy.GenerateDummyMovies()) {
            if (movieEntity.movieId == movieId) {
                movie = movieEntity
            }
        }
        return movie
    }

    fun setSelectedTvshow(tvshowId: String) {
        this.tvShowId = tvshowId
    }

    fun getTvshow(): TvshowEntity? {
        var tvshow: TvshowEntity? = null
        for (tvshowEntity in DataDummy.GenerateDummyTvshow()) {
            if (tvshowEntity.tvShowId == tvShowId) {
                tvshow = tvshowEntity
            }
        }
        return tvshow
    }
}