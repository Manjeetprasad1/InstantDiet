package com.manny.instantdiet.activity

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.manny.instantdiet.BaseActivity
import com.manny.instantdiet.MainActivity
import com.manny.instantdiet.R


class SplashActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler(Looper.myLooper()!!).postDelayed(Runnable { // This method will be executed once the timer is over
            val i = Intent(this@SplashActivity, LoginActivity::class.java)
            startActivity(i)
            finish()
        }, 3000)
    }
}