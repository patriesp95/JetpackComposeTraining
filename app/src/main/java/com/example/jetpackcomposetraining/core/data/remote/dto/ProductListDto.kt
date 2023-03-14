package com.example.jetpackcomposetraining.core.data.remote.dto

import com.google.gson.annotations.SerializedName

data class ProductListDto(

    @SerializedName("products")
    val products: List<ProductDto>
)