package com.example.neurologycalc

import android.app.Activity
import android.content.Intent
import android.os.Build

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Volume : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_volume)

        val back = findViewById<Button>(R.id.backFromVolume)
        back.setOnClickListener(){
            val intent = Intent(this@Volume, Intracranial::class.java)
            finish()
            startActivity(intent)
        }



        val result = findViewById<Button>(R.id.volumeResult)
        result.setOnClickListener(){
            val big = findViewById<EditText>(R.id.big)
            val biggest = findViewById<EditText>(R.id.biggest)
            val cuts = findViewById<EditText>(R.id.cuts)
            val interpretation = findViewById<TextView>(R.id.volumeInterpretation)

            val fieldA : Double
            val fieldB : Double
            val fieldC : Int


            val bigString = big.text.toString()
            val biggestString = biggest.text.toString()
            val cutsString = cuts.text.toString()

            var total : Double

            if (bigString.isEmpty()){
                fieldA = 0.0
            }
            else{
                fieldA = big.text.toString().toDouble()
            }

            if (biggestString.isEmpty()){
                fieldB = 0.0
            }
            else{
                fieldB = biggest.text.toString().toDouble()
            }

            if (cutsString.isEmpty()){
                fieldC = 0
            }
            else{
                fieldC = cuts.text.toString().toInt()
            }


            total = (fieldA * fieldB * fieldC) / 2

            interpretation.visibility = TextView.VISIBLE
            interpretation.text = "Объем внутричерепного кровоизлияния: $total см³"


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