package com.example.neurologycalc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val insultButton = findViewById<Button>(R.id.insultButton)
        insultButton.setOnClickListener(){
            val intent = Intent(this@MainActivity,Insult::class.java)
            finish()
            startActivity(intent)
        }

        val intracranialButton = findViewById<Button>(R.id.intracranialButton)
        intracranialButton.setOnClickListener(){
            val intent = Intent(this@MainActivity,Intracranial::class.java)
            finish()
            startActivity(intent)
        }

        val consciousnessButton = findViewById<Button>(R.id.consButton)
        consciousnessButton.setOnClickListener(){
            val intent = Intent(this@MainActivity,Consciousness::class.java)
            finish()
            startActivity(intent)
        }

        val headacheButton = findViewById<Button>(R.id.headacheButton)
        headacheButton.setOnClickListener(){
            val intent = Intent(this@MainActivity,MIDAS::class.java)
            finish()
            startActivity(intent)
        }


        val algover = findViewById<Button>(R.id.algoverBtn)
        algover.setOnClickListener(){
            val intent = Intent(this@MainActivity,Algover::class.java)
            finish()
            startActivity(intent)
        }

        val ideal = findViewById<Button>(R.id.idealBodyBtn)
        ideal.setOnClickListener(){
            val intent = Intent(this@MainActivity,IdealBody::class.java)
            finish()
            startActivity(intent)
        }

        val skf = findViewById<Button>(R.id.skfCalcBtn)
        skf.setOnClickListener(){
            val intent = Intent(this@MainActivity, SKF::class.java)
            finish()
            startActivity(intent)
        }

        val hant = findViewById<Button>(R.id.subarButton)
        hant.setOnClickListener(){
            val intent = Intent(this@MainActivity, Hant::class.java)
            finish()
            startActivity(intent)
        }

        val nrs = findViewById<Button>(R.id.nrsBtn)
        nrs.setOnClickListener(){
            val intent = Intent(this@MainActivity, Nrs::class.java)
            finish()
            startActivity(intent)
        }

        val epworth = findViewById<Button>(R.id.EpworthBtn)
        epworth.setOnClickListener(){
            val intent = Intent(this@MainActivity, Epworth::class.java)
            finish()
            startActivity(intent)
        }

        val about = findViewById<Button>(R.id.aboutBtn)
        about.setOnClickListener(){
            val intent = Intent(this@MainActivity, About::class.java)
            finish()
            startActivity(intent)
        }

        val exit = findViewById<Button>(R.id.exitBtn)
        exit.setOnClickListener(){
            finish()
            onDestroy()
        }

    }
}