package com.example.login_coding_challenge.model

import kotlinx.coroutines.delay
import kotlinx.coroutines.withContext
import kotlin.coroutines.CoroutineContext

class LoginRemoteData {
    suspend fun loginUser(loginUserRequest: LoginUserRequest, coroutineContext: CoroutineContext): LoginUserResponse {
        return withContext(coroutineContext) {
            delay(2000)
            val loginErrors = mutableListOf<LoginError>()
            if(loginUserRequest.email.contains("bad")) {
                loginErrors.add(LoginError("email","Email contains bad string"))
            }

            if(loginUserRequest.password.length < 8) {
                loginErrors.add(LoginError("password","Password is less than 8 characters"))
            }

            val statusCode = if(loginErrors.isEmpty()) "0000" else "0001"
            val statusDescription = if(loginErrors.isEmpty()) "SUCCESS" else "FAIL"
            LoginUserResponse(
                statusCode = statusCode,
                statusDescription = statusDescription,
                error = loginErrors
            )
        }
    }
}