package com.user.transportuser.repository

import android.provider.ContactsContract
import com.user.transportuser.model.LoginResponse
import com.user.transportuser.model.RegisterResponse
import com.user.transportuser.network.RetrofitClient
import com.user.transportuser.network.SafeApiRequest
import retrofit2.Response

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