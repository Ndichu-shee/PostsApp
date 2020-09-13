package com.example.postsapp.repository

import com.example.postsapp.api.ApiInterface
import com.example.postsapp.models.Post
import retrofit2.Response

class PostsRepository {
    suspend fun getPosts(): Response<Post>> = withContext(Dispatchers.IO){
        val apiInterface:ApiInterface.buildServices(ApiInterface::class.java)
        val response :Response<List<Post>> =apiInterface.getPosts()
        return@withContext response
    }
}