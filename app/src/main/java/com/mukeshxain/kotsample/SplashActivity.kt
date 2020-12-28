package com.mukeshxain.kotsample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        init()
    }

    private fun init() {
        supportActionBar?.hide()

        Handler(Looper.getMainLooper()).postDelayed(Runnable {
            finish()
            openLogin()
        }, 2000);
    }

    private fun openLogin() {
        val intent = Intent(this@SplashActivity, LoginActivity::class.java)
        startActivity(intent)
    }
}
