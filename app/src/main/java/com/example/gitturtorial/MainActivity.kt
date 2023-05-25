package com.example.gitturtorial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("First commit in master branch")
        println("First commit in developer 1")

        println("second commit in developer 1 but in developer branch not in master branch")
        println("developer 1 done job and want to merger with the master branch")
        println("developer 1 merge master branch success and want to update master branch")
    }
}