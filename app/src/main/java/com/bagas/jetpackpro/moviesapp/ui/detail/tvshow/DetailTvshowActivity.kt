package com.bagas.jetpackpro.moviesapp.ui.detail.tvshow

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.isVisible
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.bagas.jetpackpro.moviesapp.BuildConfig
import com.bagas.jetpackpro.moviesapp.R
import com.bagas.jetpackpro.moviesapp.data.source.local.DetailTvshowEntity
import com.bagas.jetpackpro.moviesapp.databinding.ActivityDetailTvshowBinding
import com.bagas.jetpackpro.moviesapp.viewmodel.ViewModelFactory
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class DetailTvshowActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_ID = "extra_id"
    }

    private lateinit var binding: ActivityDetailTvshowBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailTvshowBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val factory = ViewModelFactory.getInstance(this)
        val viewModel = ViewModelProvider(this, factory)[DetailTvshowViewModel::class.java]

        val extrasId = intent.getIntExtra(EXTRA_ID,0).toString()

        if (!extrasId.isEmpty()) {
            viewModel.setSelectedTvshow(extrasId)
            viewModel.getTvshowDetail().observe(this,  { tvshow ->
                populateTvshow(tvshow)
            })
        }

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    private fun populateTvshow(detailTvshowEntity: DetailTvshowEntity) {
        binding.collapsingToolbar.setCollapsedTitleTextColor(Color.WHITE)
        binding.collapsingToolbar.setExpandedTitleColor(Color.WHITE)

        binding.collapsingToolbar.title = detailTvshowEntity.name

        val genres = detailTvshowEntity.genres.toString()
        val removeGenreF = removeFirstChar(genres,"[", "")
        val removeGenreL = removeLastChar(removeGenreF, "]", "")
        val genresToStr = removeGenreL

        binding.tvGenre.text = genresToStr
        binding.tvRates.text = detailTvshowEntity.voteAverage.toString()
        binding.tvOverview.text = detailTvshowEntity.overview

//        val lang = detailTvshowEntity.spokenLanguage.toString()
//        val removeLangF = removeFirstChar(lang,"[", "")
//        val removeLangL = removeLastChar(removeLangF, "]", "")
//        val langToStr = removeLangL

        binding.tvLang.text = detailTvshowEntity.originalLanguage

        val poster = detailTvshowEntity.posterPath

        Glide.with(this)
            .asBitmap()
            .load(BuildConfig.IMAGE_URL + poster)
            .apply(RequestOptions.placeholderOf(R.drawable.ic_loading))
            .error(R.drawable.ic_error)
            .centerCrop()
            .into(binding.tvPoster)

        binding.tvSeasons.text = resources.getString(R.string.tv_seasons, detailTvshowEntity.numberOfSeasons)

        binding.tvRuntimeEpisodes.text = resources.getString(R.string.tv_runtime_episodes, detailTvshowEntity.numberOfEpisodes)

//        binding.btnTrailer.setOnClickListener {
//            val intent = Intent(Intent.ACTION_VIEW)
//            intent.setData(Uri.parse(detailTvshowEntity.linkTrailer))
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