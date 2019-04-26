package io.androidedu.hoop.util

import io.androidedu.hoop.R
import io.androidedu.hoop.entity.HoopCallsInfoEntity
import io.androidedu.hoop.model.CallModel

object GenerateDammyDataCalls {
    fun getDummyDataCallsList(): ArrayList<HoopCallsInfoEntity> = ArrayList<HoopCallsInfoEntity>().apply {

        val hoopCallsInfoEntity = HoopCallsInfoEntity(
            profilePhoto = R.drawable.ic_onur,
            userName = "Onur",
            callTypeIcon = R.drawable.ic_calls_24dp,
            date = "Monday",
            time = "16:40",
            voiceCall = R.drawable.ic_call_black_24dp
        )
        val hoopCallsInfoEntity2 = HoopCallsInfoEntity(
            profilePhoto = R.drawable.ic_zeynep,
            userName = "Zeynep",
            callTypeIcon = R.drawable.ic_calls_24dp,
            date = "Friday",
            time = "16:40",
            voiceCall = R.drawable.ic_call_black_24dp
        )

        val hoopCallsInfoEntity3 = HoopCallsInfoEntity(
            profilePhoto = R.drawable.ic_adnan_ilerci,
            userName = "Adnan İlerçi",
            callTypeIcon = R.drawable.ic_calls_24dp,
            date = "Tuesday",
            time = "16:40",
            voiceCall = R.drawable.ic_call_black_24dp
        )

        val hoopCallsInfoEntity4 = HoopCallsInfoEntity(
            profilePhoto = R.drawable.ic_banu,
            userName = "Banu Hoca",
            callTypeIcon = R.drawable.ic_calls_24dp,
            date = "Thursday",
            time = "16:40",
            voiceCall = R.drawable.ic_call_black_24dp
        )

        val hoopCallsInfoEntity5 = HoopCallsInfoEntity(
            profilePhoto = R.drawable.ic_berkcan,
            userName = "Berkcan",
            callTypeIcon = R.drawable.ic_calls_24dp,
            date = "Wednesday",
            time = "16:40",
            voiceCall = R.drawable.ic_call_black_24dp
        )

        val hoopCallsInfoEntity6 = HoopCallsInfoEntity(
            profilePhoto = R.drawable.ic_emre,
            userName = "Emre",
            callTypeIcon = R.drawable.ic_calls_24dp,
            date = "Yesterday",
            time = "16:40",
            voiceCall = R.drawable.ic_call_black_24dp
        )

        val hoopCallsInfoEntity7 = HoopCallsInfoEntity(
            profilePhoto = R.drawable.ic_erol_balkanay,
            userName = "Erol Hoca",
            callTypeIcon = R.drawable.ic_calls_24dp,
            date = "Friday",
            time = "16:40",
            voiceCall = R.drawable.ic_call_black_24dp
        )

        val hoopCallsInfoEntity8 = HoopCallsInfoEntity(
            profilePhoto = R.drawable.ic_rabia,
            userName = "Rabia",
            callTypeIcon = R.drawable.ic_calls_24dp,
            date = "Yesterday",
            time = "16:40",
            voiceCall = R.drawable.ic_call_black_24dp
        )

        val hoopCallsInfoEntity9 = HoopCallsInfoEntity(
            profilePhoto = R.drawable.ic_samet,
            userName = "Samet",
            callTypeIcon = R.drawable.ic_calls_24dp,
            date = "Monday",
            time = "16:40",
            voiceCall = R.drawable.ic_call_black_24dp
        )



        add(hoopCallsInfoEntity)
        add(hoopCallsInfoEntity2)
        add(hoopCallsInfoEntity3)
        add(hoopCallsInfoEntity4)
        add(hoopCallsInfoEntity5)
        add(hoopCallsInfoEntity6)
        add(hoopCallsInfoEntity7)
        add(hoopCallsInfoEntity8)
        add(hoopCallsInfoEntity9)
        add(hoopCallsInfoEntity)
        add(hoopCallsInfoEntity2)
        add(hoopCallsInfoEntity3)
        add(hoopCallsInfoEntity4)
        add(hoopCallsInfoEntity5)
        add(hoopCallsInfoEntity6)
        add(hoopCallsInfoEntity7)
        add(hoopCallsInfoEntity8)
        add(hoopCallsInfoEntity9)


    }
    /*val CallModel = CallModel(
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

}*/
}