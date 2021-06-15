package com.bagas.jetpackpro.moviesapp.data.source.local

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class MovieEntity(
        @SerializedName("id")
        val id: Int,
        @SerializedName("title")
        val title: String,
        @SerializedName("poster_path")
        val posterPath: String,
        @SerializedName("vote_average")
        val voteAverage: Double,
        @SerializedName("release_date")
        val realeaseDate: String,
        @field:SerializedName("original_language")
        val originalLanguage: String,
        @field:SerializedName("overview")
        val overview: String
) : Parcelable