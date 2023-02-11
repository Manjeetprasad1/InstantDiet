package com.manny.instantdiet.itemViewModel

import android.content.Context
import com.manny.instantdiet.ItemProvider
import com.manny.instantdiet.entity.ProductEntity

class ProductItemViewModel(val productEntity: ProductEntity,val listener : ProductItemListener) : ItemProvider{

    fun onItemClick(){
        listener.onClick(this)
    }
    interface ProductItemListener{
        fun onClick(itemViewModel : ProductItemViewModel)
    }
}