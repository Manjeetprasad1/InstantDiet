package com.manny.instantdiet.itemViewModel

import com.manny.instantdiet.ItemProvider
import com.manny.instantdiet.entity.CategoryEntity

class CategoryItemViewModel(val categoryEntity: CategoryEntity,val listener : CategoryItemListener)
    : ItemProvider {
    fun onItemClick(){
        listener.onClick(this)
    }
    interface CategoryItemListener {
        fun onClick(itemViewModel: CategoryItemViewModel)
    }

}

