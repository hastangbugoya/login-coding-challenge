package com.example.login_coding_challenge.usecase

import com.example.login_coding_challenge.model.LoginError
import com.example.login_coding_challenge.repository.LoginRepository
import com.example.login_coding_challenge.model.LoginUserRequest
import com.example.login_coding_challenge.model.LoginUserResponse
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.asStateFlow

class LoginUserUserUseCase(private val loginRepository: LoginRepository) {

    // Email shouldn't be empty
    private fun isEmailValid(email: String): Boolean {
        TODO()
    }

    // Password shouldn't be empty
    private fun isPasswordValid(password: String): Boolean {
        TODO()
    }

    // Both Email and Password should be Valid
    private fun isFormValid(loginUserRequest: LoginUserRequest): Boolean {
        TODO()
    }

    suspend fun loginUser(loginUserRequest: LoginUserRequest): LoginResult {
        val loginResult: LoginResult
        if(isFormValid(loginUserRequest)) {
            val response: LoginUserResponse = loginRepository.logInUser(loginUserRequest)
            loginResult = if(response.statusCode == "0000") { // SUCCESS
                TODO()
            } else { // FAIL
                TODO()
            }
        } else {
            val errors = mutableListOf<LoginError>()
            if(!isEmailValid(loginUserRequest.email)) {
                errors.add(LoginError("email", "Email is empty"))
            }

            if(!isPasswordValid(loginUserRequest.password)) {
                TODO()
            }

            loginResult = LoginResult.FAILURE(errors)
        }
        return loginResult
    }
}