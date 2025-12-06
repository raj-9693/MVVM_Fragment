package com.example.protej.abstract_interface


import android.os.Bundle
import android.util.Log.v
import androidx.fragment.app.Fragment

import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.protej.abstract_interface.Fragment.API_Fragment
import com.example.protej.abstract_interface.Fragment.Home_Fragment
import com.example.protej.abstract_interface.Fragment.Profile_Fragment
import com.example.protej.abstract_interface.Fragment.code_Fragment
import com.example.protej.abstract_interface.databinding.ActivityMain2Binding
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity2 : AppCompatActivity() {
    lateinit var binging: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binging= ActivityMain2Binding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binging.root)


        replace(Home_Fragment())

        binging.bottomNavigation.setOnItemSelectedListener { item ->
            when (item.itemId) {

                R.id.nav_home -> { replace(Home_Fragment())
                    true
                }

                R.id.nav_profile -> {
                    replace(Profile_Fragment())
                    true
                }

                R.id.nav_rj -> {
                    replace(code_Fragment())
                    true
                }

                R.id.nav_search -> {
                    replace(API_Fragment())
                    true
                }

                else -> false
            }

}

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    private fun replace(fragment: Fragment){
          supportFragmentManager.beginTransaction()
              .replace(R.id.framelayoutID,fragment)
              .addToBackStack(null)
              .commit()

    }

}