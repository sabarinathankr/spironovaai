package com.spironovaai.data.remote.api

import com.spironovaai.data.remote.model.UserResponse
import retrofit2.Response

import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {

    @GET("users/{id}")
    suspend fun getUser(
        @Path("id") userId: String
    ): Response<UserResponse>
}
