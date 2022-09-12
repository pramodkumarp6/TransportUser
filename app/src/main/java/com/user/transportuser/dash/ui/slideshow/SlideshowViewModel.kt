package com.user.transportuser.dash.ui.slideshow

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.user.transportuser.model.LoginResponse
import com.user.transportuser.model.UserResponse
import com.user.transportuser.network.RetrofitClient
import com.user.transportuser.repository.UserRepository
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class SlideshowViewModel(private val repository: UserRepository) : ViewModel() {

    private val  userDetails = MutableLiveData<UserResponse>()

    fun getUserDetails():LiveData<UserResponse>{

        return userDetails
        userDetails()
    }






    fun userDetails(){

          }
}