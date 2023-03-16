package com.manny.instantdiet.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.manny.instantdiet.databinding.ActivityLocationMapBinding

class LocationMapActivity : AppCompatActivity() {
    private lateinit var binding :ActivityLocationMapBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityLocationMapBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        initViews()
        setContentView(binding.root)

    }
    private fun initViews(){
        Handler(Looper.getMainLooper()).postDelayed(Runnable{
                val intent = Intent(Intent(this , DeliveryArrivedActivity::class.java))
            startActivity(intent)
            },10000
        )
    }
}