package com.manny.instantdiet.fragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide
import com.manny.instantdiet.R
import com.manny.instantdiet.activity.DashboardActivity
import com.manny.instantdiet.activity.ProfileActivity
import com.manny.instantdiet.adapter.CategoryAdapter
import com.manny.instantdiet.adapter.ProductAdapter
import com.manny.instantdiet.databinding.FragmentHomeBinding
import com.manny.instantdiet.viewModel.DashboardViewModel

class HomeFragment : Fragment() {
    private lateinit var binding : FragmentHomeBinding

    private lateinit var linearLayout: LinearLayoutManager
    private lateinit var linearLayout2: LinearLayoutManager
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_home,container,false)
        binding.viewModel  = ViewModelProvider(this).get(DashboardViewModel::class.java)
        binding.lifecycleOwner = this

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val profileImg = "https://media.istockphoto.com/id/1309328823/photo/headshot-portrait-of-smiling-male-employee-in-office.jpg?s=612x612&w=0&k=20&c=kPvoBm6qCYzQXMAn9JUtqLREXe9-PlZyMl9i-ibaVuY="
        Glide.with(this).load(profileImg).into(binding.ivProfileImg)

        setCategoryAdapter()
        setProductAdapter()

        openProfileActivity()
        openProductDetailScreen()
    }

    private fun openProductDetailScreen() {
        binding.viewModel?.onItemClick?.observe(viewLifecycleOwner, Observer {
            if (it){
                (activity as DashboardActivity).replaceFragment(ProductDetailFragment())
            }
        })
    }

    private fun openProfileActivity() {
    binding.ivProfileImg.setOnClickListener {
        val intent = Intent(requireContext(), ProfileActivity::class.java)
        startActivity(intent)
    }
}

private fun setProductAdapter() {
    linearLayout2 = LinearLayoutManager(requireContext())
    binding.viewModel?.productEntityLiveData?.observe(viewLifecycleOwner, Observer { productList->
        if(productList!=null){
            binding.rvFoodList.apply {
                adapter = ProductAdapter(requireContext(),productList)
                layoutManager = linearLayout2
                adapter?.notifyDataSetChanged()
            }
        }
    })
}

private fun setCategoryAdapter() {
    linearLayout = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL,false)
    binding.viewModel?.categoryEntityLiveData?.observe(viewLifecycleOwner, Observer { categoryList->
        if(categoryList!=null){
            binding.rvCategory.apply {
                adapter = CategoryAdapter(requireContext(),categoryList)
                layoutManager = linearLayout
                adapter?.notifyDataSetChanged()
            }
        }
    })
}
}