package com.example.ambulance

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView

@Suppress("DEPRECATION")
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottom_navigation)

        bottomNavigationView.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.navigation_home -> {
                    // Handle the Home option click
                    true
                }
                R.id.navigation_hospitals -> {
                    // Handle the Hospitals option click
                    true
                }
                R.id.navigation_chat -> {
                    // Handle the Chat with Doctor option click
                    true
                }
                R.id.navigation_profile -> {
                    // Handle the Profile option click
                    true
                }
                else -> false
            }
        }
    }
}
