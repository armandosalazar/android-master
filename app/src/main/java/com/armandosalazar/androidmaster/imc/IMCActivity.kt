package com.armandosalazar.androidmaster.imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView
import com.armandosalazar.androidmaster.R

class IMCActivity : AppCompatActivity() {
    private lateinit var viewMale: CardView
    private lateinit var viewFemale: CardView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_imcactivity)

        initComponent()
        setListeners()
    }

    private fun initComponent() {
        viewMale = findViewById(R.id.cardViewMale)
        viewFemale = findViewById(R.id.cardViewFemale)
    }

    private fun setListeners() {
        viewMale.setOnClickListener {
            viewMale.setCardBackgroundColor(
                resources.getColor(
                    R.color.background_component_selected,
                    null
                )
            )
            viewFemale.setBackgroundColor(
                resources.getColor(
                    R.color.background_component,
                    null
                )
            )
        }
    }
}