package com.example.neurologycalc

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Intracranial : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intracranial)


        val backToMainButton = findViewById<Button>(R.id.backToMainButton)
        backToMainButton.setOnClickListener(){
            val intent = Intent(this@Intracranial,MainActivity::class.java)
            startActivity(intent)
        }

        val rate = findViewById<Button>(R.id.rateButton)
        rate.setOnClickListener(){
            val intent = Intent(this@Intracranial,Functionality::class.java)
            startActivity(intent)
        }

        val volume = findViewById<Button>(R.id.volumeButton)
        volume.setOnClickListener(){
            val intent = Intent(this@Intracranial,Volume::class.java)
            startActivity(intent)
        }

    }
}