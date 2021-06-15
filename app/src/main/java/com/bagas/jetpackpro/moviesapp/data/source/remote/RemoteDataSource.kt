package com.bagas.jetpackpro.moviesapp.data.source.remote

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.bagas.jetpackpro.moviesapp.BuildConfig
import com.bagas.jetpackpro.moviesapp.network.ApiConfig
import com.bagas.jetpackpro.moviesapp.utils.EspressoIdlingResource
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import android.os.Handler
import android.os.Looper

class RemoteDataSource {

    private var handler = Handler(Looper.getMainLooper())

    private val _isLoadingMovies = MutableLiveData<Boolean>()
    val isLoadingMovies: LiveData<Boolean> = _isLoadingMovies

    private val _movies = MutableLiveData<List<MovieItem>>()
    val movies: LiveData<List<MovieItem>> = _movies

    private val _isLoadingTvshows = MutableLiveData<Boolean>()
    val isLoadingTvshow: LiveData<Boolean> = _isLoadingTvshows

    private val _tvshows = MutableLiveData<List<TvshowItem>>()
    val tvshows: LiveData<List<TvshowItem>> = _tvshows

    private val _detailMovies = MutableLiveData<MovieDetailResponse>()
    val detailMovies: LiveData<MovieDetailResponse> = _detailMovies

    private val _detailShows = MutableLiveData<TvshowDetailResponse>()
    val detailShows: LiveData<TvshowDetailResponse> = _detailShows

    companion object {
        private const val TAG = "RemoteDataSource"
        private const val TIME_IN_MILLIS: Long = 2000

        @Volatile
        private var instance: RemoteDataSource? = null

        fun getInstance(): RemoteDataSource =
            instance ?: synchronized(this) {
                instance ?: RemoteDataSource().apply {
                    instance = this
                }
            }
    }

    fun getMovies(callback: LoadMoviesCallback) {
        EspressoIdlingResource.increment()
        _isLoadingMovies.value = true
        val client = ApiConfig.getApiService().getMovies(BuildConfig.movie_db_api_key)
        client.enqueue(object : Callback<MovieResponse> {
            override fun onResponse(call: Call<MovieResponse>, response: Response<MovieResponse>) {
                if (response.isSuccessful) {
                    callback.onMoviesLoaded(response.body()?.results)
                    EspressoIdlingResource.decrement()
                } else {
                    Log.e(TAG, "onFailure: ${response.message()}")
                    EspressoIdlingResource.decrement()
                }
            }

            override fun onFailure(call: Call<MovieResponse>, t: Throwable) {
                _isLoadingMovies.value = false
                Log.e(TAG, "getMovies onFailure : ${t.message}")
                EspressoIdlingResource.decrement()
            }
        })
    }

    fun getDetailMovie(movieId: String, callback: LoadDetailMovieCallback) {
        EspressoIdlingResource.increment()
        _isLoadingMovies.value = true
        val client = ApiConfig.getApiService().getMovieDetail(movieId, BuildConfig.movie_db_api_key)
        client.enqueue(object : Callback<MovieDetailResponse> {
            override fun onResponse(call: Call<MovieDetailResponse>, response: Response<MovieDetailResponse>) {
                if (response.isSuccessful) {
                    callback.onDetailMovieLoaded(response.body())
                    EspressoIdlingResource.decrement()
                } else {
                    Log.e(TAG,"onFailure: ${response.message()}")
                    EspressoIdlingResource.decrement()
                }
            }

            override fun onFailure(call: Call<MovieDetailResponse>, t: Throwable) {
                _isLoadingMovies.value = false
                Log.e(TAG, "getDetailMovie onFailure : ${t.message}")
                EspressoIdlingResource.decrement()
            }

        })
    }

    fun getTvshows(callback: LoadTvshowCallback) {
        EspressoIdlingResource.increment()
        _isLoadingTvshows.value = true
        val client = ApiConfig.getApiService().getTvshows(BuildConfig.movie_db_api_key)
        client.enqueue(object : Callback<TvshowResponse> {
            override fun onResponse(call: Call<TvshowResponse>, response: Response<TvshowResponse>) {
                if (response.isSuccessful) {
                    callback.onTvshowLoaded(response.body()?.results)
                    EspressoIdlingResource.decrement()
                } else {
                    Log.e(TAG,"onFailure: ${response.message()}")
                    EspressoIdlingResource.decrement()
                }
            }

            override fun onFailure(call: Call<TvshowResponse>, t: Throwable) {
                _isLoadingTvshows.value = false
                Log.e(TAG, "getTvshows onFailure : ${t.message}")
                EspressoIdlingResource.decrement()
            }

        })
    }

    fun getDetailTvshow(tvShowId: String, callback: LoadDetailTvshowCallback) {
        EspressoIdlingResource.increment()
        _isLoadingTvshows.value = true

        handler.postDelayed({
            val client = ApiConfig.getApiService().getTvshowDetail(tvShowId, BuildConfig.movie_db_api_key)
            client.enqueue(object : Callback<TvshowDetailResponse> {
                override fun onResponse(call: Call<TvshowDetailResponse>, response: Response<TvshowDetailResponse>) {
                    if (response.isSuccessful) {
                        val result = response.body()
                        callback.onDetailTvshowLoaded(response.body())
                        EspressoIdlingResource.decrement()
                    } else {
                        Log.e(TAG,"onFailure: ${response.message()}")
                        EspressoIdlingResource.decrement()
                    }

                }

                override fun onFailure(call: Call<TvshowDetailResponse>, t: Throwable) {
                    _isLoadingTvshows.value = false
                    Log.e(TAG, "getDetailTvshows onFailure : ${t.message}")
                    EspressoIdlingResource.decrement()
                }

            })
        }, TIME_IN_MILLIS)
    }

    interface LoadMoviesCallback {
        fun onMoviesLoaded(movies : List<MovieItem>?)
    }

    interface LoadDetailMovieCallback {
        fun onDetailMovieLoaded(movieDetail: MovieDetailResponse?)
    }

    interface  LoadTvshowCallback {
        fun onTvshowLoaded(tvshow: List<TvshowItem>?)
    }

    interface LoadDetailTvshowCallback {
        fun onDetailTvshowLoaded(tvshowDetail: TvshowDetailResponse?)
    }
}