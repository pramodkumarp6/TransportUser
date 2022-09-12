package com.tranport.user.network

import com.tranport.user.dash.ui.gallery.AccountResponse
import com.tranport.user.model.LoginResponse
import com.tranport.user.model.RegisterResponse
import com.tranport.user.model.UserResponse
import retrofit2.Response
import retrofit2.http.*


interface Api{
@FormUrlEncoded
@POST("createuser")
 suspend fun createUser(
    @Field("email") email: String,
    @Field("password") password: String,
    @Field("name") name: String,
    @Field("school") school: String
): Response<RegisterResponse>

@FormUrlEncoded
@POST("userlogin")
 suspend fun loginUser(
    @Field("email") email: String,
    @Field("password") password: String

): Response<LoginResponse>

    @FormUrlEncoded
    @POST("/simple/public/updateuser/{id}")
   suspend fun accountUpdate(
        @Path("id") id: String?,
        @Field("email") email: String?,
        @Field("name") name: String?,
        @Field("school") school: String?
    ): Response<AccountResponse>

@GET("/simple/public/allusers")
@Headers("Content-type:application/json")
 suspend fun getUser(): Response<UserResponse>

}