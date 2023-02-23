package com.manny.instantdiet.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.manny.instantdiet.R
import com.manny.instantdiet.activity.DashboardActivity
import com.manny.instantdiet.databinding.FragmentProductDetailsBinding
import com.manny.instantdiet.viewModel.ProductDetailsViewModel
import com.manny.instantdiet.viewModel.ProfileViewModel

class ProductDetailFragment : BaseFragment() {
    private lateinit var binding : FragmentProductDetailsBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_product_details,container,false)
        binding.viewModel  = ViewModelProvider(this).get(ProductDetailsViewModel::class.java)
        binding.lifecycleOwner = this

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.tvConfirmOrder.setOnClickListener {
            (activity as DashboardActivity).replaceFragment(CheckOutFragment())
        }
    }
}