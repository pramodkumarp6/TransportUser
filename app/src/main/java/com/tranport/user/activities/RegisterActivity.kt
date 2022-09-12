package com.tranport.user.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.tranport.user.R
import com.tranport.user.databinding.ActivityRegisterBinding
import com.tranport.user.model.Users
import com.tranport.user.viewmodel.RegisterViewModel

class RegisterActivity : AppCompatActivity() {
    private lateinit var registerbinding: ActivityRegisterBinding
    private lateinit var users: Users
    private lateinit var registerViewModel: RegisterViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        registerbinding = DataBindingUtil.setContentView(this, R.layout.activity_register)
        registerViewModel = ViewModelProvider(this).get(RegisterViewModel::class.java)

        setTitle("RegisterActivity")
        registerbinding.handler = this
        registerbinding.registerViewModel = registerViewModel

        //registerbinding.users = Users("Registration","p@gmail.com","pa","Pandey","Giit")

    }

    fun register() {

    }

}
