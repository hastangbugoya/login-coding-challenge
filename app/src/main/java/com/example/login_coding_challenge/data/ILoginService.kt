package com.example.login_coding_challenge.data

import com.example.login_coding_challenge.model.LoginUserRequest
import com.example.login_coding_challenge.model.LoginUserResponse

interface ILoginService {
    suspend fun loginUser(loginUserRequest: LoginUserRequest): LoginUserResponse
}