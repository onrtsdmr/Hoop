package io.androidedu.hoop.util

import io.androidedu.hoop.R
import io.androidedu.hoop.model.CallModel

object GenerateDammyDataCalls {
    fun getDummyDataCallsList(): ArrayList<CallModel> = ArrayList<CallModel>().apply {
        val CallModel = CallModel(
                R.drawable.ic_onur,
                "Onur",
                R.drawable.ic_calls_24dp,
                "Monday",
                "16:40",
                R.drawable.ic_call_black_24dp
        )
        val CallModel1 = CallModel(
                R.drawable.ic_zeynep,
                "Zeynep",
                R.drawable.ic_calls_24dp,
                "Friday",
                "16:40",
                R.drawable.ic_call_black_24dp
        )
        val CallModel2 = CallModel(
                R.drawable.ic_adnan_ilerci,
                "Adnan İlerçi",
                R.drawable.ic_calls_24dp,
                "Tuesday",
                "16:40",
                R.drawable.ic_call_black_24dp
        )
        val CallModel3 = CallModel(
                R.drawable.ic_banu,
                "Banu Hoca",
                R.drawable.ic_calls_24dp,
                "Thursday",
                "16:40",
                R.drawable.ic_call_black_24dp
        )
        val CallModel4 = CallModel(
                R.drawable.ic_berkcan,
                "Berkcan",
                R.drawable.ic_calls_24dp,
                "Wednesday",
                "16:40",
                R.drawable.ic_call_black_24dp
        )
        val CallModel5 = CallModel(
                R.drawable.ic_emre,
                "Emre",
                R.drawable.ic_calls_24dp,
                "Yesterday",
                "16:40",
                R.drawable.ic_call_black_24dp
        )
        val CallModel6 = CallModel(
                R.drawable.ic_erol_balkanay,
                "Erol Hoca",
                R.drawable.ic_calls_24dp,
                "Friday",
                "16:40",
                R.drawable.ic_call_black_24dp
        )
        val CallModel7 = CallModel(
                R.drawable.ic_rabia,
                "Rabia",
                R.drawable.ic_calls_24dp,
                "Yesterday",
                "16:40",
                R.drawable.ic_call_black_24dp
        )
        val CallModel8 = CallModel(
                R.drawable.ic_samet,
                "Samet",
                R.drawable.ic_calls_24dp,
                "Monday",
                "16:40",
                R.drawable.ic_call_black_24dp
        )
        add(CallModel)
        add(CallModel1)
        add(CallModel2)
        add(CallModel3)
        add(CallModel4)
        add(CallModel5)
        add(CallModel6)
        add(CallModel7)
        add(CallModel8)
        add(CallModel)
        add(CallModel1)
        add(CallModel2)
        add(CallModel3)
        add(CallModel4)
        add(CallModel5)
        add(CallModel6)
        add(CallModel7)
        add(CallModel8)

    }
}