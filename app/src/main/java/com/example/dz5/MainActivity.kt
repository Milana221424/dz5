package com.example.dz5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.FirstFragment
import com.example.myapplication.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, FirstFragment()).commit()
        }
    }
}