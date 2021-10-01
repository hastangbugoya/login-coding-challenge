package com.example.login_coding_challenge.data

import com.example.login_coding_challenge.model.LoginUserRequest
import com.example.login_coding_challenge.model.LoginUserResponse

class LoginRemoteData(private val loginService: ILoginService) {
    suspend fun loginUser(loginUserRequest: LoginUserRequest): LoginUserResponse {
        return loginService.loginUser(loginUserRequest)
    }
}