package com.armandosalazar.androidmaster

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.armandosalazar.androidmaster.firstapp.FirstAppActivity

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val btnGreetings = findViewById<Button>(R.id.btnGreetings)
        btnGreetings.setOnClickListener {
            startActivity(Intent(this, FirstAppActivity::class.java))
        }
    }
}