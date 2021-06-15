package com.bagas.jetpackpro.moviesapp.ui.tvshow

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bagas.jetpackpro.moviesapp.BuildConfig.IMAGE_URL
import com.bagas.jetpackpro.moviesapp.R
import com.bagas.jetpackpro.moviesapp.data.source.local.TvshowEntity
import com.bagas.jetpackpro.moviesapp.databinding.ItemGridMoviesBinding
import com.bagas.jetpackpro.moviesapp.ui.detail.movie.DetailMovieActivity
import com.bagas.jetpackpro.moviesapp.ui.detail.tvshow.DetailTvshowActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class TvshowAdapter : RecyclerView.Adapter<TvshowAdapter.TvshowViewHolder>() {

    private val listTvshow = ArrayList<TvshowEntity>()

    fun setTvshow(tvshow: List<TvshowEntity>?) {
        if (tvshow == null) return
        this.listTvshow.clear()
        this.listTvshow.addAll(tvshow)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): TvshowAdapter.TvshowViewHolder {
        val itemTvshowBinding = ItemGridMoviesBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return TvshowViewHolder(itemTvshowBinding)
    }

    override fun onBindViewHolder(holder: TvshowAdapter.TvshowViewHolder, position: Int) {
        val tvshow = listTvshow[position]
        holder.bind(tvshow)
    }

    override fun getItemCount(): Int = listTvshow.size

    inner class TvshowViewHolder(private val binding: ItemGridMoviesBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(tvshow: TvshowEntity) {
            with(binding) {
                rvTitle.text = tvshow.name
                tvRates.text = tvshow.voteAverage.toString()
                rvYear.text = tvshow.year

                Glide.with(itemView.context)
                        .asBitmap()
                        .load(IMAGE_URL + tvshow.posterPath)
                        .apply(RequestOptions.placeholderOf(R.drawable.ic_loading)
                                .error(R.drawable.ic_error))
                        .centerCrop()
                        .into(rvPoster)

                itemView.setOnClickListener {
                    val intent = Intent(itemView.context, DetailTvshowActivity::class.java)
                    intent.putExtra(DetailMovieActivity.EXTRA_ID, tvshow.id)
                    itemView.context.startActivity(intent)
                }
            }
        }
    }
}