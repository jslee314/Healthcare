package com.example.healthcare.ui.user

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class UserListViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is User list Fragment"
    }
    val text: LiveData<String> = _text
}