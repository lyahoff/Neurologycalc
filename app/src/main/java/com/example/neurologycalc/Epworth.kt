package com.example.neurologycalc

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RadioButton
import android.widget.TextView

class Epworth : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_epworth)

        val back = findViewById<Button>(R.id.backFromEpworth)
        back.setOnClickListener(){
            val intent = Intent(this@Epworth, MainActivity::class.java)
            finish()
            startActivity(intent)
        }

        val result = findViewById<Button>(R.id.EpworthResult)
        result.setOnClickListener(){
            val epworth1_0 = findViewById<RadioButton>(R.id.Epworth1_0)
            val epworth1_1 = findViewById<RadioButton>(R.id.Epworth1_1)
            val epworth1_2 = findViewById<RadioButton>(R.id.Epworth1_2)
            val epworth1_3 = findViewById<RadioButton>(R.id.Epworth1_3)

            val epworth2_0 = findViewById<RadioButton>(R.id.Epworth2_0)
            val epworth2_1 = findViewById<RadioButton>(R.id.Epworth2_1)
            val epworth2_2 = findViewById<RadioButton>(R.id.Epworth2_2)
            val epworth2_3 = findViewById<RadioButton>(R.id.Epworth2_3)

            val epworth3_0 = findViewById<RadioButton>(R.id.Epworth3_0)
            val epworth3_1 = findViewById<RadioButton>(R.id.Epworth3_1)
            val epworth3_2 = findViewById<RadioButton>(R.id.Epworth3_2)
            val epworth3_3 = findViewById<RadioButton>(R.id.Epworth3_3)

            val epworth4_0 = findViewById<RadioButton>(R.id.Epworth4_0)
            val epworth4_1 = findViewById<RadioButton>(R.id.Epworth4_1)
            val epworth4_2 = findViewById<RadioButton>(R.id.Epworth4_2)
            val epworth4_3 = findViewById<RadioButton>(R.id.Epworth4_3)

            val epworth5_0 = findViewById<RadioButton>(R.id.Epworth5_0)
            val epworth5_1 = findViewById<RadioButton>(R.id.Epworth5_1)
            val epworth5_2 = findViewById<RadioButton>(R.id.Epworth5_2)
            val epworth5_3 = findViewById<RadioButton>(R.id.Epworth5_3)

            val epworth6_0 = findViewById<RadioButton>(R.id.Epworth6_0)
            val epworth6_1 = findViewById<RadioButton>(R.id.Epworth6_1)
            val epworth6_2 = findViewById<RadioButton>(R.id.Epworth6_2)
            val epworth6_3 = findViewById<RadioButton>(R.id.Epworth6_3)

            val epworth7_0 = findViewById<RadioButton>(R.id.Epworth7_0)
            val epworth7_1 = findViewById<RadioButton>(R.id.Epworth7_1)
            val epworth7_2 = findViewById<RadioButton>(R.id.Epworth7_2)
            val epworth7_3 = findViewById<RadioButton>(R.id.Epworth7_3)

            val epworth8_0 = findViewById<RadioButton>(R.id.Epworth8_0)
            val epworth8_1 = findViewById<RadioButton>(R.id.Epworth8_1)
            val epworth8_2 = findViewById<RadioButton>(R.id.Epworth8_2)
            val epworth8_3 = findViewById<RadioButton>(R.id.Epworth8_3)

            val interpretation = findViewById<TextView>(R.id.epInterpretation)

            var ep1 = 0
            var ep2 = 0
            var ep3 = 0
            var ep4 = 0
            var ep5 = 0
            var ep6 = 0
            var ep7 = 0
            var ep8 = 0

            if (epworth1_0.isChecked) ep1 = 0
            if (epworth1_1.isChecked) ep1 = 1
            if (epworth1_2.isChecked) ep1 = 2
            if (epworth1_3.isChecked) ep1 = 3

            if (epworth2_0.isChecked) ep2 = 0
            if (epworth2_1.isChecked) ep2 = 1
            if (epworth2_2.isChecked) ep2 = 2
            if (epworth2_3.isChecked) ep2 = 3

            if (epworth3_0.isChecked) ep3 = 0
            if (epworth3_1.isChecked) ep3 = 1
            if (epworth3_2.isChecked) ep3 = 2
            if (epworth3_3.isChecked) ep3 = 3

            if (epworth4_0.isChecked) ep4 = 0
            if (epworth4_1.isChecked) ep4 = 1
            if (epworth4_2.isChecked) ep4 = 2
            if (epworth4_3.isChecked) ep4 = 3

            if (epworth5_0.isChecked) ep5 = 0
            if (epworth5_1.isChecked) ep5 = 1
            if (epworth5_2.isChecked) ep5 = 2
            if (epworth5_3.isChecked) ep5 = 3

            if (epworth7_0.isChecked) ep7 = 0
            if (epworth7_1.isChecked) ep7 = 1
            if (epworth7_2.isChecked) ep7 = 2
            if (epworth7_3.isChecked) ep7 = 3

            if (epworth8_0.isChecked) ep8 = 0
            if (epworth8_1.isChecked) ep8 = 1
            if (epworth8_2.isChecked) ep8 = 2
            if (epworth8_3.isChecked) ep8 = 3

            val epTotal = ep1 + ep2 + ep3 + ep4 + ep5 + ep6 + ep7 + ep8

            when(epTotal){
                in 0..2 -> {
                    interpretation.visibility = TextView.VISIBLE
                    interpretation.text = "Количество баллов: $epTotal \n\nНорма"
                }
                in 3..8 -> {
                    interpretation.visibility = TextView.VISIBLE
                    interpretation.text = "Количество баллов: $epTotal \n" +
                            "\nИнсомния (бессонница)"
                }
                in 9..15 -> {
                    interpretation.visibility = TextView.VISIBLE
                    interpretation.text = "Количество баллов: $epTotal \n" +
                            "\nСиндром обструктивного апноэ сна"
                }
                in 16..24 -> {
                    interpretation.visibility = TextView.VISIBLE
                    interpretation.text = "Количество баллов: $epTotal \n" +
                            "\nНарколепсия (гиперсомния центрального генеза)"
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