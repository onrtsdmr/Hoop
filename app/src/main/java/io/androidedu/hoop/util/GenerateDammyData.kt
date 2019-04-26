package io.androidedu.hoop.util

import io.androidedu.hoop.R
import io.androidedu.hoop.dao.HoopInfoDao
import io.androidedu.hoop.db.HoopInfoDB
import io.androidedu.hoop.entity.HoopInfoEntity
import io.androidedu.hoop.model.ChatModel
import io.androidedu.hoop.ui.MainActivity

object GenerateDammyData {


    fun getDummyDataChatList(): ArrayList<ChatModel> = ArrayList<ChatModel>().apply {
        val chatModel = ChatModel(
            R.drawable.ic_onur,
            "Onur",
            "Merhaba , Dostum!",
            "Yesterday"
        )
        val chatModel1 = ChatModel(
            R.drawable.ic_zeynep,
            "Zeynep",
            "Napıyorsun , Höö , Mal , Salak , Hödük",
            "15:37"
        )
        val chatModel2 = ChatModel(
            R.drawable.ic_adnan_ilerci,
            "Adnan İlerçi",
            "Merhaba Güzel bayan ııı bir ıı dans ıı eder miyiz ?",
            "21:49"
        )
        val chatModel3 = ChatModel(
            R.drawable.ic_banu,
            "Banu Hoca",
            "Merhaba Onur",
            "12:10"
        )
        val chatModel4 = ChatModel(
            R.drawable.ic_berkcan,
            "Berkcan",
            "Da ayrı yalnız :D",
            "15:39"
        )
        val chatModel5 = ChatModel(
            R.drawable.ic_emre,
            "Emre",
            "-----",
            "19:10"
        )
        val chatModel6 = ChatModel(
            R.drawable.ic_erol_balkanay,
            "Erol Hoca",
            "Evet çocuklar gözlüğüm kararıyor normal bir şey takılmayın asdasd",
            "20:32"
        )
        val chatModel7 = ChatModel(
            R.drawable.ic_rabia,
            "Rabia",
            "Yaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa amaaaaaaaaaaaaaaaaaaaaaaaaaaaa wdasdsa",
            "13:39"
        )
        val chatModel8 = ChatModel(
            R.drawable.ic_samet,
            "Samet",
            "Ezik!",
            "12:10"
        )

        add(chatModel)
        add(chatModel1)
        add(chatModel2)
        add(chatModel3)
        add(chatModel4)
        add(chatModel5)
        add(chatModel6)
        add(chatModel7)
        add(chatModel8)
        add(chatModel)
        add(chatModel1)
        add(chatModel2)
        add(chatModel3)
        add(chatModel4)
        add(chatModel5)
        add(chatModel6)
        add(chatModel7)
        add(chatModel8)


    }
}