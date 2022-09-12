package com.user.transportuser.viewmodel

import androidx.lifecycle.ViewModel
import com.user.transportuser.model.Person
import com.user.transportuser.repository.UserRepository
import com.user.transportuser.utils.Coroutines
import org.json.JSONException

class RegisterViewModel(private val repository: UserRepository):ViewModel(){





    fun onRegister(){

        Coroutines.main {
            try{

            }catch (e: JSONException){

            }
        }
    }





}