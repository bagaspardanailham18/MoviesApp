package com.bagas.jetpackpro.moviesapp.data.source.local

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class TvshowEntity(
        @SerializedName("id")
        val id: Int,
        @SerializedName("name")
        val name: String,
        @SerializedName("poster_path")
        val posterPath: String,
        @SerializedName("vote_average")
        val voteAverage: Double,
        @SerializedName("first_air_date")
        val year: String,
        @field:SerializedName("original_language")
        val originalLanguage: String,
        @field:SerializedName("overview")
        val overview: String
) : Parcelable