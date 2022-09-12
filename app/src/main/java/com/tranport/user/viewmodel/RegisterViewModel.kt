package com.tranport.user.viewmodel

import androidx.lifecycle.ViewModel
import com.tranport.user.repository.UserRepository
import com.tranport.user.utils.Coroutines
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