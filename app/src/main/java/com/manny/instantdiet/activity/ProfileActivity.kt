package com.manny.instantdiet.activity

import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.manny.instantdiet.BaseActivity
import com.manny.instantdiet.R
import com.manny.instantdiet.databinding.ActivityProfileBinding
import com.manny.instantdiet.fragment.ProfileFragment
import com.manny.instantdiet.viewModel.DashboardViewModel
import com.manny.instantdiet.viewModel.ProfileViewModel

class ProfileActivity : BaseActivity() {

    private lateinit var binding : ActivityProfileBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_profile)
        binding.viewModel = ProfileViewModel()
        binding.viewModel = ViewModelProvider(this).get(ProfileViewModel::class.java)

        replaceFragment(ProfileFragment())
    }

    fun replaceFragment(fragment: Fragment){
        val trasition = supportFragmentManager.beginTransaction()
        trasition.replace(R.id.container,fragment)
        trasition.commit()
    }

}