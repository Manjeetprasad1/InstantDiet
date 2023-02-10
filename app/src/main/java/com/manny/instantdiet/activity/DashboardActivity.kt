package com.manny.instantdiet.activity

import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.ViewModelProvider
import com.manny.instantdiet.BaseActivity
import com.manny.instantdiet.R
import com.manny.instantdiet.databinding.ActivityDashboardBinding
import com.manny.instantdiet.viewModel.DashboardViewModel

class DashboardActivity : BaseActivity() {
    private lateinit var binding: ActivityDashboardBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_dashboard)
        binding.viewModel = DashboardViewModel()
        binding.viewModel = ViewModelProvider(this).get(DashboardViewModel::class.java)
    }
}