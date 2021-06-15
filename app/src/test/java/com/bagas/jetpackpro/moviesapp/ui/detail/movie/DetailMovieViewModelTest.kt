package com.bagas.jetpackpro.moviesapp.ui.detail.movie

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import com.bagas.jetpackpro.moviesapp.data.source.MovieCatalogueRepository
import com.bagas.jetpackpro.moviesapp.data.source.local.DetailEntity
import com.bagas.jetpackpro.moviesapp.utils.DetailDataDummy
import com.nhaarman.mockitokotlin2.verify
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before
import org.junit.Rule
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito.`when`
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class DetailMovieViewModelTest {
    private lateinit var viewModel: DetailMovieViewModel
    private val dummyDetailMovie = DetailDataDummy.generateDetailDummyMovies()[0]
    private val movieId = dummyDetailMovie.id.toString()

    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    @Mock
    private lateinit var movieCatalogueRepository: MovieCatalogueRepository

    @Mock
    private lateinit var detailMovieObserver: Observer<DetailEntity>

    @Before
    fun setDetailMovieSetUp() {
        viewModel = DetailMovieViewModel(movieCatalogueRepository)
        viewModel.setSelectedMovie(movieId)
    }

    @Test
    fun getMovieDetail() {
        val movies = MutableLiveData<DetailEntity>()
        movies.value = dummyDetailMovie

        `when`(movieCatalogueRepository.getDetailMovie(movieId)).thenReturn(movies)
        val detailMovieEntity = viewModel.getMovieDetail().value as DetailEntity
        verify(movieCatalogueRepository).getDetailMovie(movieId)
        assertNotNull(detailMovieEntity)
        assertEquals(dummyDetailMovie.id, detailMovieEntity.id)
        assertEquals(dummyDetailMovie.title, detailMovieEntity.title)
        assertEquals(dummyDetailMovie.genres, detailMovieEntity.genres)
        assertEquals(dummyDetailMovie.overview, detailMovieEntity.overview)
        assertEquals(dummyDetailMovie.posterPath, detailMovieEntity.posterPath)
        assertEquals(dummyDetailMovie.runtime, detailMovieEntity.runtime)
        assertEquals(dummyDetailMovie.voteAverage.toFloat(), detailMovieEntity.voteAverage.toFloat())
        assertEquals(dummyDetailMovie.originalLanguage, detailMovieEntity.originalLanguage)
        assertEquals(dummyDetailMovie.overview, detailMovieEntity.overview)

        viewModel.getMovieDetail().observeForever(detailMovieObserver)
        verify(detailMovieObserver).onChanged(dummyDetailMovie)

    }
}