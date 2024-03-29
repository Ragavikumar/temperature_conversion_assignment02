package com.firstapp.temperature

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.math.round


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val inputEditText: EditText = findViewById(R.id.t1)
        val fah_to_cel: Button = findViewById(R.id.b1)
        val cel_to_fah: Button  = findViewById(R.id.b2)
        val restext: TextView = findViewById(R.id.t2)

        cel_to_fah.setOnClickListener {
            val input = inputEditText.text.toString().toDoubleOrNull()
            if (input != null) {
                // Assuming the user enters temperature in Celsius and wants it in Fahrenheit
                val resultFahrenheit = (input * 9/5) + 32
                val result = round(resultFahrenheit * 100) / 100 // Rounding to 2 decimal places
                val a =result.toString()
                restext.setText(a+" °F")
            } else {
                restext.text = "Please enter a valid Celsius number"
            }
        }
        fah_to_cel.setOnClickListener {
            val input = inputEditText.text.toString().toDoubleOrNull()
            if (input != null) {
                // Assuming the user enters temperature in Fahrenheit and wants it in Celsius
                val resultCelsius = (input -32)* (5/9)
                val result = round(resultCelsius * 100) / 100 // Rounding to 2 decimal places
                val a =result.toString()
                restext.setText(a+" °C")
            } else {
                restext.text = "Please enter a valid Farenheit"
            }
        }




    }
}