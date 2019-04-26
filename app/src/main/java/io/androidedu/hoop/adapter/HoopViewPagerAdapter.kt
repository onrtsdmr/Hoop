package io.androidedu.hoop.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

//FragmentStatePagerAdapter , FragmentPagerAdapter

class HoopViewPagerAdapter(val titleList: ArrayList<String>,
                           val fragmentList: ArrayList<Fragment>,
                           fm: FragmentManager) : FragmentPagerAdapter(fm) {


    override fun getItem(position: Int): Fragment = fragmentList[position]

    override fun getCount(): Int = fragmentList.size

    override fun getPageTitle(position: Int): CharSequence? = titleList[position]


}