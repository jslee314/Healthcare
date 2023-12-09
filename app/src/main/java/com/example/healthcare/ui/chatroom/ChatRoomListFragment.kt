package com.example.healthcare.ui.chatroom

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.viewbinding.ViewBinding
import com.example.healthcare.base.BaseFragment
import com.example.healthcare.databinding.FragmentChatRoomBinding
import com.example.healthcare.ui.myPage.ChatRoomListViewModel

class ChatRoomListFragment : BaseFragment() {

    private val viewModel: ChatRoomListViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        (binding as FragmentChatRoomBinding).apply {
            val chatRoomRecyclerView = ChatRoomListAdapter()
            recyclerviewChatRoom.apply {
                layoutManager = LinearLayoutManager(context)
                adapter = chatRoomRecyclerView
            }

        }

    }

    override fun getViewBinding(): ViewBinding {
        return FragmentChatRoomBinding.inflate(layoutInflater)
    }
}