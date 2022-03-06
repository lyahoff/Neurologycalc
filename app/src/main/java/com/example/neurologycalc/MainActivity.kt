package com.example.neurologycalc

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val insultButton = findViewById<Button>(R.id.insultButton)
        insultButton.setOnClickListener(){
            val intent = Intent(this@MainActivity,Insult::class.java)
            startActivity(intent)
        }

        val intracranialButton = findViewById<Button>(R.id.intracranialButton)
        intracranialButton.setOnClickListener(){
            val intent = Intent(this@MainActivity,Intracranial::class.java)
            startActivity(intent)
        }

        val consciousnessButton = findViewById<Button>(R.id.consButton)
        consciousnessButton.setOnClickListener(){
            val intent = Intent(this@MainActivity,Consciousness::class.java)
            startActivity(intent)
        }

        val headacheButton = findViewById<Button>(R.id.headacheButton)
        headacheButton.setOnClickListener(){
            val intent = Intent(this@MainActivity,MIDAS::class.java)
            startActivity(intent)
        }


        val algover = findViewById<Button>(R.id.algoverBtn)
        algover.setOnClickListener(){
            val intent = Intent(this@MainActivity,Algover::class.java)
            startActivity(intent)
        }

        val ideal = findViewById<Button>(R.id.idealBodyBtn)
        ideal.setOnClickListener(){
            val intent = Intent(this@MainActivity,IdealBody::class.java)
            startActivity(intent)
        }

        val skf = findViewById<Button>(R.id.skfCalcBtn)
        skf.setOnClickListener(){
            val intent = Intent(this@MainActivity, SKF::class.java)
            startActivity(intent)
        }

        val hant = findViewById<Button>(R.id.subarButton)
        hant.setOnClickListener(){
            val intent = Intent(this@MainActivity, Hant::class.java)
            startActivity(intent)
        }

        val nrs = findViewById<Button>(R.id.nrsBtn)
        nrs.setOnClickListener(){
            val intent = Intent(this@MainActivity, Nrs::class.java)
            startActivity(intent)
        }

        val epworth = findViewById<Button>(R.id.EpworthBtn)
        epworth.setOnClickListener(){
            val intent = Intent(this@MainActivity, Epworth::class.java)
            startActivity(intent)
        }

        val about = findViewById<Button>(R.id.aboutBtn)
        about.setOnClickListener(){
            val intent = Intent(this@MainActivity, About::class.java)
            startActivity(intent)
        }

        val exit = findViewById<Button>(R.id.exitBtn)
        exit.setOnClickListener(){
            finish()
            onDestroy()
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