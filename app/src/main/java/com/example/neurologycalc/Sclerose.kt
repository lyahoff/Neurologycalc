package com.example.neurologycalc

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Sclerose : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sclerose)

        var backFromSclerose = findViewById<Button>(R.id.backFromSclerose)
        backFromSclerose.setOnClickListener(){
            val intent = Intent(this@Sclerose,MainActivity::class.java)
            startActivity(intent)
        }
    }
}