package com.example.login_coding_challenge.repository

import com.example.login_coding_challenge.model.LoginLocalData
import com.example.login_coding_challenge.model.LoginRemoteData
import com.example.login_coding_challenge.model.LoginUserRequest
import com.example.login_coding_challenge.model.LoginUserResponse
import kotlinx.coroutines.Dispatchers

class LoginRepository(
    private val loginRemoteData: LoginRemoteData,
    private val loginLocalData: LoginLocalData
) {
    fun isUserRemembered(): Boolean {
        TODO()
    }

    fun rememberUser(email: String) {
        loginLocalData.rememberUser(email)
    }

    suspend fun logInUser(loginUserRequest: LoginUserRequest): LoginUserResponse {
        TODO()
    }
}