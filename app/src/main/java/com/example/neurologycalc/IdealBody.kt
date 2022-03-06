package com.example.neurologycalc

import android.app.Activity
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView
import java.text.DecimalFormat

class IdealBody : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ideal_body)

        val back = findViewById<Button>(R.id.backFromIdealBtn)
        back.setOnClickListener(){
            val intent = Intent(this@IdealBody,MainActivity::class.java)
            finish()
            startActivity(intent)
        }

        val result = findViewById<Button>(R.id.idealResult)
        result.setOnClickListener(){
            val interpretation = findViewById<TextView>(R.id.idealInterpretation)
            val male = findViewById<RadioButton>(R.id.idealMale)
            val female = findViewById<RadioButton>(R.id.idealFemale)

            val idealMass : Double
            var devine : Double
            var robinson : Double
            val heightEditText = findViewById<EditText>(R.id.idealWeight)
            val heightText = heightEditText.text.toString()

            if (heightText.isEmpty()){
                idealMass = 0.0
            }
            else{
                idealMass = heightEditText.text.toString().toDouble()
            }

            if (male.isChecked){
                var df = DecimalFormat("#.##")
                devine = 50+2.3*(0.394*idealMass-60)
                robinson = 52+1.9*(0.394*idealMass-60)
                interpretation.visibility = TextView.VISIBLE
                interpretation.text = "По методу Devine ${df.format(devine)}\n\nПо методу Robinson ${df.format(robinson)}"
            }
            if (female.isChecked){
                var df = DecimalFormat("#.##")
                devine = 45.5+2.3*(0.394*idealMass-60)
                robinson = 49+1.7*(0.394*idealMass-60)
                interpretation.visibility = TextView.VISIBLE
                interpretation.text = "По методу Devine ${df.format(devine)}\n\nПо методу Robinson ${df.format(robinson)}"
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