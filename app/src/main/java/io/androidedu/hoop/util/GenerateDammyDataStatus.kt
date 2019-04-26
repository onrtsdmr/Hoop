package io.androidedu.hoop.util

import io.androidedu.hoop.R
import io.androidedu.hoop.entity.HoopStatusInfoEntity
import io.androidedu.hoop.model.StatusModel

object GenerateDammyDataStatus {

    fun getDammyDataStatus(): ArrayList<HoopStatusInfoEntity> = ArrayList<HoopStatusInfoEntity>().apply {


        val hoopStatusInfoEntity = HoopStatusInfoEntity(
            profilePhoto = R.drawable.ic_onur,
            userName = "Onur",
            time = "16:40"
        )
        val hoopStatusInfoEntity1 = HoopStatusInfoEntity(
            profilePhoto = R.drawable.ic_zeynep,
            userName = "Zeynep",

            time = "16:40"

        )
        val hoopStatusInfoEntity2 = HoopStatusInfoEntity(
            profilePhoto = R.drawable.ic_adnan_ilerci,
            userName = "Adnan İlerçi",

            time = "16:40"

        )
        val hoopStatusInfoEntity3 = HoopStatusInfoEntity(
            profilePhoto = R.drawable.ic_banu,
            userName = "Banu Hoca",

            time = "16:40"

        )
        val hoopStatusInfoEntity4 = HoopStatusInfoEntity(
            profilePhoto = R.drawable.ic_berkcan,
            userName = "Berkcan",

            time = "16:40"

        )
        val hoopStatusInfoEntity5 = HoopStatusInfoEntity(
            profilePhoto = R.drawable.ic_emre,
            userName = "Emre",

            time = "16:40"

        )
        val hoopStatusInfoEntity6 = HoopStatusInfoEntity(
            profilePhoto = R.drawable.ic_erol_balkanay,
            userName = "Erol Hoca",

            time = "16:40"

        )
        val hoopStatusInfoEntity7 = HoopStatusInfoEntity(
            profilePhoto = R.drawable.ic_rabia,
            userName = "Rabia",

            time = "16:40"

        )
        val hoopStatusInfoEntity8 = HoopStatusInfoEntity(
            profilePhoto = R.drawable.ic_samet,
            userName = "Samet",

            time = "16:40"
        )


        add(hoopStatusInfoEntity)
        add(hoopStatusInfoEntity1)
        add(hoopStatusInfoEntity2)
        add(hoopStatusInfoEntity3)
        add(hoopStatusInfoEntity4)
        add(hoopStatusInfoEntity5)
        add(hoopStatusInfoEntity6)
        add(hoopStatusInfoEntity7)
        add(hoopStatusInfoEntity8)


    }

        /*val StatusModel = StatusModel(
                R.drawable.ic_onur,
                "Onur",
                "16:40"

        )
        val StatusModel1 = StatusModel(
                R.drawable.ic_zeynep,
                "Zeynep",

                "16:40"

        )
        val StatusModel2 = StatusModel(
                R.drawable.ic_adnan_ilerci,
                "Adnan İlerçi",

                "16:40"

        )
        val StatusModel3 = StatusModel(
                R.drawable.ic_banu,
                "Banu Hoca",

                "16:40"

        )
        val StatusModel4 = StatusModel(
                R.drawable.ic_berkcan,
                "Berkcan",

                "16:40"

        )
        val StatusModel5 = StatusModel(
                R.drawable.ic_emre,
                "Emre",

                "16:40"

        )
        val StatusModel6 = StatusModel(
                R.drawable.ic_erol_balkanay,
                "Erol Hoca",

                "16:40"

        )
        val StatusModel7 = StatusModel(
                R.drawable.ic_rabia,
                "Rabia",

                "16:40"

        )
        val StatusModel8 = StatusModel(
                R.drawable.ic_samet,
                "Samet",

                "16:40"
        )

        add(StatusModel)
        add(StatusModel1)
        add(StatusModel2)
        add(StatusModel3)
        add(StatusModel4)
        add(StatusModel5)
        add(StatusModel6)
        add(StatusModel7)
        add(StatusModel8)
        add(StatusModel)
        add(StatusModel1)
        add(StatusModel2)
        add(StatusModel3)
        add(StatusModel4)
        add(StatusModel5)
        add(StatusModel6)
        add(StatusModel7)
        add(StatusModel8)
    }*/

}