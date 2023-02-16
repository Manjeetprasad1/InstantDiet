package com.manny.instantdiet.activity

import android.content.Intent
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.manny.instantdiet.BaseActivity
import com.manny.instantdiet.R
import com.manny.instantdiet.databinding.ActivityLoginBinding
import com.manny.instantdiet.viewModel.DashboardViewModel
import com.manny.instantdiet.viewModel.LoginViewModel

class LoginActivity : BaseActivity() {

    private lateinit var binding : ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_login)
        binding.viewModel = LoginViewModel()
        binding.viewModel = ViewModelProvider(this).get(LoginViewModel::class.java)


        binding.tvContinue.setOnClickListener {
            val intent = Intent(this@LoginActivity,OtpActivity::class.java)
            startActivity(intent)
        }
    }
}