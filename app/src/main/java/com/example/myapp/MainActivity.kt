package com.example.myapp

import android.os.Bundle
import android.widget.EditText
import android.widget.SeekBar
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.addTextChangedListener

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



        inputAmount.addTextChangedListener {
            calculate(inputAmount.text.toString(), slider.progress)
        }
        slider.setOnSeekBarChangeListener(object: SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                checkSeek(p1)
                calculate(inputAmount.text.toString(), slider.progress)
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {}

            override fun onStopTrackingTouch(p0: SeekBar?) {}

        })
    }

    override fun onDestroy() {
        super.onDestroy()
    }


    fun checkSeek(progress: Int) {
        percent.text = progress.toString() + "%"
        if (progress <= 9) {
            quality.text = "Poor"
            quality.setTextColor(resources.getColor(R.color.red))
        }
        else if (progress <= 15) {
            quality.text = "Ok"
            quality.setTextColor(resources.getColor(R.color.orange))
        }
        else if (progress <= 20) {
            quality.text = "Good"
            quality.setTextColor(resources.getColor(R.color.lime))
        }
        else if (progress <= 25) {
            quality.text = "Great"
            quality.setTextColor(resources.getColor(R.color.green))
        }
        else {
            quality.text = "Awesome"
            quality.setTextColor(resources.getColor(R.color.blue))
        }
    }

    fun calculate(text: String, progress: Int) {
        if (text != "") {
            tip.text = "$" + (text.toDouble() * progress / 100)
            total.text = "$" + (tip.text.toString().substring(1).toDouble() + text.toDouble())
        }
    }

}