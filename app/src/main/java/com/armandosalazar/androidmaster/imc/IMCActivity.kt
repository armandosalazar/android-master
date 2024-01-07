package com.armandosalazar.androidmaster.imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.cardview.widget.CardView
import com.armandosalazar.androidmaster.R
import com.google.android.material.slider.RangeSlider

class IMCActivity : AppCompatActivity() {
    private lateinit var viewMale: CardView
    private lateinit var viewFemale: CardView
    private lateinit var tvHeight: TextView
    private lateinit var rsHeight: RangeSlider
    private var isMale = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_imcactivity)

        initComponent()
        setListeners()
    }

    private fun initComponent() {
        viewMale = findViewById(R.id.cardViewMale)
        viewFemale = findViewById(R.id.cardViewFemale)
        tvHeight = findViewById(R.id.tvHeight)
        rsHeight = findViewById(R.id.rsHeight)
    }

    private fun setListeners() {
        viewMale.setOnClickListener {
            isMale = true
            viewMale.setCardBackgroundColor(
                resources.getColor(
                    R.color.background_component_selected,
                    null
                )
            )
            viewFemale.setCardBackgroundColor(
                resources.getColor(
                    R.color.background_component,
                    null
                )
            )
        }
        viewFemale.setOnClickListener {
            isMale = false
            viewFemale.setCardBackgroundColor(
                resources.getColor(
                    R.color.background_component_selected,
                    null
                )
            )
            viewMale.setCardBackgroundColor(
                resources.getColor(
                    R.color.background_component,
                    null
                )
            )
        }

        rsHeight.addOnChangeListener { _, value, _ ->
            "${value.toInt()} cm".also { tvHeight.text = it }
        }
    }
}