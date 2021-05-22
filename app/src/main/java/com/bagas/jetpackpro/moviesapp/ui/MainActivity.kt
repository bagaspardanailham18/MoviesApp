package com.bagas.jetpackpro.moviesapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bagas.jetpackpro.moviesapp.R
import com.bagas.jetpackpro.moviesapp.databinding.ActivityMainBinding
import com.bumptech.glide.Glide

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val imgprofile = binding.imgProfile

        Glide
            .with(this)
            .load("https://d17ivq9b7rppb3.cloudfront.net/small/avatar/20201116215432face2c2dfb81230298b28afe6ef5f467.png")
            .into(imgprofile)

        val sectionPagerAdapter = SectionPagerAdapter(this, supportFragmentManager)
        binding.viewPager.adapter = sectionPagerAdapter
        binding.tabs.setupWithViewPager(binding.viewPager)

    }
}