package com.user.transportuser.model

import android.provider.ContactsContract
import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import com.google.gson.annotations.SerializedName

data class Users(

    @SerializedName("id")
    val id: Int,
    @SerializedName("email")
    var email: String?,

    @SerializedName("name")
    var name: String?,
    @SerializedName("school")
    var school: String?
)
