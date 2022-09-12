package com.tranport.user.utils

import java.io.IOException

class Exceptions{

        class ApiException(message: String) : IOException(message)
        class NoInternetException(message: String) : IOException(message)
    }






