package com.user.transportuser.viewmodel

import android.text.TextUtils
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.user.transportuser.model.LoginResponse
import com.user.transportuser.repository.UserRepository
import com.user.transportuser.utils.Coroutines
import org.json.JSONException


class LoginViewModel(private val repository: UserRepository) : ViewModel() {
    var email = MutableLiveData<String>()
    var password = MutableLiveData<String>()

    private val valid = MutableLiveData<String>()
    val myvalues = MutableLiveData<LoginResponse>()

    fun validate(): LiveData<String> {

        return valid
    }

    fun getLoginResponse(): LiveData<LoginResponse> {
        return myvalues
    }


    fun onLogin() {


        login()
    }

    fun login() {
        if (TextUtils.isEmpty(email.value)) {
            valid.setValue("Email Is required")
            return
        }
        if (TextUtils.isEmpty(password.value)) {
            valid.setValue("password  Is required")
            return
        }
        Log.e(email.value.toString(), "Email")
        Log.e(password.value.toString(), "password")


        Coroutines.main {
            try{
                //val userResponse = repository.loginUser(email.value,password.value)

            }catch (e: JSONException){

            }
        }


    }
}
