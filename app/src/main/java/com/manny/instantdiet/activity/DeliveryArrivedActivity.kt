package com.manny.instantdiet.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.manny.instantdiet.databinding.ActivityDeliveryArrivedBinding

class DeliveryArrivedActivity : AppCompatActivity() {
    private lateinit var binding :ActivityDeliveryArrivedBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityDeliveryArrivedBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}