package com.example.neurologycalc

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RadioButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class FOUR : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_four)

        val backFromFOUR = findViewById<Button>(R.id.backFromFour)
        backFromFOUR.setOnClickListener(){
            val intent = Intent(this@FOUR, MainActivity::class.java)
            startActivity(intent)
        }

        val eyeFOUR4 = findViewById<RadioButton>(R.id.eyeFOUR4)
        val eyeFOUR3 = findViewById<RadioButton>(R.id.eyeFOUR3)
        val eyeFOUR2 = findViewById<RadioButton>(R.id.eyeFOUR2)
        val eyeFOUR1 = findViewById<RadioButton>(R.id.eyeFOUR1)
        val eyeFOUR0 = findViewById<RadioButton>(R.id.eyeFOUR0)

        val motorFOUR4 = findViewById<RadioButton>(R.id.motorFOUR4)
        val motorFOUR3 = findViewById<RadioButton>(R.id.motorFOUR3)
        val motorFOUR2 = findViewById<RadioButton>(R.id.motorFOUR2)
        val motorFOUR1 = findViewById<RadioButton>(R.id.motorFOUR1)
        val motorFOUR0 = findViewById<RadioButton>(R.id.motorFOUR0)

        val reflexFOUR4 = findViewById<RadioButton>(R.id.reflexFOUR4)
        val reflexFOUR3 = findViewById<RadioButton>(R.id.reflexFOUR3)
        val reflexFOUR2 = findViewById<RadioButton>(R.id.reflexFOUR2)
        val reflexFOUR1 = findViewById<RadioButton>(R.id.reflexFOUR1)
        val reflexFOUR0 = findViewById<RadioButton>(R.id.reflexFOUR0)

        val breathFOUR4 = findViewById<RadioButton>(R.id.breathFOUR4)
        val breathFOUR3 = findViewById<RadioButton>(R.id.breathFOUR3)
        val breathFOUR2 = findViewById<RadioButton>(R.id.breathFOUR2)
        val breathFOUR1 = findViewById<RadioButton>(R.id.breathFOUR1)
        val breathFOUR0 = findViewById<RadioButton>(R.id.breathFOUR0)

        var totalEye = 0
        var totalMotor = 0
        var totalReflex = 0
        var totalBreath = 0
        var total = 0

        val getResultFOUR = findViewById<Button>(R.id.getResultFour)
        getResultFOUR.setOnClickListener(){

            if (eyeFOUR4.isChecked) totalEye = 4
            if (eyeFOUR3.isChecked) totalEye = 3
            if (eyeFOUR2.isChecked) totalEye = 2
            if (eyeFOUR1.isChecked) totalEye = 1
            if (eyeFOUR0.isChecked) totalEye = 0

            if (motorFOUR4.isChecked) totalMotor = 4
            if (motorFOUR3.isChecked) totalMotor = 3
            if (motorFOUR2.isChecked) totalMotor = 2
            if (motorFOUR1.isChecked) totalMotor = 1
            if (motorFOUR0.isChecked) totalMotor = 0

            if (reflexFOUR4.isChecked) totalReflex = 4
            if (reflexFOUR3.isChecked) totalReflex = 3
            if (reflexFOUR2.isChecked) totalReflex = 2
            if (reflexFOUR1.isChecked) totalReflex = 1
            if (reflexFOUR0.isChecked) totalReflex = 0

            if (breathFOUR4.isChecked) totalBreath = 4
            if (breathFOUR3.isChecked) totalBreath = 3
            if (breathFOUR2.isChecked) totalBreath = 2
            if (breathFOUR1.isChecked) totalBreath = 1
            if (breathFOUR0.isChecked) totalBreath = 0


            total = totalEye + totalMotor + totalReflex + totalBreath

            val interpretationFour = findViewById<TextView>(R.id.interpretationFOURTxt)
            val resultFOUR = findViewById<TextView>(R.id.resultFOURTxt)

            resultFOUR.text = "Сумма баллов составляет $total"

            when(total){
                in 0..3 -> {
                    interpretationFour.visibility = TextView.VISIBLE
                    interpretationFour.text = "Смерть мозга"
                }
                in 4..8 -> {
                    interpretationFour.visibility = TextView.VISIBLE
                    interpretationFour.text = "Кома"
                }
                in 9..12 -> {
                    interpretationFour.visibility = TextView.VISIBLE
                    interpretationFour.text = "Сопор"
                }
                in 13..14 -> {
                    interpretationFour.visibility = TextView.VISIBLE
                    interpretationFour.text = "Оглушение"
                }
                15 -> {
                    interpretationFour.visibility = TextView.VISIBLE
                    interpretationFour.text = "Сомноленция"
                }
                16 -> {
                    interpretationFour.visibility = TextView.VISIBLE
                    interpretationFour.text = "Ясное сознание"
                }
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