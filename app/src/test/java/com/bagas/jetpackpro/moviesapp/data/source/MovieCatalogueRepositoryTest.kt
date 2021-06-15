package com.bagas.jetpackpro.moviesapp.data.source

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.bagas.jetpackpro.moviesapp.data.source.remote.RemoteDataSource
import com.bagas.jetpackpro.moviesapp.utils.DataDummy
import com.bagas.jetpackpro.moviesapp.utils.DetailDataDummy
import com.nhaarman.mockitokotlin2.any
import com.nhaarman.mockitokotlin2.doAnswer
import com.nhaarman.mockitokotlin2.eq
import com.nhaarman.mockitokotlin2.verify
import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test
import org.mockito.Mockito
import com.bagas.jetpackpro.moviesapp.utils.LiveDataTestUtil
import org.junit.Before
import org.junit.runner.RunWith
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class MovieCatalogueRepositoryTest {

    private lateinit var dataDummy: DataDummy
    private lateinit var detailDataDummy: DetailDataDummy

    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    @Before
    fun setUp() {
        dataDummy = DataDummy
        detailDataDummy = DetailDataDummy
    }

    private val remote = Mockito.mock(RemoteDataSource::class.java)
    private val movieCatalogueRepository = FakeMovieCatalogueRepository(remote)

    private val movieResponses = DataDummy.generateRemoteDummyMovies()
    private val movieId = movieResponses[0].id.toString()


    private val tvshowResponses = DataDummy.generateRemoteDummyTvshow()
    private val tvshowId = tvshowResponses[0].id.toString()

    private val detailMovieResponse = DetailDataDummy.generateRemoteDetailDummyMovie()
    private val detailTvshowResponse = DetailDataDummy.generateRemoteDetailTvshow()


    @Test
    fun getAllMovies() {
        doAnswer { invocation ->
            (invocation.arguments[0] as RemoteDataSource.LoadMoviesCallback).onMoviesLoaded(movieResponses)
            null
        }.`when`(remote).getMovies(any())

        val movieEntities = LiveDataTestUtil.getValue(movieCatalogueRepository.getMovies())
        verify<RemoteDataSource>(remote).getMovies(any())
        assertNotNull(movieEntities)
        assertEquals(movieResponses.size.toLong(), movieEntities.size.toLong())
    }

    @Test
    fun getDetailMovie() {

        doAnswer { invocation ->
            (invocation.arguments[1] as RemoteDataSource.LoadDetailMovieCallback).onDetailMovieLoaded(detailMovieResponse)
            null
        }.`when`(remote).getDetailMovie(eq(movieId), any())

        val movieDetailEntities = LiveDataTestUtil.getValue(movieCatalogueRepository.getDetailMovie(movieId))

        verify(remote).getDetailMovie(eq(movieId), any())
        assertNotNull(movieDetailEntities)
        assertEquals(detailMovieResponse.id, movieDetailEntities.id)
    }

    @Test
    fun getAllTvshows() {
        doAnswer { invocation ->
            (invocation.arguments[0] as RemoteDataSource.LoadTvshowCallback).onTvshowLoaded(tvshowResponses)
            null
        }.`when`(remote).getTvshows(any())

        val tvshowEntities = LiveDataTestUtil.getValue(movieCatalogueRepository.getTvShows())
        verify<RemoteDataSource>(remote).getTvshows(any())
        assertNotNull(tvshowEntities)
        assertEquals(tvshowResponses.size.toLong(), tvshowEntities.size.toLong())
    }

    @Test
    fun getDetailTvshow() {
        doAnswer { invocation ->
            (invocation.arguments[1] as RemoteDataSource.LoadDetailTvshowCallback)
                .onDetailTvshowLoaded(detailTvshowResponse)
            null
        }.`when`(remote).getDetailTvshow(eq(tvshowId), any())

        val tvshowDetailEntities = LiveDataTestUtil.getValue(movieCatalogueRepository.getDetailTvShow(tvshowId))

        verify(remote).getDetailTvshow(eq(tvshowId), any())
        assertNotNull(tvshowDetailEntities)
        assertEquals(detailTvshowResponse.id, tvshowDetailEntities.id)
    }
}