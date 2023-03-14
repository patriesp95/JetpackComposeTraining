package com.example.jetpackcomposetraining.core.data.di

import com.example.jetpackcomposetraining.core.data.ProductRepositoryImpl
import com.example.jetpackcomposetraining.core.data.remote.ProductApi
import com.example.jetpackcomposetraining.core.domain.repository.ProductRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object ProductModule {

    @Provides
    @Singleton
    fun provideApi(): ProductApi {
        return Retrofit.Builder().baseUrl(ProductApi.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .client(OkHttpClient.Builder().build()).build().create()
    }


    @Provides
    @Singleton
    fun provideRepository(api: ProductApi): ProductRepository {
        return ProductRepositoryImpl(api = api)
    }
}