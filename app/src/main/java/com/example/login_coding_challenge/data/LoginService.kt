package com.example.login_coding_challenge.data

import com.example.login_coding_challenge.model.LoginUserRequest
import com.example.login_coding_challenge.model.LoginUserResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.withContext

class LoginService: ILoginService {
    override suspend fun loginUser(loginUserRequest: LoginUserRequest): LoginUserResponse {
        return withContext(Dispatchers.IO) {
            delay(2000)
            val statusCode = "0000"
            val statusDescription = "SUCCESS"
            LoginUserResponse(
                    statusCode = statusCode,
                    statusDescription = statusDescription
            )
        }
    }
}