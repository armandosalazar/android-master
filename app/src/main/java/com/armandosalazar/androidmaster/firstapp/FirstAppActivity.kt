package com.armandosalazar.androidmaster.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.armandosalazar.androidmaster.R

class FirstAppActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_app)
    }
}