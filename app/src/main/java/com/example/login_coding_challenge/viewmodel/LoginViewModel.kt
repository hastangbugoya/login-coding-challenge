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

    private val _emailError = MutableLiveData<String?>()
    val emailError: LiveData<String?> = _emailError

    private val _passwordError = MutableLiveData<String?>()
    val passwordError: LiveData<String?> = _passwordError

    private val _loaderVisibility = MutableLiveData(View.GONE)
    val loaderVisibility: LiveData<Int> = _loaderVisibility

    private val _successfulLoginEvent = MutableLiveData<Event<Boolean>>()
    val successfulLoginEvent: LiveData<Event<Boolean>> = _successfulLoginEvent

    fun isUserRemembered(): Boolean {
        TODO()
    }

    fun onSubmit(email: String, password: String, isRememberMeChecked: Boolean) {
        viewModelScope.launch {
            TODO()
        }
    }

}