package com.tranport.user.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.tranport.user.R
import com.tranport.user.databinding.ActivityUserForgetBinding

class UserForgetActivity : AppCompatActivity() {
    private lateinit var forgetBinding:ActivityUserForgetBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
               forgetBinding = DataBindingUtil.setContentView(this, R.layout.activity_user_forget)
    }
}