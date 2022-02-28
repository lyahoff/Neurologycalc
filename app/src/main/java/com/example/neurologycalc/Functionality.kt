package com.example.neurologycalc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.TextView

class Functionality : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_functionality)

        val back = findViewById<Button>(R.id.backFromFunctionalityBtn)
        back.setOnClickListener(){
            val intent = Intent(this@Functionality, MainActivity::class.java)
            finish()
            startActivity(intent)
        }

        val result = findViewById<Button>(R.id.functionalityResultBtn)
        result.setOnClickListener(){
            val rbVolume4 = findViewById<RadioButton>(R.id.rbVolume4)
            val rbVolume2 = findViewById<RadioButton>(R.id.rbVolume2)
            val rbVolume0 = findViewById<RadioButton>(R.id.rbVolume0)

            val rb70Less = findViewById<RadioButton>(R.id.rbAgeFunctionalityLess70)
            val rb70 = findViewById<RadioButton>(R.id.rbAgeFunctionality70)
            val rb80 = findViewById<RadioButton>(R.id.rbAgeFunctionality80)

            val rbLocal2 = findViewById<RadioButton>(R.id.rbLocal2)
            val rbLocal1 = findViewById<RadioButton>(R.id.rbLocal1)
            val rbLocal0 = findViewById<RadioButton>(R.id.rbLocal0)

            val rbGlazgo2 = findViewById<RadioButton>(R.id.rbGlazgo2)
            val rbGlazgo0 = findViewById<RadioButton>(R.id.rbGlazgo0)


            val rbCogn1 = findViewById<RadioButton>(R.id.rbCogn1)
            val rbCogn0 = findViewById<RadioButton>(R.id.rbCogn0)

            val interpretation = findViewById<TextView>(R.id.functionalityInterpretation)

            var volume = 0
            var age = 0
            var local = 0
            var glazgo = 0
            var cogn = 0

            if (rbVolume4.isChecked) volume = 4
            if (rbVolume2.isChecked) volume = 2
            if (rbVolume0.isChecked) volume = 0

            if (rb70Less.isChecked) age = 2
            if (rb70.isChecked) age = 1
            if (rb80.isChecked) age = 2

            if (rbLocal2.isChecked) local = 2
            if (rbLocal1.isChecked) local = 1
            if (rbLocal0.isChecked) local = 0

            if (rbGlazgo2.isChecked) glazgo = 2
            if (rbGlazgo0.isChecked) glazgo = 0

            if (rbCogn1.isChecked) cogn = 1
            if (rbCogn0.isChecked) cogn = 0

            var total = volume + age + local + glazgo + cogn

            when(total){
                in 0..4 -> { interpretation.visibility = TextView.VISIBLE
                    interpretation.text = "Результат: $total\n" +
                            "Процент достижения функциональной самостоятельности через 90 дней: 0%"
                }
                in 5..7 -> { interpretation.visibility = TextView.VISIBLE
                    interpretation.text = "Результат: $total\n" +
                            "Процент достижения функциональной самостоятельности через 90 дней: 29%"
                }
                8 -> { interpretation.visibility = TextView.VISIBLE
                    interpretation.text = "Результат: $total\n" +
                            "Процент достижения функциональной самостоятельности через 90 дней: 48%"
                }
                in 9..10-> { interpretation.visibility = TextView.VISIBLE
                    interpretation.text = "Результат: $total\n" +
                            "Процент достижения функциональной самостоятельности через 90 дней: 75%"
                }
                11 -> { interpretation.visibility = TextView.VISIBLE
                    interpretation.text = "Результат: $total\n" +
                            "Процент достижения функциональной самостоятельности через 90 дней: 95%"
                }
            }


        }


    }
}