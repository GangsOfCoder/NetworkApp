package com.app.base.data.register

import com.google.gson.annotations.SerializedName

data class RegisterResponse(

        @field:SerializedName("status")
        var status: Int? = null,
        @field:SerializedName("message")
        var message: String? = null
        /*,
        @field:SerializedName("user_info")
        var user_info: RegisterUserInfo? = null*/
)