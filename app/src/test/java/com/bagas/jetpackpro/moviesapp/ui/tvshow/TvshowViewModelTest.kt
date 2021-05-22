package com.bagas.jetpackpro.moviesapp.ui.tvshow

import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class TvshowViewModelTest {

    private lateinit var viewModel: TvshowViewModel

    @Before
    fun setUp() {
        viewModel = TvshowViewModel()
    }

    @Test
    fun getTvshow() {
        val tvshowEntities = viewModel.getTvshow()
        assertNotNull(tvshowEntities)
        assertEquals(10, tvshowEntities.size)
    }
}