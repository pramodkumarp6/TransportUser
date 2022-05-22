package com.user.transportuser.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.user.transportuser.R
import com.user.transportuser.databinding.ActivityUserForgetBinding

class UserForgetActivity : AppCompatActivity() {
    private lateinit var forgetBinding:ActivityUserForgetBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
               forgetBinding = DataBindingUtil.setContentView(this, R.layout.activity_user_forget)
    }
}