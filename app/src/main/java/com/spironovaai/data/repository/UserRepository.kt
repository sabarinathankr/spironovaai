package com.spironovaai.data.repository

import com.spironovaai.data.remote.client.RetrofitClient
import com.spironovaai.data.remote.model.UserResponse
import com.spironovaai.utils.NetworkResult

class UserRepository {

    private val api = RetrofitClient.api

    suspend fun getUser(userId: String): NetworkResult<UserResponse> {
        return try {
            val response = api.getUser(userId)
            if (response.isSuccessful && response.body() != null) {
                NetworkResult.Success(response.body()!!)
            } else {
                NetworkResult.Error(response.message())
            }
        } catch (e: Exception) {
            NetworkResult.Error(e.localizedMessage ?: "Unknown error")
        }
    }
}
