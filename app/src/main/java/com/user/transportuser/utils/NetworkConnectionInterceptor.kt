package com.user.transportuser.utils

import android.content.Context
import android.net.ConnectivityManager
import android.os.Build
import androidx.annotation.RequiresApi
import okhttp3.Interceptor
import okhttp3.Response

class NetworkConnectionInterceptor(context: Context) : Interceptor {
    private val applicationContext =context.applicationContext

    @RequiresApi(Build.VERSION_CODES.M)
    override fun intercept(chain: Interceptor.Chain): Response {
        if (!isInternetAvailable())
            throw NoInternetException("")
        return chain.proceed(chain.request())

    }
    @RequiresApi(Build.VERSION_CODES.M)
    private fun isInternetAvailable():Boolean {
        val connectivityManager =applicationContext.getSystemService(Context.CONNECTIVITY_SERVICE)
            as ConnectivityManager.activeNetworkInfo.also{
                return it != null && it.isConneted
        }



    }
}