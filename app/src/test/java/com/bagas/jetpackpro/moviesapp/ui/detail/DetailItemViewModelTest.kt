package com.bagas.jetpackpro.moviesapp.ui.detail

import com.bagas.jetpackpro.moviesapp.utils.DataDummy
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class DetailItemViewModelTest {

    private lateinit var viewModel: DetailItemViewModel
    private val dummyMovie = DataDummy.GenerateDummyMovies()[0]
    private val dummyTvshow = DataDummy.GenerateDummyTvshow()[0]
    private val movieId = dummyMovie.movieId
    private val tvshowId = dummyTvshow.tvShowId

    @Before
    fun setUp() {
        viewModel = DetailItemViewModel()
        viewModel.setSelectedMovie(movieId)
        viewModel.setSelectedTvshow(tvshowId)
    }

    @Test
    fun getMovie() {
        viewModel.setSelectedMovie(dummyMovie.movieId)
        val movieEntity = viewModel.getMovie()
        assertNotNull(movieEntity)
        assertEquals(dummyMovie.movieId, movieEntity?.movieId)
        assertEquals(dummyMovie.title, movieEntity?.title)
        assertEquals(dummyMovie.overview, movieEntity?.overview)
        assertEquals(dummyMovie.hour, movieEntity?.hour)
        assertEquals(dummyMovie.rating, movieEntity?.rating)
        assertEquals(dummyMovie.director, movieEntity?.director)
        assertEquals(dummyMovie.stars, movieEntity?.stars)
        assertEquals(dummyMovie.genre, movieEntity?.genre)
        assertEquals(dummyMovie.linkTrailer, movieEntity?.linkTrailer)
        assertEquals(dummyMovie.poster, movieEntity?.poster)
    }

    @Test
    fun getTvshow() {
        viewModel.setSelectedTvshow(dummyTvshow.tvShowId)
        val tvshowEntity = viewModel.getTvshow()
        assertNotNull(tvshowEntity)
        assertEquals(dummyTvshow.tvShowId, tvshowEntity?.tvShowId)
        assertEquals(dummyTvshow.title, tvshowEntity?.title)
        assertEquals(dummyTvshow.overview, tvshowEntity?.overview)
        assertEquals(dummyTvshow.seasons, tvshowEntity?.seasons)
        assertEquals(dummyTvshow.rating, tvshowEntity?.rating)
        assertEquals(dummyTvshow.director, tvshowEntity?.director)
        assertEquals(dummyTvshow.stars, tvshowEntity?.stars)
        assertEquals(dummyTvshow.genre, tvshowEntity?.genre)
        assertEquals(dummyTvshow.linkTrailer, tvshowEntity?.linkTrailer)
        assertEquals(dummyTvshow.poster, tvshowEntity?.poster)
    }
}