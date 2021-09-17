package com.example.login_coding_challenge.usecase

sealed class Validation {
    object Valid: Validation()
    class Invalid(val reason: String): Validation()
}