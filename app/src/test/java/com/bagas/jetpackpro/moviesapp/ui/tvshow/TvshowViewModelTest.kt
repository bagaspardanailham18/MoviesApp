package com.bagas.jetpackpro.moviesapp.ui.tvshow

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import com.bagas.jetpackpro.moviesapp.data.source.MovieCatalogueRepository
import com.bagas.jetpackpro.moviesapp.data.source.local.TvshowEntity
import com.bagas.jetpackpro.moviesapp.utils.DataDummy
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before
import org.junit.Rule
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.Mockito.`when`
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class TvshowViewModelTest {

    private lateinit var viewModel: TvshowViewModel

    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    @Mock
    private lateinit var movieCatalogueRepository: MovieCatalogueRepository

    @Mock
    private lateinit var tvshowsObserver: Observer<List<TvshowEntity>>

    @Before
    fun setUpTvshow() {
        viewModel = TvshowViewModel(movieCatalogueRepository)
    }

    @Test
    fun getTvshow() {
        val dummyTvshows = DataDummy.generateDummyTvshow()
        val tvshows = MutableLiveData<List<TvshowEntity>>()
        tvshows.value = dummyTvshows

        `when`(movieCatalogueRepository.getTvShows()).thenReturn(tvshows)
        val tvshowEntities = viewModel.getTvshow().value
        Mockito.verify(movieCatalogueRepository)?.getTvShows()
        assertNotNull(tvshowEntities)
        assertEquals(10, tvshowEntities?.size)

        viewModel.getTvshow().observeForever(tvshowsObserver)
        Mockito.verify(tvshowsObserver).onChanged(dummyTvshows)
    }
}
