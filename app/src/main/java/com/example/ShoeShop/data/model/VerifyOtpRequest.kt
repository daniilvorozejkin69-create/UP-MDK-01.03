package com.example.ShoeShop.data.model

data class VerifyOtpRequest(
    val type: String = "signup",
    val email: String,
    val token: String
)
