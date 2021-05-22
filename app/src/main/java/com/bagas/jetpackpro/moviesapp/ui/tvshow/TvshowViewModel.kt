package com.bagas.jetpackpro.moviesapp.ui.tvshow

import androidx.lifecycle.ViewModel
import com.bagas.jetpackpro.moviesapp.data.TvshowEntity
import com.bagas.jetpackpro.moviesapp.utils.DataDummy

class TvshowViewModel : ViewModel() {
    fun getTvshow(): List<TvshowEntity> = DataDummy.GenerateDummyTvshow()
}