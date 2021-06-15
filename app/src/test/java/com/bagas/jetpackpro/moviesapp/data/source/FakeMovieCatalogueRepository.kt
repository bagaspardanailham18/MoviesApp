package com.bagas.jetpackpro.moviesapp.data.source

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.bagas.jetpackpro.moviesapp.data.source.local.*
import com.bagas.jetpackpro.moviesapp.data.source.remote.*

class FakeMovieCatalogueRepository (private val remoteDataSource: RemoteDataSource) : MovieCatalogueDataSource{

    override fun getMovies(): LiveData<List<MovieEntity>> {
        val movieResult = MutableLiveData<List<MovieEntity>>()

            remoteDataSource.getMovies(object : RemoteDataSource.LoadMoviesCallback {
                override fun onMoviesLoaded(movies: List<MovieItem>?) {
                    val movieList = ArrayList<MovieEntity>()
                    if (movies != null) {
                        for (response in movies) {
                            with(response) {
                                val delim = "-"
                                val split = response.releaseDate.split(delim)
                                val year = split[0]
                                val movie = MovieEntity(id, title, posterPath.toString(), voteAverage, year, originalLanguage, overview)
                                movieList.add(movie)
                            }
                        }
                        movieResult.postValue(movieList)
                    }
                }
            })

        return movieResult
    }

    override fun getDetailMovie(movieId: String): LiveData<DetailEntity> {
        val movieDetailResult = MutableLiveData<DetailEntity>()

            remoteDataSource.getDetailMovie(movieId, object : RemoteDataSource.LoadDetailMovieCallback {
                override fun onDetailMovieLoaded(movieDetail: MovieDetailResponse?) {
                    if (movieDetail != null) {
                        with(movieDetail) {
                            val listGenres = ArrayList<String>()

                            for (genre in genres) {
                                listGenres.add(genre.name)
                            }

                            val detailMovie = DetailEntity(
                                    id = id,
                                    title = title,
                                    genres = listGenres,
                                    overview = overview,
                                    posterPath = posterPath.toString(),
                                    runtime = runtime,
                                    voteAverage = voteAverage,
                                    originalLanguage = originalLanguage
                            )
                            movieDetailResult.postValue(detailMovie)
                        }
                    }
                }

            })

        return movieDetailResult
    }

    override fun getTvShows(): LiveData<List<TvshowEntity>> {
        val tvshowResult = MutableLiveData<List<TvshowEntity>>()

            remoteDataSource.getTvshows(object : RemoteDataSource.LoadTvshowCallback {
                override fun onTvshowLoaded(tvshow: List<TvshowItem>?) {
                    val tvshowList = ArrayList<TvshowEntity>()
                    if (tvshow != null) {
                        for (response in tvshow) {
                            with(response) {
                                val delim = "-"
                                val split = response.firstAirDate.split(delim)
                                val year = split[0]
                                val tvShow = TvshowEntity(id, name, posterPath, voteAverage, year, originalLanguage, overview)
                                tvshowList.add(tvShow)
                            }
                        }
                        tvshowResult.postValue(tvshowList)
                    }
                }
            })

        return tvshowResult
    }

    override fun getDetailTvShow(tvShowId: String): LiveData<DetailTvshowEntity> {
        val tvshowDetailResult = MutableLiveData<DetailTvshowEntity>()

        remoteDataSource.getDetailTvshow(tvShowId, object : RemoteDataSource.LoadDetailTvshowCallback {
            override fun onDetailTvshowLoaded(tvshowDetail: TvshowDetailResponse?) {
                if (tvshowDetail != null) {
                    with(tvshowDetail) {
                        val listGenres = ArrayList<String>()

                        for (genre in genres) {
                            listGenres.add(genre.name)
                        }

                        val listLang = ArrayList<String>()

                        val detailTvshow = DetailTvshowEntity(
                                id = id,
                                name = name,
                                genres = listGenres,
                                overview = overview,
                                posterPath = posterPath,
                                voteAverage = voteAverage,
                                originalLanguage = originalLanguage,
                                numberOfEpisodes = numberOfEpisodes.toString(),
                                numberOfSeasons = numberOfSeasons.toString()
                        )
                        tvshowDetailResult.postValue(detailTvshow)
                    }
                }
            }

        })
        return tvshowDetailResult
    }
}