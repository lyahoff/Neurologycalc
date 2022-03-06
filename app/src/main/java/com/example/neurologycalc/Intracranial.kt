package com.example.neurologycalc

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.view.View
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
            finish()
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

        if (Build.VERSION.SDK_INT < 19) {
            val v: View = this.window.decorView
            v.setSystemUiVisibility(View.GONE)
        } else {
            val decorView: View = window.decorView
            val uiOptions: Int = (View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                    or View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY)
            decorView.setSystemUiVisibility(uiOptions)
        }

    }
}