package com.app.base.bean.login

import com.google.gson.annotations.SerializedName

data class LoginResponse(

        @field:SerializedName("message")
        val message: String? = null,

        @field:SerializedName("status")
        val status: String? = null
)