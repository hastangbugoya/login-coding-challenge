package com.example.login_coding_challenge.usecase

import com.example.login_coding_challenge.model.LoginError

sealed class LoginResult {
    object SUCCESS: LoginResult()
    class FAILURE(errors: List<LoginError>): LoginResult()
}
