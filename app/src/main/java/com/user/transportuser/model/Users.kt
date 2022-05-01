package com.user.transportuser.model

import android.provider.ContactsContract
import androidx.databinding.BaseObservable
import androidx.databinding.Bindable

data class Users(


    var text:String,
     val email:String,



    var password:String,
    var name:String,
    var school:String




    ): BaseObservable()
