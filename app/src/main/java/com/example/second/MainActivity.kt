package com.example.second

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

lateinit var firstFragment: FirstFragment
lateinit var secondFragment: SecondFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        firstFragment = FirstFragment.newInstance()
        secondFragment = SecondFragment.newInstance()

    }

    fun switchToFirstFragment() {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.container, firstFragment )
            .commit()
    }

    fun switchToSecondFragment() {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.container, secondFragment )
            .commit()
    }
}