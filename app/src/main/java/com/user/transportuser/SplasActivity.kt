package com.user.transportuser

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.user.transportuser.activities.LoginActivity
import com.user.transportuser.databinding.ActivitySplashBinding

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