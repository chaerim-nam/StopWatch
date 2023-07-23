package com.example.stopwatch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.sql.Time
import java.util.*

class MainActivity : AppCompatActivity() {

    private var time = 0;
    private var timerTask: Time? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


}