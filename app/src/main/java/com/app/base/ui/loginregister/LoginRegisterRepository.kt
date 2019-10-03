package com.app.base.ui.loginregister

import com.app.base.api.service.ApiHelper
import com.app.base.bean.login.LoginResponse
import com.app.base.data.register.RegisterResponse
import okhttp3.RequestBody
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

object LoginRegisterRepository {


    private val webService = ApiHelper.createService()

    fun register(successHandler: (RegisterResponse) -> Unit,
                 failureHandler: (String) -> Unit,
                 onFailure: (Throwable) -> Unit, username: RequestBody, email: RequestBody, password: RequestBody, register: RequestBody) {
        webService.register(username,email,password,register).enqueue(object : Callback<RegisterResponse> {
            override fun onResponse(call: Call<RegisterResponse>?, response: Response<RegisterResponse>?) {
                response?.body()?.let {
                    successHandler(it)
                }

                if (response?.code() == 422) {
                    response.errorBody()?.let {
                        val error = ApiHelper.handleAuthenticationError(response.errorBody()!!)
                        failureHandler(error)
                    }

                } else {
                    response?.errorBody()?.let {
                        val error = ApiHelper.handleApiError(response.errorBody()!!)
                        failureHandler(error)
                    }
                }
            }

            override fun onFailure(call: Call<RegisterResponse>?, t: Throwable?) {
                t?.let {
                    onFailure(it)
                }
            }
        })
    }

    fun login(successHandler: (LoginResponse) -> Unit,
              failureHandler: (String) -> Unit,
              onFailure: (Throwable) -> Unit, data: HashMap<String, String>) {
        webService.login(data).enqueue(object : Callback<LoginResponse> {
            override fun onResponse(call: Call<LoginResponse>?, response: Response<LoginResponse>?) {
                response?.body()?.let {
                    successHandler(it)
                }

                if (response?.code() == 422) {
                    response.errorBody()?.let {
                        val error = ApiHelper.handleAuthenticationError(response.errorBody()!!)
                        failureHandler(error)
                    }

                } else {
                    response?.errorBody()?.let {
                        val error = ApiHelper.handleApiError(response.errorBody()!!)
                        failureHandler(error)
                    }
                }
            }

            override fun onFailure(call: Call<LoginResponse>?, t: Throwable?) {
                t?.let {
                    onFailure(it)
                }
            }
        })
    }
}