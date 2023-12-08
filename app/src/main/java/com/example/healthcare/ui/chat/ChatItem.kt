package com.example.healthcare.ui.chat

/**
 * Chats/$chatRoomId
 *
 * */
data class ChatItem(
    val chatId: String? = null,
    val message: String? = null,
    val userId: String? = null,
    val otherUserId: String? = null,
)
