package com.example.postsapp.api

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiClient {
    var client=OkHttpClient.Builder().build()
    var retrofit=Retrofit.Builder()
        .baseUrl( "")
        .addConverterFactory(GsonConverterFactory.create())
        .client()
        .build()
    fun <T> buildServices(service:Class<T>) : T{
        return retrofit.create(service())
    }
}