package com.bagas.jetpackpro.moviesapp.data.source.local

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class DetailTvshowEntity(
        @SerializedName("id")
        val id: Int,
        @SerializedName("name")
        val name: String,
        @SerializedName("genres")
        val genres: List<String>,
        @SerializedName("overview")
        val overview: String,
        @SerializedName("poster_path")
        val posterPath: String,
        @SerializedName("vote_average")
        val voteAverage: Double,
        @field:SerializedName("original_language")
        val originalLanguage: String,
        @SerializedName("number_of_episodes")
        val numberOfEpisodes: String,
        @SerializedName("number_of_seasons")
        val numberOfSeasons: String
) : Parcelable
