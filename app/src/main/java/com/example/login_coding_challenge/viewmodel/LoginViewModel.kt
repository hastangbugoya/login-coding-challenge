package com.example.login_coding_challenge.viewmodel

import android.view.View
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.login_coding_challenge.Event
import com.example.login_coding_challenge.model.LoginUserRequest
import com.example.login_coding_challenge.usecase.LoginUserUserUseCase
import com.example.login_coding_challenge.usecase.Validation
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class LoginViewModel(
    private val loginUserUseCase: LoginUserUserUseCase
): ViewModel() {
    var email = ""
    var password = ""
    var isRememberMeChecked = false

    private val _emailError = MutableLiveData<String?>()
    val emailError: LiveData<String?> = _emailError
    private val _passwordError = MutableLiveData<String?>()
    val passwordError: LiveData<String?> = _passwordError
    private val _loaderVisibility = MutableLiveData(View.GONE)
    val loaderVisibility: LiveData<Int> = _loaderVisibility

    fun onEmailTextChanged(text: String) {
        TODO()
    }

    fun onPasswordTextChanged(text: String) {
        TODO()
    }

    fun onRememberMeCheckedChange(isChecked: Boolean) {
        TODO()
    }

    fun onSubmit() {
        TODO()
    }

}