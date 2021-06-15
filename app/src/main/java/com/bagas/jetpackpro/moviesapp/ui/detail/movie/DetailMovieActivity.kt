package com.bagas.jetpackpro.moviesapp.ui.detail.movie

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.isVisible
import androidx.lifecycle.ViewModelProvider
import com.bagas.jetpackpro.moviesapp.BuildConfig.IMAGE_URL
import com.bagas.jetpackpro.moviesapp.R
import com.bagas.jetpackpro.moviesapp.data.source.local.DetailEntity
import com.bagas.jetpackpro.moviesapp.databinding.ActivityDetailItemBinding
import com.bagas.jetpackpro.moviesapp.viewmodel.ViewModelFactory
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class DetailMovieActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_ID = "extra_id"
    }

    private lateinit var binding: ActivityDetailItemBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailItemBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val factory = ViewModelFactory.getInstance(this)
        val viewModel = ViewModelProvider(this, factory)[DetailMovieViewModel::class.java]

        val extrasId = intent.getIntExtra(EXTRA_ID,0).toString()

        if (!extrasId.isEmpty()) {
            viewModel.setSelectedMovie(extrasId)
            viewModel.getMovieDetail().observe(this,  { movie ->
                populateMovie(movie)
            })
        }

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    private fun populateMovie(detailMovieEntity: DetailEntity) {
        binding.collapsingToolbar.setCollapsedTitleTextColor(Color.WHITE)
        binding.collapsingToolbar.setExpandedTitleColor(Color.WHITE)

        binding.collapsingToolbar.title = detailMovieEntity.title
        val genres = detailMovieEntity.genres.toString()
        val removeGenreF = removeFirstChar(genres,"[", "")
        val removeGenreL = removeLastChar(removeGenreF, "]", "")
        val genresToStr = removeGenreL

        binding.tvGenre.text = genresToStr
        binding.tvRates.text = detailMovieEntity.voteAverage.toString()
        binding.tvOverview.text = detailMovieEntity.overview

//        val lang = detailMovieEntity.originalLanguage.toString()
//        val removeLangF = removeFirstChar(lang,"[", "")
//        val removeLangL = removeLastChar(removeLangF, "]", "")
//        val langToStr = removeLangL

        binding.tvLang.text = detailMovieEntity.originalLanguage

        Glide.with(this)
                .load(IMAGE_URL + detailMovieEntity.posterPath)
                .apply(RequestOptions.placeholderOf(R.drawable.ic_loading))
                .error(R.drawable.ic_error)
                .centerCrop()
                .into(binding.tvPoster)

        binding.tvRuntime.text = resources.getString(R.string.tv_runtime, detailMovieEntity.runtime.toString())

//        binding.btnTrailer.setOnClickListener {
//            val intent = Intent(Intent.ACTION_VIEW)
//            intent.setData(Uri.parse(movieEntity.linkTrailer))
//            startActivity(intent)
//        }

        binding.toolbar.setNavigationIcon(R.drawable.ic_arrow_back)
        binding.toolbar.setNavigationOnClickListener {
            finish()
        }
    }


    private fun removeLastChar(removeFirstChar: Any, s: String, s1: String): String {
        val result = removeFirstChar.toString().replace(s, s1)
        return result
    }

    private fun removeFirstChar(genres: String, s: String, s1: String): String {
        val result = genres.replace(s, s1)
        return result
    }
}