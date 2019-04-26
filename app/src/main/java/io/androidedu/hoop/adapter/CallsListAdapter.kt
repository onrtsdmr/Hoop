package io.androidedu.hoop.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import io.androidedu.hoop.model.CallModel


class CallsListAdapter(
    val callList: ArrayList<CallModel>,
    val onItemClickListener: (callModel: CallModel) -> Unit
) : RecyclerView.Adapter<CallsListViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CallsListViewHolder = CallsListViewHolder(parent)


    override fun getItemCount(): Int = callList.size


    override fun onBindViewHolder(holder: CallsListViewHolder, position: Int) {

        holder.bind(callList[position], onItemClickListener)
    }


}