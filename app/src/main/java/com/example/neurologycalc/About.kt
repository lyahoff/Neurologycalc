package com.example.neurologycalc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class About : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        val back = findViewById<Button>(R.id.backFromAbout)
        back.setOnClickListener(){
            val intent = Intent(this@About, MainActivity::class.java)
            finish()
            startActivity(intent)
        }

    }
}