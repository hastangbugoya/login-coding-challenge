package com.example.login_coding_challenge

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CompoundButton
import android.widget.ProgressBar
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatCheckBox
import com.example.login_coding_challenge.data.LoginLocalData
import com.example.login_coding_challenge.data.LoginRemoteData
import com.example.login_coding_challenge.data.LoginService
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity(), View.OnClickListener, CompoundButton.OnCheckedChangeListener {

    override fun onCheckedChanged(buttonView: CompoundButton?, isChecked: Boolean) {
        TODO("Not yet implemented")
    }

    override fun onClick(v: View?) {
        TODO("Not yet implemented")
    }

    private lateinit var loader: ProgressBar
    private lateinit var loginTextView: TextView
    private lateinit var emailTextInputLayout: TextInputLayout
    private lateinit var emailTextInputEditText: TextInputEditText
    private lateinit var passwordTextInputLayout: TextInputLayout
    private lateinit var passwordTextInputEditText: TextInputEditText
    private lateinit var rememberMeCheckbox: AppCompatCheckBox
    private lateinit var submitButton: AppCompatButton

    private val loginService = LoginService()
    private val loginRemoteData = LoginRemoteData(loginService)
    private val loginLocalData = LoginLocalData(getSharedPreferences("com.example.login", MODE_PRIVATE))

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

        rememberMeCheckbox.setOnCheckedChangeListener(this)
        submitButton.setOnClickListener(this)
    }
}