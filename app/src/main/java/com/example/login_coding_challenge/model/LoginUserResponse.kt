package com.example.login_coding_challenge.model

import com.example.login_coding_challenge.model.LoginError

data class LoginUserResponse(
    val statusCode: String,
    val statusDescription: String,
    val error: List<LoginError> = listOf()
)