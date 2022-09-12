package com.tranport.user.dash.ui.gallery

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.tranport.user.repository.UserRepository

class AccountViewModel(private val repository: UserRepository) : ViewModel() {

    var email = MutableLiveData<String>()
    var name = MutableLiveData<String>()
    var school = MutableLiveData<String>()

    private val  updateValue = MutableLiveData<AccountResponse>()

    fun getAccountDetails():LiveData<AccountResponse>{
        return updateValue
    }





     fun onUpdate(){

      /*   RetrofitClient.api.accountUpdate(email.value.toString(), name .value.toString(),school.value.toString())
             .enqueue(object : Callback<AccountResponse> {
                 override fun onResponse(
                     call: Call<AccountResponse>, response: Response<AccountResponse>
                 ) {
                   //  updateValue.value = response.body()
                 }


                 override fun onFailure(call: Call<AccountResponse>, t: Throwable) {


                 }

             })
*/
     }
}