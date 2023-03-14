package com.example.jetpackcomposetraining.core.data

import com.example.jetpackcomposetraining.core.data.mapper.toDomain
import com.example.jetpackcomposetraining.core.data.remote.ProductApi
import com.example.jetpackcomposetraining.core.domain.model.ProductItem
import com.example.jetpackcomposetraining.core.domain.repository.ProductRepository

class ProductRepositoryImpl(
    private val api: ProductApi
) : ProductRepository {
    override suspend fun getProducts(): Result<List<ProductItem>> {
        return try {
            val items = api.getProducts()
            val mapped = items.products.map { it.toDomain() }
            Result.success(mapped)
        }catch (e: Exception){
            Result.failure(e)
        }
    }

    override suspend fun getCart(): List<ProductItem> {
        TODO("Not yet implemented")
    }
}