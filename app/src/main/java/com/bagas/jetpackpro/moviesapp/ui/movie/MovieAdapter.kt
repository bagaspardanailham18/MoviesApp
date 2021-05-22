package com.bagas.jetpackpro.moviesapp.ui.movie

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bagas.jetpackpro.moviesapp.R
import com.bagas.jetpackpro.moviesapp.data.MovieEntity
import com.bagas.jetpackpro.moviesapp.databinding.ItemGridMoviesBinding
import com.bagas.jetpackpro.moviesapp.databinding.ItemRowMoviesBinding
import com.bagas.jetpackpro.moviesapp.ui.detail.DetailItemActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class MovieAdapter : RecyclerView.Adapter<MovieAdapter.MovieViewHolder>() {

    private val listMovies = ArrayList<MovieEntity>()

    fun setMovies(movies: List<MovieEntity>?) {
        if (movies == null) return
        this.listMovies.clear()
        this.listMovies.addAll(movies)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MovieAdapter.MovieViewHolder {
        val itemsMoviesBinding = ItemGridMoviesBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MovieViewHolder(itemsMoviesBinding)
    }

    override fun onBindViewHolder(holder: MovieAdapter.MovieViewHolder, position: Int) {
        val movie = listMovies[position]
        holder.bind(movie)
    }

    override fun getItemCount(): Int = listMovies.size

    inner class MovieViewHolder(private val binding: ItemGridMoviesBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(movie: MovieEntity) {
            with(binding) {
                rvTitle.text = movie.title
                rvHour.text = movie.hour
                tvRates.text = movie.rating
                itemView.setOnClickListener {
                    val intent = Intent(itemView.context, DetailItemActivity::class.java)
                    intent.putExtra(DetailItemActivity.EXTRA_MOVIE, movie.movieId)
                    itemView.context.startActivity(intent)
                }
                Glide.with(itemView.context)
                    .load(movie.poster)
                    .apply(RequestOptions.placeholderOf(R.drawable.ic_loading))
                    .error(R.drawable.ic_error)
                        .centerCrop()
                    .into(rvPoster)
            }
        }
    }
}