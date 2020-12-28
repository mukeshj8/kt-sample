package com.mukeshxain.kotsample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.mukeshxain.kotsample.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var mBinding: ActivityLoginBinding;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = DataBindingUtil.setContentView(this@LoginActivity, R.layout.activity_login)
        supportActionBar?.hide()
        init()
    }

    private fun init() {
        mBinding.bLogin.setOnClickListener {
            if (mBinding.etUsername.text.isEmpty() || mBinding.etPass.text.isEmpty()) {
                Toast.makeText(
                    this@LoginActivity,
                    "Username/Password shouldn't be empty",
                    Toast.LENGTH_SHORT
                ).show()
            } else {
                openDashboard()
            }
        }
    }

    private fun openDashboard() {
        finish()
        val intent = Intent(this@LoginActivity, DashboardActivity::class.java)
        startActivity(intent)
    }

}