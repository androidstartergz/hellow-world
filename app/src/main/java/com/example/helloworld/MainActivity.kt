package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("MainActivity", "OnCreate Execute")
        Log.d("Richard", "This is a Debug test message")
        Log.i("Richard", "This is a Info test message")
        Log.w("Richard", "This is a Info test message")
        Log.e("Richard", "This is a Error test message")
        Log.v("Richard", "This is a Verbose test message")
    }
}