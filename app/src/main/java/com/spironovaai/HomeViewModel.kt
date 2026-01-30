package com.spironovaai

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.spironovaai.data.remote.model.UserResponse
import com.spironovaai.data.repository.UserRepository
import com.spironovaai.utils.NetworkResult
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class HomeViewModel : ViewModel() {

    fun getUserId(): String {
        return "101" // example
    }

    private val repository = UserRepository()

    private val _userState = MutableStateFlow<NetworkResult<UserResponse>>(NetworkResult.Loading)
    val userState: StateFlow<NetworkResult<UserResponse>> = _userState

    fun fetchUser(userId: String) {
        viewModelScope.launch {
            _userState.value = NetworkResult.Loading
            val result = repository.getUser(userId)
            _userState.value = result
        }
    }
}
