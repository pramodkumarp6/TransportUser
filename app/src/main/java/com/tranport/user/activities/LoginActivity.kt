package com.tranport.user.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.tranport.user.R
import com.tranport.user.dash.MainActivity
import com.tranport.user.databinding.ActivityLoginBinding
import com.tranport.user.preference.SharedPrefManager
import com.tranport.user.viewmodel.LoginViewModel


class LoginActivity : AppCompatActivity() {
    private lateinit var loginBinding: ActivityLoginBinding
    private lateinit var loginViewModel: LoginViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        loginBinding = DataBindingUtil.setContentView(this, R.layout.activity_login)
        title ="LoginActivity"
       

        loginViewModel = ViewModelProvider(this).get(LoginViewModel::class.java)
        loginBinding.loginViewModel =loginViewModel

        loginViewModel.validate().observe(this, Observer { it->
            Toast.makeText(this,it,Toast.LENGTH_LONG).show()

        })

        loginViewModel.getLoginResponse().observe(this, Observer {it->
            if (it.error == false){
                SharedPrefManager.getInstance(applicationContext).saveUser(it.user)
                val intent = Intent(this,MainActivity::class.java)
                startActivity(intent)
            }else{

                Toast.makeText(this,it.massage,Toast.LENGTH_LONG).show()

            }






        })



    }

     fun userRegister(view: View) {
        val intent = Intent(this,RegisterActivity::class.java)
        startActivity(intent)
    }

    fun userForget(view: View) {
        val intent = Intent(this,UserForgetActivity::class.java)
        startActivity(intent)
    }
}