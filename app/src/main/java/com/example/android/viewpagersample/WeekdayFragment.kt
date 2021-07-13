package com.example.android.viewpagersample

import android.os.Bundle

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment


/**
 * Fragment that displays a weekday.
 */
class WeekdayFragment : Fragment(R.layout.fragment_weekday) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val textView = view.findViewById<TextView>(R.id.text_view)
        textView.text = arguments?.getString("weekday")
    }
}