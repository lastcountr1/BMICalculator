package com.example.bmicalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {

    private var reslt:TextView ?= null
    private var mssge:TextView ?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val intent = intent
        val bm = intent.getFloatExtra("Result", 0.0f)
        val ms = intent.getStringExtra("Message")
        mssge = findViewById(R.id.textmessage)
        reslt = findViewById(R.id.result)
        reslt?.text = bm.toString()
        mssge?.text = ms

    }
}