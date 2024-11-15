package com.example.myapp

import android.os.Bundle
import android.widget.EditText
import android.widget.SeekBar
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

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
    }
}