package com.tranport.user.dash.ui.slideshow

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.tranport.user.model.UserResponse
import com.tranport.user.repository.UserRepository

class SlideshowViewModel(private val repository: UserRepository) : ViewModel() {

    private val  userDetails = MutableLiveData<UserResponse>()

    fun getUserDetails():LiveData<UserResponse>{

        return userDetails
        userDetails()
    }






    fun userDetails(){

          }
}