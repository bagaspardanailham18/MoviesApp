package com.bagas.jetpackpro.moviesapp.data.source.remote

import com.google.gson.annotations.SerializedName

data class MovieDetailResponse(

        @field:SerializedName("title")
        val title: String,

        @field:SerializedName("genres")
        val genres: List<MovieGenresItem>,

        @field:SerializedName("id")
        val id: Int,

        @field:SerializedName("overview")
        val overview: String,

        @field:SerializedName("runtime")
        val runtime: Int,

        @field:SerializedName("poster_path")
        val posterPath: Any,

        @field:SerializedName("original_language")
        val originalLanguage: String,

        @field:SerializedName("vote_average")
        val voteAverage: Double
)

data class MovieGenresItem(

	@field:SerializedName("name")
	val name: String,

	@field:SerializedName("id")
	val id: Int
)
