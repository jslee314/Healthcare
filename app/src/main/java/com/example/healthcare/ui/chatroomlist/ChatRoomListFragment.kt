package com.example.healthcare.ui.chatroomlist

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import androidx.viewbinding.ViewBinding
import com.example.healthcare.base.BaseFragment
import com.example.healthcare.databinding.FragmentChatRoomBinding
import com.example.healthcare.ui.setting.ChatRoomListViewModel

class ChatRoomListFragment : BaseFragment() {

    private val viewModel: ChatRoomListViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun getViewBinding(): ViewBinding {
        return FragmentChatRoomBinding.inflate(layoutInflater)
    }
}