package com.example.firstexampleandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var textViewHola1: TextView
    lateinit var textViewHola2: TextView
    lateinit var textViewHola3: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textViewHola1 = findViewById(R.id.tv_hola1)
        textViewHola2 = findViewById(R.id.tv_hola2)
        textViewHola3 = findViewById(R.id.tv_hola3)

        textViewHola1.text = "Martin"
        textViewHola2.text = "Pro"
        textViewHola3.text = "Developer"

        textViewHola1.textSize = 26f

    }
}