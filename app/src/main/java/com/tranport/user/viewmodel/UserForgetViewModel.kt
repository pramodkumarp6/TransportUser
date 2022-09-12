package com.tranport.user.viewmodel

import androidx.lifecycle.ViewModel
import com.tranport.user.model.Person
import com.tranport.user.repository.UserRepository

class UserForgetViewModel(private val repository: UserRepository):ViewModel(){
    var person = Person("p@gmail.com","pandey","Pramod","giit")
}