package com.user.transportuser.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.user.transportuser.R
import com.user.transportuser.databinding.ActivityRegisterBinding
import com.user.transportuser.model.Users
import com.user.transportuser.viewmodel.RegisterViewModel

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
