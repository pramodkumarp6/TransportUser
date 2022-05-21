package com.user.transportuser.model

import com.google.gson.annotations.SerializedName

data class User(
    @SerializedName("id")
    val id: Int,
    @SerializedName("email")
    var email: String?,

    @SerializedName("name")
    var name: String?,
    @SerializedName("school")
    var school: String?
)
