package io.androidedu.hoop.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import io.androidedu.hoop.R
import io.androidedu.hoop.entity.HoopCallsInfoEntity
import io.androidedu.hoop.model.CallModel

class CallsListViewHolder(parent: ViewGroup) :
    RecyclerView.ViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.adapter_item_calls_list, parent, false)
    ) {

    private val profilePhoto: ImageView
    private val userName: TextView
    private val callTypeIcon: ImageView
    private val date: TextView
    private val time: TextView
    private val voiceCall: ImageView

    init {
        profilePhoto = itemView.findViewById(R.id.imgbCallsProfile)
        userName = itemView.findViewById(R.id.txtCallsUserName)
        callTypeIcon = itemView.findViewById(R.id.imgbCallsTypeIcon)
        date = itemView.findViewById(R.id.txtCallsDate)
        time = itemView.findViewById(R.id.txtCallsTime)
        voiceCall = itemView.findViewById(R.id.imgbVoiceCall)

    }


    fun bind(callsModel: HoopCallsInfoEntity, onItemClickListener: (callsModel: HoopCallsInfoEntity) -> Unit) {

        profilePhoto.setBackgroundResource(callsModel.profilePhoto)
        userName.text = callsModel.userName
        callTypeIcon.setBackgroundResource(callsModel.callTypeIcon)
        date.text = callsModel.date
        time.text = callsModel.time
        voiceCall.setBackgroundResource(callsModel.voiceCall)

        itemView.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {

                onItemClickListener(callsModel)

            }

        })
    }


}