package com.manny.instantdiet.entity

data class ProductEntity(
    val isVeg: Boolean? = null,
    val foodName: String? = null,
    val salingStatus: String? = null,
    val foodDescription: String? = null,
    val imageUrl: String? = null,
    val price: String? = null,
    val rating: Double? = null
)
