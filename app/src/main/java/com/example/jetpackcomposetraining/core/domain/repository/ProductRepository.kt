package com.example.jetpackcomposetraining.core.domain.repository

import com.example.jetpackcomposetraining.core.domain.model.ProductItem

interface ProductRepository {
    suspend fun getProducts():Result<List<ProductItem>>
    suspend fun getCart(): List<ProductItem> // TODO: Separate in two repositories, Cart and Home
}