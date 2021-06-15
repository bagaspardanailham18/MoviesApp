package com.bagas.jetpackpro.moviesapp.data.source.remote

import com.google.gson.annotations.SerializedName

data class TvshowResponse(

	@field:SerializedName("page")
	val page: Int,

	@field:SerializedName("total_pages")
	val totalPages: Int,

	@field:SerializedName("results")
	val results: List<TvshowItem>,

	@field:SerializedName("total_results")
	val totalResults: Int
)

data class TvshowItem(

		@field:SerializedName("number_of_episodes")
		val numberOfEpisodes: Int,

		@field:SerializedName("number_of_seasons")
		val numberOfSeasons: Int,

	@field:SerializedName("first_air_date")
	val firstAirDate: String,

	@field:SerializedName("poster_path")
	val posterPath: String,

	@field:SerializedName("vote_average")
	val voteAverage: Double,

	@field:SerializedName("overview")
	val overview: String,

		@field:SerializedName("original_language")
		val originalLanguage: String,

	@field:SerializedName("name")
	val name: String,

	@field:SerializedName("id")
	val id: Int,
)
