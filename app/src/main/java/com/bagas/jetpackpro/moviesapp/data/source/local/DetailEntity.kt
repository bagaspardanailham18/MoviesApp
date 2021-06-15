package com.bagas.jetpackpro.moviesapp.data.source.local

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class DetailEntity(
        @SerializedName("id")
        val id: Int,
        @SerializedName("title")
        val title: String,
        @SerializedName("genres")
        val genres: List<String>,
        @SerializedName("overview")
        val overview: String,
        @SerializedName("poster_path")
        val posterPath: String,
        @SerializedName("runtime")
        val runtime: Int,
        @SerializedName("vote_average")
        val voteAverage: Double,
        @field:SerializedName("original_language")
        val originalLanguage: String
) : Parcelable
