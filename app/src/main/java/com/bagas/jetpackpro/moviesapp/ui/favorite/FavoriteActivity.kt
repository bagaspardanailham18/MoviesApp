package com.bagas.jetpackpro.moviesapp.ui.favorite

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bagas.jetpackpro.moviesapp.R
import com.bagas.jetpackpro.moviesapp.databinding.ActivityFavoriteBinding

class FavoriteActivity : AppCompatActivity() {

    private lateinit var binding: ActivityFavoriteBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFavoriteBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val toolbar: androidx.appcompat.widget.Toolbar = findViewById(R.id.custom_toolbar_2)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayShowTitleEnabled(false)

        val favSectionPagerAdapter = FavoriteSectionPagerAdapter(this, supportFragmentManager)
        binding.viewPager.adapter = favSectionPagerAdapter
        binding.tabs.setupWithViewPager(binding.viewPager)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)
    }
}