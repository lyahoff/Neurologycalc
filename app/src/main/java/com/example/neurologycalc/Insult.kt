package com.example.neurologycalc

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Insult : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_insult)

        val backToMain = findViewById<Button>(R.id.backToMain)
        backToMain.setOnClickListener(){
            val intent = Intent(this@Insult,MainActivity::class.java)
            finish()
            startActivity(intent)
        }

        val nihssBtn = findViewById<Button>(R.id.nihssBtn)
        nihssBtn.setOnClickListener(){
            val intent = Intent(this@Insult,Nihss::class.java)
            startActivity(intent)
        }

        val cha2Btn = findViewById<Button>(R.id.cha2Btn)
        cha2Btn.setOnClickListener(){
            val intent = Intent(this@Insult,Cha2::class.java)
            startActivity(intent)
        }

        val hasBled = findViewById<Button>(R.id.hasBledBtn)
        hasBled.setOnClickListener(){
            val intent = Intent(this@Insult,HasBled::class.java)
            startActivity(intent)
        }

        val abcd2 = findViewById<Button>(R.id.abcd2Btn)
        abcd2.setOnClickListener(){
            val intent = Intent(this@Insult,ABCD2::class.java)
            startActivity(intent)
        }

        val rtPa = findViewById<Button>(R.id.rtpaBtn)
        rtPa.setOnClickListener(){
            val intent = Intent(this@Insult,RtPa::class.java)
            startActivity(intent)
        }

        val renkin = findViewById<Button>(R.id.renkinBtn)
        renkin.setOnClickListener(){
            val intent = Intent(this@Insult,Renkin::class.java)
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