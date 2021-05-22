package com.bagas.jetpackpro.moviesapp.network

import com.bagas.jetpackpro.moviesapp.data.remote.MovieDetailResponse
import com.bagas.jetpackpro.moviesapp.data.remote.MovieResponse
import com.bagas.jetpackpro.moviesapp.data.remote.TvshowDetailResponse
import com.bagas.jetpackpro.moviesapp.data.remote.TvshowResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiService {
    @GET("discover/movie")
    fun getMovies(
        @Query("api_key") apiKey: String
    ) : Call<MovieResponse>

    @GET("discover/tv")
    fun getTvshows(
        @Query("api_key") apiKey: String
    ) : Call<TvshowResponse>

    @GET("movie/{id}")
    fun getMovieDetail(
        @Path("id") id: String,
        @Query("api_key") apiKey: String
    ) : Call<MovieDetailResponse>

    @GET("tv/{id}")
    fun getTvshowDetail(
        @Path("id") id: String,
        @Query("api_key") apiKey: String
    ) : Call<TvshowDetailResponse>
}