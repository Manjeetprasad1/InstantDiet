package com.manny.instantdiet.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.manny.instantdiet.databinding.ActivityLocationMapBinding

class LocationMapActivity : AppCompatActivity() {
    private lateinit var binding :ActivityLocationMapBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityLocationMapBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}