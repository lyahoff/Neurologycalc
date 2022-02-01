package com.example.neurologycalc

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class HasBled : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_has_bled)

        val agChB = findViewById<CheckBox>(R.id.agChB)
        val kidneyChB = findViewById<CheckBox>(R.id.kidneyChB)
        val liverChB = findViewById<CheckBox>(R.id.liverChB)
        val insultChB = findViewById<CheckBox>(R.id.insChB)
        val bloodChB = findViewById<CheckBox>(R.id.bloodChB)
        val mnoChB = findViewById<CheckBox>(R.id.mnoChB)
        val ageChB = findViewById<CheckBox>(R.id.ageChB)
        val drugsChB = findViewById<CheckBox>(R.id.drugsChB)
        val alcoholChB = findViewById<CheckBox>(R.id.alcoholChB)
        val interpretation = findViewById<TextView>(R.id.hasInterpretation)

        val result = findViewById<Button>(R.id.hasResult)

        val back = findViewById<Button>(R.id.backFromHas)
        back.setOnClickListener(){
            val intent = Intent(this@HasBled,MainActivity::class.java)
            startActivity(intent)
        }

        result.setOnClickListener(){
            var check = 0

            if (agChB.isChecked) check +=1
            if (kidneyChB.isChecked) check +=1
            if (liverChB.isChecked) check +=1
            if (insultChB.isChecked) check +=1
            if (bloodChB.isChecked) check +=1
            if (mnoChB.isChecked) check +=1
            if (ageChB.isChecked) check +=1
            if (drugsChB.isChecked) check +=1
            if (alcoholChB.isChecked) check +=1

            when(check){
                in 0..2 -> {
                    interpretation.visibility = TextView.VISIBLE
                    interpretation.text = "Результат $check \n\nРезультат в 2 балла и менее — нет значимого повышения риска кровотечений, но необходим тщательный контроль"
                    check = 0
                }
                in 3..9 -> {
                    interpretation.visibility = TextView.VISIBLE
                    interpretation.text = "Результат $check \n\nВысокий риск кровотечения, применение любого антитромботического препарата требует особой осторожности."
                    check = 0
                }
            }



        }

    }
}