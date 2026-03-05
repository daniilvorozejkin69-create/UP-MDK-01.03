package com.example.ShoeShop.data.model

data class UpdateProfileDto(
    val firstname: String,
    val lastname: String,
    val address: String,
    val phone: String,
    val photo: String? = null
)