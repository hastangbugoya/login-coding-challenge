package com.example.login_coding_challenge.model

import kotlinx.coroutines.delay
import kotlinx.coroutines.withContext
import kotlin.coroutines.CoroutineContext

class LoginRemoteData {
    suspend fun loginUser(loginUserRequest: LoginUserRequest, coroutineContext: CoroutineContext): LoginUserResponse {
        return withContext(coroutineContext) {
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