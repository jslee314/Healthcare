package com.example.healthcare.ui.setting

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ChatRoomListViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is chatroom Fragment"
    }
    val text: LiveData<String> = _text
}