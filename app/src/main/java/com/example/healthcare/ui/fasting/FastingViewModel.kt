package com.example.healthcare.ui.fasting

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class FastingViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is fast Fragment"
    }
    val text: LiveData<String> = _text
}