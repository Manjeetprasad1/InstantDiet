package com.manny.instantdiet.activity

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide
import com.manny.instantdiet.BaseActivity
import com.manny.instantdiet.adapter.CategoryAdapter
import com.manny.instantdiet.R
import com.manny.instantdiet.adapter.ProductAdapter
import com.manny.instantdiet.databinding.ActivityDashboardBinding
import com.manny.instantdiet.viewModel.DashboardViewModel

class DashboardActivity : BaseActivity() {
    private lateinit var binding: ActivityDashboardBinding
    private lateinit var linearLayout: LinearLayoutManager
    private lateinit var linearLayout2: LinearLayoutManager
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_dashboard)
        binding.viewModel = DashboardViewModel()
        binding.viewModel = ViewModelProvider(this).get(DashboardViewModel::class.java)

        val profileImg = "https://media.istockphoto.com/id/1309328823/photo/headshot-portrait-of-smiling-male-employee-in-office.jpg?s=612x612&w=0&k=20&c=kPvoBm6qCYzQXMAn9JUtqLREXe9-PlZyMl9i-ibaVuY="
        Glide.with(this).load(profileImg).into(binding.ivProfileImg)

        setCategoryAdapter()
        setProductAdapter()

        openProfileActivity()
    }

    private fun openProfileActivity() {
        binding.ivProfileImg.setOnClickListener {
            val intent = Intent(this@DashboardActivity,ProfileActivity::class.java)
            startActivity(intent)
        }
    }

    private fun setProductAdapter() {
        linearLayout2 = LinearLayoutManager(this)
        binding.viewModel?.productEntityLiveData?.observe(this, Observer { productList->
            if(productList!=null){
                binding.rvFoodList.apply {
                    adapter = ProductAdapter(this@DashboardActivity,productList)
                    layoutManager = linearLayout2
                    adapter?.notifyDataSetChanged()
                }
            }
        })
    }

    private fun setCategoryAdapter() {
        linearLayout = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        binding.viewModel?.categoryEntityLiveData?.observe(this, Observer { categoryList->
            if(categoryList!=null){
                binding.rvCategory.apply {
                    adapter = CategoryAdapter(this@DashboardActivity,categoryList)
                    layoutManager = linearLayout
                    adapter?.notifyDataSetChanged()
                }
            }
        })
    }
}