package com.user.transportuser.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.user.transportuser.R
import com.user.transportuser.databinding.ActivityLoginBinding
import com.user.transportuser.viewmodel.LoginViewModel

class LoginActivity : AppCompatActivity() {
    private lateinit var loginActivity: ActivityLoginBinding
    private lateinit var loginViewModel: LoginViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        loginActivity = DataBindingUtil.setContentView(this, R.layout.activity_login)

       title ="LoginActivity"
       

        loginViewModel = ViewModelProvider(this).get(LoginViewModel::class.java)


        register()

    }

    private fun register() {
        val intent = Intent(this,RegisterActivity::class.java)
        startActivity(intent)
    }
}