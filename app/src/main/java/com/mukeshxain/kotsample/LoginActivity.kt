package com.mukeshxain.kotsample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Settings
import android.util.Log
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.mukeshxain.kotsample.databinding.ActivityLoginBinding
import kotlinx.coroutines.*

class LoginActivity : AppCompatActivity() {

    companion object {
        val TAG: String = "LoginActivity"
    }

    private lateinit var mBinding: ActivityLoginBinding
    private lateinit var name01: String
    var name = "Hello"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = DataBindingUtil.setContentView(this@LoginActivity, R.layout.activity_login)
        supportActionBar?.hide()
        init()
        temp()
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
        print(this::name01.isInitialized)
    }

    private fun openDashboard() {
        finish()
        val intent = Intent(this@LoginActivity, DashboardActivity::class.java)
        startActivity(intent)
    }

    private fun temp() {
        /*GlobalScope.launch {
            delay(1000L)
            println("World")
        }
        println("Hello")
        //Thread.sleep(2000L)
        runBlocking {
            delay(2000L)
        }*/

        GlobalScope.async {
            println("Hello")
        }
    }

    private fun sayHello() {
        println("Say hello $name")
        var listOfMindOrks = listOf("mindorks.com", "blog.mindorks.com", "afteracademy.com")
        listOfMindOrks.forEach {
            Log.d(TAG, it)
        }
    }

}