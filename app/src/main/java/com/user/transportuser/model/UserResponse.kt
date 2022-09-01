package com.user.transportuser.model

import com.google.gson.annotations.SerializedName

data class UserResponse (
    @SerializedName("error")
    var error: Boolean,
    @SerializedName("meassage")
    var message:String,
    @SerializedName("users")
    var users: List<Users>

    )