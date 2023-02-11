package com.manny.instantdiet.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.manny.instantdiet.ItemProvider
import com.manny.instantdiet.databinding.ItemCategoryBinding
import com.manny.instantdiet.itemViewModel.CategoryItemViewModel

class CategoryAdapter(val context: Context, val categoryList : ArrayList<ItemProvider>) :  RecyclerView.Adapter<CategoryAdapter.ViewHolder>() {

    class ViewHolder(val binding: ItemCategoryBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(data: ItemProvider) {
            binding.itemViewModel = data as CategoryItemViewModel
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemViewBinding = ItemCategoryBinding.inflate(LayoutInflater.from(context),parent,false)
        return ViewHolder(itemViewBinding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(categoryList[position])
    }

    override fun getItemCount(): Int {
        return categoryList.size
    }
}