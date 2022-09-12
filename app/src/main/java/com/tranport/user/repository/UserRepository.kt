package com.tranport.user.repository

import com.tranport.user.model.LoginResponse
import com.tranport.user.model.RegisterResponse
import com.tranport.user.network.RetrofitClient
import com.tranport.user.network.SafeApiRequest

class UserRepository : SafeApiRequest() {

    suspend fun loginUser(email: String, password: String): LoginResponse {

        return apiRequest { RetrofitClient.invoke().loginUser(email, password) }
    }


    suspend fun createUser(
        email: String,
        password: String,
        name: String,
        school: String
    ): RegisterResponse {
        return apiRequest { RetrofitClient.invoke().createUser(email, password, name, school) }


    }
}