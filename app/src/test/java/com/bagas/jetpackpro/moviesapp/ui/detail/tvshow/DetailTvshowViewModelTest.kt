package com.bagas.jetpackpro.moviesapp.ui.detail.tvshow

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import com.bagas.jetpackpro.moviesapp.data.source.MovieCatalogueRepository
import com.bagas.jetpackpro.moviesapp.data.source.local.DetailTvshowEntity
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
class DetailTvshowViewModelTest {
    private lateinit var viewModel: DetailTvshowViewModel
    private val dummyDetailTvshow = DetailDataDummy.generateDetailDummyTvshow()[0]
    private val tvshowId = dummyDetailTvshow.id.toString()

    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    @Mock
    private lateinit var movieCatalogueRepository: MovieCatalogueRepository

    @Mock
    private lateinit var detailTvshowObserver: Observer<DetailTvshowEntity>

    @Before
    fun setDetailTvshowSetUp() {
        viewModel = DetailTvshowViewModel(movieCatalogueRepository)
        viewModel.setSelectedTvshow(tvshowId)
    }

    @Test
    fun getTvshowDetail() {
        val tvshow = MutableLiveData<DetailTvshowEntity>()
        tvshow.value = dummyDetailTvshow

        `when`(movieCatalogueRepository.getDetailTvShow(tvshowId)).thenReturn(tvshow)
        val detailTvshowEntity = viewModel.getTvshowDetail().value as DetailTvshowEntity
        verify(movieCatalogueRepository).getDetailTvShow(tvshowId)
        assertNotNull(detailTvshowEntity)
        assertEquals(dummyDetailTvshow.id, detailTvshowEntity.id)
        assertEquals(dummyDetailTvshow.name, detailTvshowEntity.name)
        assertEquals(dummyDetailTvshow.genres, detailTvshowEntity.genres)
        assertEquals(dummyDetailTvshow.overview, detailTvshowEntity.overview)
        assertEquals(dummyDetailTvshow.posterPath, detailTvshowEntity.posterPath)
        assertEquals(dummyDetailTvshow.voteAverage.toFloat(), detailTvshowEntity.voteAverage.toFloat())
        assertEquals(dummyDetailTvshow.originalLanguage, detailTvshowEntity.originalLanguage)
        assertEquals(dummyDetailTvshow.numberOfEpisodes, detailTvshowEntity.numberOfEpisodes)
        assertEquals(dummyDetailTvshow.numberOfSeasons, detailTvshowEntity.numberOfSeasons)

        viewModel.getTvshowDetail().observeForever(detailTvshowObserver)
        verify(detailTvshowObserver).onChanged(dummyDetailTvshow)
    }
}