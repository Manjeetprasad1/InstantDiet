package com.manny.instantdiet.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.manny.instantdiet.BaseActivity
import com.manny.instantdiet.R

class ItemDetailActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_details)
    }
}