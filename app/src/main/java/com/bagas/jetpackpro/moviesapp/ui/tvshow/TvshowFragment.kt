package com.bagas.jetpackpro.moviesapp.ui.tvshow

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.bagas.jetpackpro.moviesapp.R
import com.bagas.jetpackpro.moviesapp.databinding.FragmentTvshowBinding

class TvshowFragment : Fragment() {

    private lateinit var fragmentTvshowBinding: FragmentTvshowBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        fragmentTvshowBinding = FragmentTvshowBinding.inflate(layoutInflater, container, false)
        return fragmentTvshowBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if (activity != null) {
            val viewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory())[TvshowViewModel::class.java]
            val tvshow = viewModel.getTvshow()

            val tvShowAdapter = TvshowAdapter()
            tvShowAdapter.setTvshow(tvshow)

            with(fragmentTvshowBinding.rvTvshow) {
                layoutManager = GridLayoutManager(context, 2)
                setHasFixedSize(true)
                adapter = tvShowAdapter
            }
        }
    }
}