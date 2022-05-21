package com.user.transportuser.model

import com.google.gson.annotations.SerializedName

data class LoginResponse(

    @SerializedName("error")
    val error: Boolean,
    @SerializedName("message")
    val massage: String,
    @SerializedName("user")
    val user: User
)
