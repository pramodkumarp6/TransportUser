package com.user.transportuser.viewmodel

import androidx.lifecycle.ViewModel
import com.user.transportuser.model.Person
import com.user.transportuser.repository.UserRepository

class UserForgetViewModel(private val repository: UserRepository):ViewModel(){
    var person = Person("p@gmail.com","pandey","Pramod","giit")
}