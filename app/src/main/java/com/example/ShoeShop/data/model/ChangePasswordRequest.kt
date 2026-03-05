package com.example.ShoeShop.data.model

data class ChangePasswordRequest(
    val email: String,
    val newPassword: String
)
