package com.example.neurologycalc

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class RtPa : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rt_pa)

        val back = findViewById<Button>(R.id.backFromRtpaBtn)
        back.setOnClickListener(){
            val intent = Intent(this@RtPa, Insult::class.java)
            finish()
            startActivity(intent)
        }
        val result = findViewById<Button>(R.id.rtpaResultBtn)

        result.setOnClickListener(){
            val edit = findViewById<EditText>(R.id.rtpaEditText)
            val interpretation = findViewById<TextView>(R.id.rtpaInterpr)
            val score = edit.text.toString()
            var total = 0.0

            if (score.isEmpty()){
                interpretation.visibility = TextView.VISIBLE
                interpretation.text = "Укажите вес пациента"
            }
            else{
                total = score.toDouble() * 0.9
                if (score.toDouble()>=100) total = 90.0
                interpretation.visibility = TextView.VISIBLE
                interpretation.text = "Доза rt-PA: $total мг"
            }

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