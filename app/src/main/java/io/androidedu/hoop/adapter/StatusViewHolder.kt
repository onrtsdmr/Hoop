package io.androidedu.hoop.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import io.androidedu.hoop.R
import io.androidedu.hoop.model.StatusModel

class StatusViewHolder(parent: ViewGroup) :
    RecyclerView.ViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.adapter_item_status, parent, false)
    ) {

    private val profilePhoto: ImageView
    private val userName: TextView
    private val time: TextView

    init {
        profilePhoto = itemView.findViewById(R.id.imgbStatusProfile)
        userName = itemView.findViewById(R.id.txtStatusUserName)
        time = itemView.findViewById(R.id.txtStatusTime)

    }


    fun bind(statusModel: StatusModel, onItemClickListener: (statusModel: StatusModel) -> Unit) {

        profilePhoto.setBackgroundResource(statusModel.profilePhoto)
        userName.text = statusModel.userName
        time.text = statusModel.time

        itemView.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {

                onItemClickListener(statusModel)

            }

        })
    }


}