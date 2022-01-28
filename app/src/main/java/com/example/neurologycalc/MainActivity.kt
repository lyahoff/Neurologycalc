package com.example.neurologycalc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var insultButton = findViewById<Button>(R.id.insultButton)

        insultButton.setOnClickListener(){
            val intent = Intent(this@MainActivity,Insult::class.java)
            startActivity(intent)
        }

        var intracranialButton = findViewById<Button>(R.id.intracranialButton)
        intracranialButton.setOnClickListener(){
            val intent = Intent(this@MainActivity,Intracranial::class.java)
            startActivity(intent)
        }

        var subarachButton = findViewById<Button>(R.id.subarButton)
        subarachButton.setOnClickListener(){
            val intent = Intent(this@MainActivity,Subarach::class.java)
            startActivity(intent)
        }

        var consciousnessButton = findViewById<Button>(R.id.consButton)
        consciousnessButton.setOnClickListener(){
            val intent = Intent(this@MainActivity,Consciousness::class.java)
            startActivity(intent)
        }

        var headacheButton = findViewById<Button>(R.id.headacheButton)
        headacheButton.setOnClickListener(){
            val intent = Intent(this@MainActivity,MIDAS::class.java)
            startActivity(intent)
        }

        var scleroseButton = findViewById<Button>(R.id.scleroseButton)
        scleroseButton.setOnClickListener(){
            val intent = Intent(this@MainActivity,Sclerose::class.java)
            startActivity(intent)
        }

    }
}