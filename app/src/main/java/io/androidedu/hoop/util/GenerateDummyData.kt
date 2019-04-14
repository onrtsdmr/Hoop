package io.androidedu.hoop.util

import io.androidedu.hoop.R
import io.androidedu.hoop.model.ChatModel


// Code with ❤️
//┌─────────────────────────────┐
//│ Created by Gökhan ÖZTÜRK    │
//│ ─────────────────────────── │
//│ GokhanOzturk@AndroidEdu.IO  │            
//│ ─────────────────────────── │
//│ 14.04.2019 - 11:05          │
//└─────────────────────────────┘

object GenerateDummyData {

    fun getDummyChatList(): ArrayList<ChatModel> = ArrayList<ChatModel>().apply {

        val chatModel = ChatModel(
                R.drawable.ic_camera_black,
                "Gökhan",
                "Merhaba ben geldim",
                "Yesterday")

        add(chatModel)
        add(chatModel)
        add(chatModel)
        add(chatModel)
        add(chatModel)
        add(chatModel)
        add(chatModel)
        add(chatModel)
        add(chatModel)
        add(chatModel)
        add(chatModel)
        add(chatModel)
        add(chatModel)
        add(chatModel)
        add(chatModel)
        add(chatModel)
        add(chatModel)
        add(chatModel)
        add(chatModel)
        add(chatModel)
        add(chatModel)
        add(chatModel)
        add(chatModel)
        add(chatModel)
        add(chatModel)
        add(chatModel)
        add(chatModel)
        add(chatModel)
        add(chatModel)
        add(chatModel)
        add(chatModel)
        add(chatModel)
        add(chatModel)
        add(chatModel)
    }
}