package io.androidedu.hoop.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import io.androidedu.hoop.model.ChatModel


// Code with ❤️
//┌─────────────────────────────┐
//│ Created by Gökhan ÖZTÜRK    │
//│ ─────────────────────────── │
//│ GokhanOzturk@AndroidEdu.IO  │            
//│ ─────────────────────────── │
//│ 13.04.2019 - 13:37          │
//└─────────────────────────────┘

class ChatListAdapter(val chatList: ArrayList<ChatModel>, val onItemClickListener: (chatModel: ChatModel) -> Unit) : RecyclerView.Adapter<ChatListViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChatListViewHolder = ChatListViewHolder(parent)

    override fun getItemCount(): Int = chatList.size

    override fun onBindViewHolder(holder: ChatListViewHolder, position: Int) {

        holder.bind(chatList[position], onItemClickListener)
    }
}