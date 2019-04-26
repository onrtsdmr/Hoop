package io.androidedu.hoop.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import io.androidedu.hoop.entity.HoopStatusInfoEntity
import io.androidedu.hoop.model.StatusModel

class StatusAdapter(
    val statusList: ArrayList<HoopStatusInfoEntity>,
    val onItemClickListener: (statusModel: HoopStatusInfoEntity) -> Unit
) : RecyclerView.Adapter<StatusViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StatusViewHolder = StatusViewHolder(parent)


    override fun getItemCount(): Int = statusList.size


    override fun onBindViewHolder(holder: StatusViewHolder, position: Int) {

        holder.bind(statusList[position], onItemClickListener)
    }


}