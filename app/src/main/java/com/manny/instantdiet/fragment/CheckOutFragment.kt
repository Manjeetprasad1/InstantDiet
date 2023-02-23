package com.manny.instantdiet.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.manny.instantdiet.R
import com.manny.instantdiet.databinding.FragmentCheckoutBinding
import com.manny.instantdiet.fragment.BaseFragment
import com.manny.instantdiet.viewModel.CheckOutViewModel
import com.manny.instantdiet.viewModel.DashboardViewModel

class CheckOutFragment : BaseFragment() {
    private lateinit var binding : FragmentCheckoutBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_checkout,container,false)
        binding.viewModel  = ViewModelProvider(this).get(CheckOutViewModel::class.java)
        binding.lifecycleOwner = this
        return binding.root
    }
}