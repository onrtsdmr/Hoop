package io.androidedu.hoop.util

import io.androidedu.hoop.R
import io.androidedu.hoop.model.StatusModel

object GenerateDammyDataStatus {

    fun getDammyDataStatus(): ArrayList<StatusModel> = ArrayList<StatusModel>().apply {

        val StatusModel = StatusModel(
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
    }

}