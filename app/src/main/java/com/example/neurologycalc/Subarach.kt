package com.example.neurologycalc

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Subarach : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_subarach)

        var backFromArach = findViewById<Button>(R.id.backFromArButton)

        backFromArach.setOnClickListener(){
            val intent = Intent(this@Subarach,MainActivity::class.java)
            startActivity(intent)
        }

    }
}