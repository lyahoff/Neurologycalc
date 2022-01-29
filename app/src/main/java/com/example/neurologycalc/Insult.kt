package com.example.neurologycalc

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Insult : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_insult)

        val backToMain = findViewById<Button>(R.id.backToMain)
        backToMain.setOnClickListener(){
            val intent = Intent(this@Insult,MainActivity::class.java)
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

        val skf = findViewById<Button>(R.id.skfBtn)
        skf.setOnClickListener(){
            val intent = Intent(this@Insult,SKF::class.java)
            startActivity(intent)
        }


    }
}