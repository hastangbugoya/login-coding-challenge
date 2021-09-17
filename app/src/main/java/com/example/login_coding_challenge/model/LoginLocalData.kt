package com.example.login_coding_challenge.model

import android.content.SharedPreferences

class LoginLocalData(
    private val sharedPreferences: SharedPreferences
) {
    fun isUserRemembered() = sharedPreferences.getBoolean("isUserRemembered", false)

    fun rememberUser(email: String) {
        with(sharedPreferences.edit()) {
            putBoolean("isUserRemembered", true)
            putString("rememberedUserEmail", email)
            apply()
        }
    }
}