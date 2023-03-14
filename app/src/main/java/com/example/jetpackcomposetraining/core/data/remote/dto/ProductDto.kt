package com.example.jetpackcomposetraining.core.data.remote.dto

import com.google.gson.annotations.SerializedName

data class ProductDto(

    @SerializedName("code")
    val code: String,

    @SerializedName("name")
    val name: String,

    @SerializedName("price")
    val price: Double
)