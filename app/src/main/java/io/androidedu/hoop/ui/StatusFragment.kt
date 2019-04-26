package io.androidedu.hoop.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import io.androidedu.hoop.R
import io.androidedu.hoop.adapter.StatusAdapter
import io.androidedu.hoop.util.GenerateDammyDataStatus
import kotlinx.android.synthetic.main.fragment_calls.*
import kotlinx.android.synthetic.main.fragment_calls.rcycCallsList
import kotlinx.android.synthetic.main.fragment_calls.view.*
import kotlinx.android.synthetic.main.fragment_status.*


class StatusFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_status, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        with(rcycStatusView) {

            rcycStatusView.adapter =
                io.androidedu.hoop.adapter.StatusAdapter(GenerateDammyDataStatus.getDammyDataStatus()) { StatusModel ->
                    android.widget.Toast.makeText(activity, StatusModel.userName, android.widget.Toast.LENGTH_SHORT)
                        .show()

                }


            rcycStatusView.layoutManager = androidx.recyclerview.widget.LinearLayoutManager(activity)

            rcycStatusMuted.adapter =
                io.androidedu.hoop.adapter.StatusAdapter(GenerateDammyDataStatus.getDammyDataStatus()) {

                }
            rcycStatusMuted.layoutManager = androidx.recyclerview.widget.LinearLayoutManager(activity)
        }
    }


    companion object {

        @JvmStatic
        fun newInstance() = StatusFragment()

    }
}

