package com.example.login_coding_challenge

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ProgressBar
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatCheckBox
import androidx.core.widget.doOnTextChanged
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.login_coding_challenge.model.LoginLocalData
import com.example.login_coding_challenge.model.LoginRemoteData
import com.example.login_coding_challenge.repository.LoginRepository
import com.example.login_coding_challenge.usecase.LoginUserUserUseCase
import com.example.login_coding_challenge.viewmodel.LoginViewModel
import com.example.login_coding_challenge.viewmodel.LoginViewModelFactory
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onClick(v: View?) {
        when(v?.id) {
            submitButton.id -> {
                loginViewModel.onSubmit()
            }
        }
    }

    private lateinit var loader: ProgressBar
    private lateinit var loginTextView: TextView
    private lateinit var emailTextInputLayout: TextInputLayout
    private lateinit var emailTextInputEditText: TextInputEditText
    private lateinit var passwordTextInputLayout: TextInputLayout
    private lateinit var passwordTextInputEditText: TextInputEditText
    private lateinit var rememberMeCheckbox: AppCompatCheckBox
    private lateinit var submitButton: AppCompatButton

    private lateinit var loginViewModel: LoginViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loader = findViewById(R.id.loader)
        loginTextView = findViewById(R.id.loginTextView)
        emailTextInputLayout = findViewById(R.id.emailTextInputLayout)
        emailTextInputEditText = findViewById(R.id.emailTextInputEditText)
        passwordTextInputLayout = findViewById(R.id.passwordTextInputLayout)
        passwordTextInputEditText = findViewById(R.id.passwordTextInputEditText)
        rememberMeCheckbox = findViewById(R.id.rememberMeCheckbox)
        submitButton = findViewById(R.id.submitButton)

        val loginRemoteData = LoginRemoteData()
        val loginLocalData = LoginLocalData(getSharedPreferences("com.example.login", Context.MODE_PRIVATE))
        val loginRepository = LoginRepository(loginRemoteData, loginLocalData)
        val loginUseCase = LoginUserUserUseCase(loginRepository)

        loginViewModel = ViewModelProvider(this, LoginViewModelFactory(loginUseCase)).get(LoginViewModel::class.java)

        emailTextInputEditText.doOnTextChanged { text, _, _, _ ->

        }

        passwordTextInputEditText.doOnTextChanged { text, _, _, _ ->

        }

        rememberMeCheckbox.setOnCheckedChangeListener { _, isChecked ->

        }

        submitButton.setOnClickListener(this)
    }
}