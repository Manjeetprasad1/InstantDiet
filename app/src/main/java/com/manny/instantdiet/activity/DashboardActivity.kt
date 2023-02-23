package com.manny.instantdiet.activity

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide
import com.manny.instantdiet.BaseActivity
import com.manny.instantdiet.adapter.CategoryAdapter
import com.manny.instantdiet.R
import com.manny.instantdiet.adapter.ProductAdapter
import com.manny.instantdiet.databinding.ActivityDashboardBinding
import com.manny.instantdiet.fragment.HomeFragment
import com.manny.instantdiet.viewModel.DashboardViewModel

class DashboardActivity : BaseActivity() {
    private lateinit var binding: ActivityDashboardBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_dashboard)

        binding.viewModel = DashboardViewModel()
        binding.viewModel = ViewModelProvider(this).get(DashboardViewModel::class.java)

        replaceFragment(HomeFragment())

    }

    fun replaceFragment(fragment: Fragment){
        val trasition = supportFragmentManager.beginTransaction()
        trasition.replace(R.id.container,fragment)
        trasition.commit()
    }

}