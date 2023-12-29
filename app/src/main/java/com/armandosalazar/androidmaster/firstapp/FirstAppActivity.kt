package com.armandosalazar.androidmaster.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import com.armandosalazar.androidmaster.R

class FirstAppActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_app)

        val btnStart = findViewById<AppCompatButton>(R.id.btnStart)
        val etName = findViewById<AppCompatEditText>(R.id.etName)


        btnStart.setOnClickListener {
            Log.i("FirstAppActivity", "Button clicked!")
            val name = etName.text.toString()

            if (name.isEmpty()) {
                etName.error = "Please enter your name"
                return@setOnClickListener
            } else {
                Log.i("FirstAppActivity", "Name: $name")
            }
        }
    }
}