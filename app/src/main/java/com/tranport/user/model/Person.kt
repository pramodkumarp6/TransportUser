package com.tranport.user.model

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import com.tranport.user.BR

class Person(pEmail:String,pPassword: String,pName:String,pSchool:String):BaseObservable() {

    @get:Bindable
     var email: String = pEmail
         set(value){
             field = value
             notifyPropertyChanged(BR.email)
         }

    @get:Bindable
    var password: String = pPassword
        set(value){
            field = value
            notifyPropertyChanged(BR.password)
        }

    @get:Bindable
    var name: String = pName
        set(value){
          field = value
            notifyPropertyChanged(BR.name)
        }

    @get:Bindable
    var school: String =pSchool
        set(value){
            field = value
            notifyPropertyChanged(BR.school)
        }


}