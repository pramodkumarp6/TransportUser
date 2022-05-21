package com.user.transportuser.network
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.*

class RetrofitClient {
    companion object {
        public const val BASE_URL = "https://big-name-interviewe.000webhostapp.com"

        private val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        val api = retrofit.create(Api::class.java)

    }

}

