package com.bagas.jetpackpro.moviesapp.data

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class TvshowEntity(
    var tvShowId: String,
    var title: String,
    var overview: String,
    var seasons: String,
    var episodes: String,
    var rating: String,
    var director: String,
    var stars: String,
    var genre: String,
//    var cast: Array<String>,
    var linkTrailer: String,
    var poster: String,
) : Parcelable