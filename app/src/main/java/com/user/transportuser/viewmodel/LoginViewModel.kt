package com.user.transportuser.viewmodel


import android.text.TextUtils
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.user.transportuser.model.LoginResponse
import com.user.transportuser.network.RetrofitClient
import com.user.transportuser.preference.SharedPrefManager
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class LoginViewModel:ViewModel() {
    var email = MutableLiveData<String>()
    var password = MutableLiveData<String>()

    private val valid = MutableLiveData<String>()
     val myvalues = MutableLiveData<LoginResponse>()

    fun validate():LiveData<String>{

        return valid
    }

    fun getLoginResponse():LiveData<LoginResponse>{
        return myvalues
    }


    fun onLogin() {
        if (TextUtils.isEmpty(email.value)) {
            valid.setValue("Email Is required")
            return
        }
        if (TextUtils.isEmpty(password.value)) {
            valid.setValue("password  Is required")
            return
        }
        Log.e(email.value.toString(),"Hi")

        login()
    }

    fun login() {

          RetrofitClient.api.loginUser(email.value.toString(),password.value.toString())
              .enqueue(object :Callback<LoginResponse>{
                  override fun onResponse(
                      call: Call<LoginResponse>, response: Response<LoginResponse>) {
                      if (!response.body()?.error!!){
                          val loginResponse = response.body();

                          myvalues.value =loginResponse!!
                      }else{
                          myvalues.value = response.body()
                      }

                  }



                  override fun onFailure(call: Call<LoginResponse>, t: Throwable) {


                  }

              })
    }
}
