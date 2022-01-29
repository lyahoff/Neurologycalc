package com.example.neurologycalc

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView
import java.lang.Math.pow
import kotlin.math.pow
import java.math.RoundingMode
import java.text.DecimalFormat

class SKF : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skf)

        val back = findViewById<Button>(R.id.backFromSkf)
        back.setOnClickListener(){
            val intent = Intent(this@SKF,MainActivity::class.java)
            startActivity(intent)
        }



        val crt = findViewById<EditText>(R.id.etCrt)
        val age = findViewById<EditText>(R.id.SkfAge)
        val weight = findViewById<EditText>(R.id.SkfWeight)
        val height = findViewById<EditText>(R.id.SkfHeight)

        val result = findViewById<Button>(R.id.skfResult)
        result.setOnClickListener() {

            val male = findViewById<RadioButton>(R.id.rbMale)
            val female = findViewById<RadioButton>(R.id.rbFemale)
            val mkm = findViewById<RadioButton>(R.id.btnMol)
            val mg = findViewById<RadioButton>(R.id.btnMg)

            val interpretation = findViewById<TextView>(R.id.skfInterpretation)

            var crtText = crt.text.toString()
            var ageText = age.text.toString()
            var weightText = weight.text.toString()
            var heightText = height.text.toString()

            var crtResult: Double
            var ageResult: Double
            var weightResult: Double
            var heightResult: Double


            var total: Double

            if (crtText.isEmpty()) {
                crtResult = 0.0
            } else {
                crtResult = crtText.toDouble()
            }

            if (ageText.isEmpty()) {
                ageResult = 0.0
            } else {
                ageResult = ageText.toDouble()
            }

            if (weightText.isEmpty()) {
                weightResult = 0.0
            } else {
                weightResult = weightText.toDouble()
            }

            if (heightText.isEmpty()) {
                heightResult = 0.0
            } else {
                heightResult = heightText.toDouble()
            }



            if (crtResult<=62 || female.isChecked){
                total = 144 * (0.993.pow(ageResult)) * pow(((crtResult/88.4)/0.7),-0.328)
                val df = DecimalFormat("#")
                interpretation.visibility = TextView.VISIBLE
                interpretation.text = "${df.format(total)}"
            }




        }
        }

    }