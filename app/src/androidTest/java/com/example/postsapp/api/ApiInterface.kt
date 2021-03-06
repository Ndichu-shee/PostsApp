package com.example.postsapp.api

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.POST

interface ApiInterface {
    @GET( "posts")
    suspend fun getPosts(): Response<List<POST>>
}