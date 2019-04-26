package io.androidedu.hoop.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import io.androidedu.hoop.R
import io.androidedu.hoop.adapter.CallsListAdapter
import io.androidedu.hoop.adapter.ChatListAdapter
import io.androidedu.hoop.model.CallModel
import io.androidedu.hoop.util.GenerateDammyData
import io.androidedu.hoop.util.GenerateDammyDataCalls
import kotlinx.android.synthetic.main.fragment_calls.*
import kotlinx.android.synthetic.main.fragment_calls.rcycCallsList
import kotlinx.android.synthetic.main.fragment_calls.view.*
import kotlinx.android.synthetic.main.fragment_chats.*


class CallsFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_calls, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        with(rcycCallsList) {

            rcycCallsList.adapter =
                io.androidedu.hoop.adapter.CallsListAdapter(GenerateDammyDataCalls.getDummyDataCallsList()) { CallModel ->
                    android.widget.Toast.makeText(activity, CallModel.userName, android.widget.Toast.LENGTH_SHORT)
                        .show()
                }

            rcycCallsList.layoutManager = androidx.recyclerview.widget.LinearLayoutManager(activity)
        }
    }

    companion object {

        @JvmStatic
        fun newInstance() = CallsFragment()

    }
}
