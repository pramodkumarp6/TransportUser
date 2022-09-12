package com.tranport.user

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.tranport.user.activities.LoginActivity
import com.tranport.user.databinding.ActivitySplashBinding


class SplasActivity : AppCompatActivity() {
    private lateinit var mbinding: ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val mbinding: ActivitySplashBinding = DataBindingUtil.setContentView(this, R.layout.activity_splash);
        mbinding.user = User("Hello")
        tata()
    }


    fun tata(){
        val intent = Intent(this,LoginActivity::class.java)
        startActivity(intent)
    }
}