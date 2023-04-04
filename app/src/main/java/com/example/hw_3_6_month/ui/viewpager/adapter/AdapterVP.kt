package com.example.hw_3_6_month.ui.viewpager.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.hw_3_6_month.ui.viewpager.ButtonFragment
import com.example.hw_3_6_month.ui.viewpager.FragmentResult
import com.example.hw_3_6_month.ui.viewpager.FragmentHistory

class AdapterVP(fm: FragmentActivity) : FragmentStateAdapter(fm) {
    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> ButtonFragment()
            1 -> FragmentResult()
            2 -> FragmentHistory()
            else -> ButtonFragment()
        }
    }
}