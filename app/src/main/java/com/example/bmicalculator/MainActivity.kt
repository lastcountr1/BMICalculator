package com.example.bmicalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.widget.Button
import android.widget.EditText
import android.content.Intent

class MainActivity : AppCompatActivity() {

    private var editWeight:Editable ?= null
    private var editHeight:Editable ?= null
    private var message:String ?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val  btn = findViewById(R.id.btn) as Button
        btn.setOnClickListener {
            calc()
        }
    }

    fun calc(){
        editWeight = findViewById<EditText>(R.id.weight_input).editableText
        val weight = editWeight.toString()
        editHeight = findViewById<EditText?>(R.id.height_input).editableText
        val height = editHeight.toString()
        val height_m = (height.toFloat())/100
        val bmi = weight.toFloat()/(height_m * height_m)
        val intent = Intent(this, MainActivity2::class.java)
        if(bmi < 18.5 && bmi > 0){
            message = "You are Underweight"
        }else if (bmi > 18.5 && bmi <= 24.9){
            message = "Your weight is normal"
        }
        else{
            message = "You are overweight"
        }

        intent.putExtra("Result", bmi)
        intent.putExtra("Message", message)
        startActivity(intent)
    }


}

