package io.androidedu.hoop.ui

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import io.androidedu.hoop.R
import kotlinx.android.synthetic.main.layout_tab.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private val chatsFragment by lazy { ChatsFragment.newInstance() }
    private val statusFragment by lazy { StatusFragment.newInstance() }
    private val cameraFragment by lazy { CameraFragment.newInstance() }
    private val callsFragment by lazy { CallsFragment.newInstance() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtCalls.setOnClickListener(this)
        txtChats.setOnClickListener(this)
        txtStatus.setOnClickListener(this)
        imgbCamera.setOnClickListener(this)

        addFragment(R.id.frmContainer, chatsFragment)
    }

    override fun onClick(v: View) {

        when (v.id) {

            R.id.txtCalls -> {

                replaceFragment(R.id.frmContainer, callsFragment)
            }

            R.id.txtChats -> {

                replaceFragment(R.id.frmContainer, chatsFragment)
            }

            R.id.txtStatus -> {

                replaceFragment(R.id.frmContainer, statusFragment)
            }

            R.id.imgbCamera -> {

                replaceFragment(R.id.frmContainer, cameraFragment)
            }
        }
    }


}

inline fun FragmentManager.inTransaction(function: FragmentTransaction.() -> FragmentTransaction) {

    beginTransaction().function().commit()
}

fun AppCompatActivity.addFragment(containerId: Int, fragment: Fragment) {

    supportFragmentManager.inTransaction {

        add(containerId, fragment)
    }
}


fun AppCompatActivity.replaceFragment(containerId: Int, fragment: Fragment) {

    supportFragmentManager.inTransaction {

        replace(containerId, fragment)
    }
}