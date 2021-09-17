package com.example.login_coding_challenge.model

data class LoginUserRequest(
    val email: String,
    val password: String,
    val isRememberMeChecked: Boolean
)