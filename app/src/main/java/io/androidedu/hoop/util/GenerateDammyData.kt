package io.androidedu.hoop.util

import io.androidedu.hoop.R
import io.androidedu.hoop.dao.HoopInfoDao
import io.androidedu.hoop.db.HoopInfoDB
import io.androidedu.hoop.entity.HoopInfoEntity
import io.androidedu.hoop.model.ChatModel
import io.androidedu.hoop.ui.MainActivity

object GenerateDammyData {
    fun getDummyDataChatList(): ArrayList<HoopInfoEntity> = ArrayList<HoopInfoEntity>().apply {


        val HoopInfoEntity = HoopInfoEntity(
            profilePhoto = R.drawable.ic_onur,
            userName = "ONUR",
            userMessage = "Merhaba Dünya!",
            date = "Yesterday"
        )

        val HoopInfoEntity1 = HoopInfoEntity(
            profilePhoto = R.drawable.ic_zeynep,
            userName = "Zeynep",
            userMessage = "Napıyorsun , Höö , Mal , Salak , Hödük",
            date = "15:37"
        )
        val HoopInfoEntity2 = HoopInfoEntity(
            profilePhoto = R.drawable.ic_adnan_ilerci,
            userName = "Adnan İlerçi",
            userMessage = "Merhaba Güzel bayan ııı bir ıı dans ıı eder miyiz ?",
            date = "21:49"
        )
        val HoopInfoEntity3 = HoopInfoEntity(
            profilePhoto = R.drawable.ic_banu,
            userName = "Banu Hoca",
            userMessage = "Merhaba Onur",
            date = "12:10"
        )
        val HoopInfoEntity4 = HoopInfoEntity(
            profilePhoto = R.drawable.ic_berkcan,
            userName = "Berkcan",
            userMessage = "Da ayrı yalnız :D",
            date = "15:39"
        )
        val HoopInfoEntity5 = HoopInfoEntity(
            profilePhoto = R.drawable.ic_emre,
            userName = "Emre",
            userMessage = "-----",
            date = "19:10"
        )
        val HoopInfoEntity6 = HoopInfoEntity(
            profilePhoto = R.drawable.ic_erol_balkanay,
            userName = "Erol Hoca",
            userMessage = "Evet çocuklar gözlüğüm kararıyor normal bir şey takılmayın asdasd",
            date = "20:32"
        )
        val HoopInfoEntity7 = HoopInfoEntity(
            profilePhoto = R.drawable.ic_rabia,
            userName = "Rabia",
            userMessage = "Yaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa amaaaaaaaaaaaaaaaaaaaaaaaaaaaa wdasdsa",
            date = "13:39"
        )
        val HoopInfoEntity8 = HoopInfoEntity(
            profilePhoto = R.drawable.ic_samet,
            userName = "Samet",
            userMessage = "Ezik!",
            date = "12:10"
        )




        add(HoopInfoEntity)
        add(HoopInfoEntity1)
        add(HoopInfoEntity2)
        add(HoopInfoEntity3)
        add(HoopInfoEntity4)
        add(HoopInfoEntity5)
        add(HoopInfoEntity6)
        add(HoopInfoEntity7)
        add(HoopInfoEntity8)
        add(HoopInfoEntity)
        add(HoopInfoEntity1)
        add(HoopInfoEntity2)
        add(HoopInfoEntity3)
        add(HoopInfoEntity4)
        add(HoopInfoEntity5)
        add(HoopInfoEntity6)
        add(HoopInfoEntity7)
        add(HoopInfoEntity8)


    }
    /*val HoopInfoEntity = HoopInfoEntity(
        profilePhoto =,
        userName =,
        userMessage =,
        date =,
    )
    */
    /*fun getDummyDataChatList(): ArrayList<ChatModel> = ArrayList<ChatModel>().apply {
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


    }*/
}