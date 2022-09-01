package com.user.transportuser.network

import com.user.transportuser.dash.ui.gallery.AccountResponse
import com.user.transportuser.model.LoginResponse
import com.user.transportuser.model.RegisterResponse
import com.user.transportuser.model.UserResponse
import retrofit2.Call
import retrofit2.http.*


interface Api{
@FormUrlEncoded
@POST("/simple/public/createuser")
 fun createUser(
    @Field("email") email: String,
    @Field("password") password: String,
    @Field("name") name: String,
    @Field("school") school: String
): Call<RegisterResponse>

@FormUrlEncoded
@POST("/simple/public/userlogin")
 fun loginUser(
    @Field("email") email: String,
    @Field("password") password: String

): Call<LoginResponse>

    @FormUrlEncoded
    @POST("/simple/public/updateuser/{id}")
    fun accountUpdate(
        @Path("id") id: String?,
        @Field("email") email: String?,
        @Field("name") name: String?,
        @Field("school") school: String?
    ): Call<AccountResponse>

@GET("/simple/public/allusers")
@Headers("Content-type:application/json")
fun getUser(): Call<UserResponse>

}