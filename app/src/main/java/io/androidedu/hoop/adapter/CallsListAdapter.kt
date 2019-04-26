package io.androidedu.hoop.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import io.androidedu.hoop.entity.HoopCallsInfoEntity


class CallsListAdapter(
    val callList: ArrayList<HoopCallsInfoEntity>,
    val onItemClickListener: (callModel: HoopCallsInfoEntity) -> Unit
) : RecyclerView.Adapter<CallsListViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CallsListViewHolder = CallsListViewHolder(parent)


    override fun getItemCount(): Int = callList.size


    override fun onBindViewHolder(holder: CallsListViewHolder, position: Int) {

        holder.bind(callList[position], onItemClickListener)
    }


}