package io.androidedu.hoop.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager

import io.androidedu.hoop.adapter.ChatListAdapter
import io.androidedu.hoop.R
import io.androidedu.hoop.dao.HoopInfoDao
import io.androidedu.hoop.db.HoopInfoDB

import io.androidedu.hoop.util.GenerateDammyData
import kotlinx.android.synthetic.main.fragment_chats.*


class ChatsFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        return inflater.inflate(R.layout.fragment_chats, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



        with(rcycChatList) {
            adapter =
                ChatListAdapter(GenerateDammyData.getDummyDataChatList()) { ChatModel ->
                    Toast.makeText(activity, ChatModel.userName, Toast.LENGTH_SHORT).show()
                }
            layoutManager = LinearLayoutManager(activity)
        }


    }



    companion object {

        @JvmStatic
        fun newInstance() = ChatsFragment()

    }
}
