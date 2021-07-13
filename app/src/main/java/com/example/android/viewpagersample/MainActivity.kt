package com.example.android.viewpagersample


import android.os.Bundle


import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager


/**
 * Displays a [ViewPager] where each page shows a different day of the week.
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main)

        // Find the view pager that will allow the user to swipe between fragments
        val viewPager = findViewById<View>(R.id.viewpager) as ViewPager

        // Create an adapter that knows which fragment should be shown on each page
        val adapter =
            SimpleFragmentPagerAdapter(supportFragmentManager)

        // Set the adapter onto the view pager
        viewPager.adapter = adapter
    }
}