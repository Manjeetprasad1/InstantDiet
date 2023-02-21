package com.manny.instantdiet.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.manny.instantdiet.R
import com.manny.instantdiet.databinding.FragmentProfileBinding
import com.manny.instantdiet.viewModel.ProfileViewModel

class ProfileFragment : BaseFragment(){

    private lateinit var binding : FragmentProfileBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_profile,container,false)
        binding.viewModel  = ViewModelProvider(this).get(ProfileViewModel::class.java)
        binding.lifecycleOwner = this

        return binding.root
    }
}