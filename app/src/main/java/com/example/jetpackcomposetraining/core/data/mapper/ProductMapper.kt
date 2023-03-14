package com.example.jetpackcomposetraining.core.data.mapper

import com.example.jetpackcomposetraining.core.data.remote.dto.ProductDto
import com.example.jetpackcomposetraining.core.domain.model.ProductCode
import com.example.jetpackcomposetraining.core.domain.model.ProductItem

fun ProductDto.toDomain() : ProductItem {
    return ProductItem(
        code = ProductCode.valueOf(this.code),
        name = this.name,
        price = this.price
    )
}