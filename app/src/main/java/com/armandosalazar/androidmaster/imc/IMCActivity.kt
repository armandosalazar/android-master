package com.armandosalazar.androidmaster.imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.cardview.widget.CardView
import com.armandosalazar.androidmaster.R
import com.google.android.material.slider.RangeSlider

class IMCActivity : AppCompatActivity() {
    private lateinit var cardViewMale: CardView
    private lateinit var cardViewFemale: CardView
    private lateinit var tvHeight: TextView
    private lateinit var rsHeight: RangeSlider
    private var isMale = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_imcactivity)

        initComponent()
        initUI()
        setListeners()
    }

    private fun initComponent() {
        cardViewMale = findViewById(R.id.cardViewMale)
        cardViewFemale = findViewById(R.id.cardViewFemale)
        tvHeight = findViewById(R.id.tvHeight)
        rsHeight = findViewById(R.id.rsHeight)
    }

    private fun initUI() {
        "${rsHeight.values[0].toInt()} cm".also { tvHeight.text = it }
    }

    private fun setListeners() {
        cardViewMale.setOnClickListener {
            isMale = true
            cardViewMale.setCardBackgroundColor(
                resources.getColor(
                    R.color.background_component_selected,
                    null
                )
            )
            cardViewFemale.setCardBackgroundColor(
                resources.getColor(
                    R.color.background_component,
                    null
                )
            )
        }
        cardViewFemale.setOnClickListener {
            isMale = false
            cardViewFemale.setCardBackgroundColor(
                resources.getColor(
                    R.color.background_component_selected,
                    null
                )
            )
            cardViewMale.setCardBackgroundColor(
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