package com.arpuplus.testci

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    var email: String? = null
        set(value) {
            field = value
           validateEmail()
        }

    val validation = MutableLiveData<String>()

    fun validateEmail() {
        if (email?.contains("@") == true) {
            validation.value = "valid"
        } else {
            validation.value = "invalid"
        }
    }
}