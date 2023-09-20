package com.example.my_application

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("This is included in second commit")
        println("Local change")
        println("Change 2")
        println("This is change 3 ...")
    }
}