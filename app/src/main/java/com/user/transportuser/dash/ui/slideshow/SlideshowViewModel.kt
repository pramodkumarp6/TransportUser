package com.user.transportuser.dash.ui.slideshow

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.user.transportuser.model.LoginResponse
import com.user.transportuser.model.UserResponse
import com.user.transportuser.network.RetrofitClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class SlideshowViewModel : ViewModel() {

    private val  userDetails = MutableLiveData<UserResponse>()

    fun getUserDetails():LiveData<UserResponse>{

        return userDetails
        userDetails()
    }






    fun userDetails(){

        RetrofitClient.api.getUser()
            .enqueue(object : Callback<UserResponse> {
                override fun onResponse(
                    call: Call<UserResponse>, response: Response<UserResponse>) {

                    userDetails.value =response.body()
                    Log.e(response.body().toString(),"response")



                }

                override fun onFailure(call: Call<UserResponse>, t: Throwable) {

                }


            })
    }
}