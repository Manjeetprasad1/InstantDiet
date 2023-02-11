package com.manny.instantdiet.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.manny.instantdiet.ItemProvider
import com.manny.instantdiet.databinding.ItemCategoryBinding
import com.manny.instantdiet.databinding.ItemProductBinding
import com.manny.instantdiet.itemViewModel.CategoryItemViewModel
import com.manny.instantdiet.itemViewModel.ProductItemViewModel

class ProductAdapter(val context: Context, val productList : ArrayList<ItemProvider>) :  RecyclerView.Adapter<ProductAdapter.ViewHolder>() {

   inner class ViewHolder(val binding: ItemProductBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(data: ItemProvider) {
            binding.itemViewModel = data as ProductItemViewModel
            Glide.with(context).load(data.productEntity.imageUrl).into(binding.ivFoodImg)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemViewBinding = ItemProductBinding.inflate(LayoutInflater.from(context),parent,false)
        return ViewHolder(itemViewBinding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(productList[position])
    }

    override fun getItemCount(): Int {
        return productList.size
    }
}