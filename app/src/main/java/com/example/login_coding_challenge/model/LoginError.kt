package com.example.login_coding_challenge.model

data class LoginError(
    val invalidField: String,
    val reason: String
)