package com.example.myapp

import android.os.Bundle
import android.widget.EditText
import android.widget.SeekBar
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    lateinit var inputAmount: EditText
    lateinit var slider: SeekBar
    lateinit var quality: TextView
    lateinit var tip: TextView
    lateinit var total: TextView
    lateinit var percent: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        inputAmount = findViewById(R.id.amount)
        slider = findViewById(R.id.seekBar)
        quality = findViewById(R.id.qualityResult)
        tip = findViewById(R.id.calculatedTip)
        total = findViewById(R.id.calculatedTotal)
        percent = findViewById(R.id.percent)


        tip.setOnClickListener {

        }
        slider.setOnSeekBarChangeListener(object: SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                checkSeek(p1)
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {}

            override fun onStopTrackingTouch(p0: SeekBar?) {}

        })
    }

    fun checkSeek(progress: Int) {
        percent.text = progress.toString() + "%"
        if (progress <= 9) {

        }
        else if (progress <= 15) {

        }
        else if (progress <= 20) {

        }
        else if (progress <= 25) {

        }
        else {

        }
    }

}