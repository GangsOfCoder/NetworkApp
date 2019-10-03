package com.app.base.ui.loginregister

import androidx.lifecycle.MutableLiveData
import com.app.base.api.model.MyViewModel
import com.app.base.bean.login.LoginResponse
import com.app.base.data.register.RegisterResponse
import okhttp3.RequestBody

class LoginRegisterModel : MyViewModel() {
    var registerResponse = MutableLiveData<RegisterResponse>()
    var loginResponse = MutableLiveData<LoginResponse>()
    /*var socialLoginResponse = MutableLiveData<LoginPojo>()*/

    fun loginUser(options: HashMap<String, String>) {
        isLoading.value = true
        LoginRegisterRepository.login({
            loginResponse.value = it
            isLoading.value = false
        }, {
            apiError.value = it
            isLoading.value = false
        }, {
            onFailure.value = it
            isLoading.value = false
        }, options)

    }

    fun registerUser(username: RequestBody, email: RequestBody, password: RequestBody, register: RequestBody) {
        isLoading.value = true
        LoginRegisterRepository.register({
            registerResponse.value = it
            isLoading.value = false
        }, {
            apiError.value = it
            isLoading.value = false
        }, {
            onFailure.value = it
            isLoading.value = false
        }, username,email,password,register)
    }


}