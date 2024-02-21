package com.falghannam.javaspringbootproject.viewModel

import android.app.Application
import android.content.Context
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.falghannam.WelcomeScreen
import com.falghannam.javaspringbootproject.R
import com.falghannam.javaspringbootproject.data.Nurse
import com.falghannam.javaspringbootproject.data.User
import com.falghannam.javaspringbootproject.data.response.TokenResponse
import com.falghannam.javaspringbootproject.singleton.RetrofitHelper
//import com.falghannam.javaspringbootproject.singleton.RetrofitHelper
import kotlinx.coroutines.launch

class NursesViewModel : ViewModel() {
//    private val apiService = RetrofitHelper.getInstance().create(WelcomeScreen::class.java)
    var token: TokenResponse? by mutableStateOf(null)
    var currentUser: User? by mutableStateOf(null)
    private val sharedPreferencesKey = "user_token"
    var application: Application? = null
    var balance: Double = 0.0

    val nurses = listOf(
        Nurse("Nurse 1", "20 KWD/Hour", "25", "Cardio", 5, R.drawable.nurse),
        Nurse("Nurse 2", "20 KWD/Hour", "34", "ER", 5, R.drawable.nurse),
        Nurse("Nurse 3", "20 KWD/Hour", "45", "ICU", 3, R.drawable.nurse),
        Nurse("Nurse 4", "20 KWD/Hour", "45", "Surgery", 4, R.drawable.nurse),
        Nurse("Nurse 5", "20 KWD/Hour", "35", "Oncology", 5, R.drawable.nurse)
    )

    init {
        retrieveToken()
    }

    private val sharedPreferences = application?.getSharedPreferences(
        "Saved account", Context.MODE_PRIVATE
    )

    // Retrieve the token from SharedPreferences
    fun retrieveToken(): String? {
        return sharedPreferences?.getString(sharedPreferencesKey, null)
    }


//    fun signup(username: String, password: String, image: String = "") {
//        viewModelScope.launch {
//            try {
//                val response = apiService.SignUpScreen(User(username, password, image, 0.0, null))
//                token = response.body()
//                TokenResponse(token?.token)
//                getAccountInfo()
//            } catch (e: Exception) {
//                println("Error $e")
//            }
//
//        }
//    }


    fun login(username: String, password: String) {
        viewModelScope.launch {
            try {
               // val response = login(User(username, password))
//                println(response.code())
//                println(response.message())
//                println(response.body())
//                token = response.body()
//                saveToken(token?.token)
//                getAccountInfo()
            } catch (e: Exception) {
                println("Error $e")
            }
        }
    }


//    fun updateProfile(username: String, password: String) {
//        viewModelScope.launch {
//            try {
                // Check if the user is logged in
//                val response = apiService.updateProfile(
//                    token?.getBearerToken(),
//                    username.toRequestBody(),
//                    password.toRequestBody(),
//
//                )
//                if (response.isSuccessful) {
//                    // Handle the update profile success
//                    println("Profile updated successfully.")
//                } else {
//                    println("Error: ${response.code()} - ${response.message()}")
//                }
//
//            } catch (e: Exception) {
//                println("Error $e")
//            }
//        }
//    }

    fun getAccountInfo() {
        viewModelScope.launch {
            try {
               // currentUser = apiService.getAccountInfo(token?.getBearerToken())
                println(currentUser?.username)
            } catch (e: Exception) {
                println("Error $e")
            }
        }
    }


}