package com.example.login_coding_challenge.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.login_coding_challenge.usecase.LoginUserUserUseCase
import java.lang.IllegalArgumentException

class LoginViewModelFactory(
    private val loginUserUseCase: LoginUserUserUseCase
): ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(LoginViewModel::class.java)) {
            return LoginViewModel(loginUserUseCase) as T
        }

        throw IllegalArgumentException(modelClass.simpleName + " not assignable")
    }
}