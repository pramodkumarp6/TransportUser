package com.user.transportuser.network

import android.util.Base64

class Url {
    private val Auth = "Basic " + Base64.encodeToString("user:123456".toByteArray(), Base64.NO_WRAP)
   // private val AUTH = "Basic " + Base64.encodeToString("belalkhan:123456".toByteArray(), Base64.NO_WRAP)
}