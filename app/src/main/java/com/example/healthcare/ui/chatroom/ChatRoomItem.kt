package com.example.healthcare.ui.chatroom

/**
 * chatRooms/$userid
 */
data class ChatRoomItem(
    val chatRoomId: String? = null,
    val lastMessage: String? = null,
    val otherUserId: String? = null,
    val otherUserName: String? = null,
)