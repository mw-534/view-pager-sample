package com.example.android.viewpagersample


import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter


/**
 * Provides the appropriate [Fragment] for a view pager.
 */
class SimpleFragmentPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {
    override fun getItem(position: Int): Fragment {
        val weekdayFragment = WeekdayFragment()
        val args = Bundle()
        val weekday = when (position) {
            0 -> "Monday"
            1 -> "Tuesday"
            2 -> "Wednesday"
            3 -> "Thursday"
            4 -> "Friday"
            else -> ""
        }
        args.putString("weekday", weekday)
        weekdayFragment.arguments = args
        return weekdayFragment
    }

    override fun getCount(): Int {
        return 5
    }
}