package com.bagas.jetpackpro.moviesapp.ui.detail

import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.app.ShareCompat
import androidx.core.view.isVisible
import androidx.lifecycle.ViewModelProvider
import com.bagas.jetpackpro.moviesapp.R
import com.bagas.jetpackpro.moviesapp.data.MovieEntity
import com.bagas.jetpackpro.moviesapp.data.TvshowEntity
import com.bagas.jetpackpro.moviesapp.databinding.ActivityDetailItemBinding
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class DetailItemActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_MOVIE = "extra_movie"
        const val EXTRA_TVSHOW = "extra_tvshow"
    }

    private lateinit var binding: ActivityDetailItemBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailItemBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val viewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory())[DetailItemViewModel::class.java]

        val extras = intent.extras
        if (extras != null) {
            val movieId = extras.getString(EXTRA_MOVIE)
            val tvshowId = extras.getString(EXTRA_TVSHOW)
            if (movieId != null) {
                viewModel.setSelectedMovie(movieId)
                populateMovie(viewModel.getMovie() as MovieEntity)
            }
            if (tvshowId != null) {
                viewModel.setSelectedTvshow(tvshowId)
                populateTvShow(viewModel.getTvshow() as TvshowEntity)
            }
        }

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    private fun populateMovie(movieEntity: MovieEntity) {
        binding.collapsingToolbar.setCollapsedTitleTextColor(Color.WHITE)
        binding.collapsingToolbar.setExpandedTitleColor(Color.WHITE)

        binding.collapsingToolbar.title = movieEntity.title
        binding.tvGenre.text = movieEntity.genre
        binding.tvRates.text = movieEntity.rating
        binding.tvOverview.text = movieEntity.overview
        binding.tvStars.text = movieEntity.stars
        binding.tvDirector.text = movieEntity.director

        val poster = movieEntity.poster

        Glide.with(this)
                .load(poster)
                .apply(RequestOptions.placeholderOf(R.drawable.ic_loading))
                .error(R.drawable.ic_error)
                .centerCrop()
                .into(binding.tvPoster)

        binding.layoutHour.isVisible = true
        binding.tvHour.text = movieEntity.hour

        binding.btnTrailer.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse(movieEntity.linkTrailer))
            startActivity(intent)
        }

        binding.btnShare.setOnClickListener {
            val intent= Intent()
            intent.action=Intent.ACTION_SEND
            intent.putExtra(Intent.EXTRA_SUBJECT, movieEntity.linkTrailer)
            intent.putExtra(Intent.EXTRA_TEXT,"Cinema : ${movieEntity.title}")
            intent.type="text/plain"
            startActivity(Intent.createChooser(intent,"Share To:"))
        }

        binding.toolbar.setNavigationIcon(R.drawable.ic_arrow_back)
        binding.toolbar.setNavigationOnClickListener {
            finish()
        }
    }

    private fun populateTvShow(tvshowEntity: TvshowEntity) {
        binding.collapsingToolbar.setCollapsedTitleTextColor(Color.WHITE)
        binding.collapsingToolbar.setExpandedTitleColor(Color.WHITE)

        binding.collapsingToolbar.title = tvshowEntity.title
        binding.tvGenre.text = tvshowEntity.genre
        binding.tvRates.text = tvshowEntity.rating
        binding.tvOverview.text = tvshowEntity.overview
        binding.tvStars.text = tvshowEntity.stars
        binding.tvDirector.text = tvshowEntity.director

        val poster = tvshowEntity.poster

        Glide.with(this)
                .load(poster)
                .apply(RequestOptions.placeholderOf(R.drawable.ic_loading))
                .error(R.drawable.ic_error)
                .centerCrop()
                .into(binding.tvPoster)

        binding.layoutSeasons.isVisible = true
        binding.tvSeasons.text = tvshowEntity.seasons

        binding.btnTrailer.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse(tvshowEntity.linkTrailer))
            startActivity(intent)
        }

        binding.btnShare.setOnClickListener {
            val intent= Intent()
            intent.action=Intent.ACTION_SEND
            intent.putExtra(Intent.EXTRA_SUBJECT, tvshowEntity.linkTrailer)
            intent.putExtra(Intent.EXTRA_TEXT,"Cinema : ${tvshowEntity.title}")
            intent.type="text/plain"
            startActivity(Intent.createChooser(intent,"Share To:"))
        }

        binding.toolbar.setNavigationIcon(R.drawable.ic_arrow_back)
        binding.toolbar.setNavigationOnClickListener {
            finish()
        }
    }
}