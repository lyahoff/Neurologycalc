package com.example.neurologycalc

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import org.w3c.dom.Text

class ABCD2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_abcd2)

        val back = findViewById<Button>(R.id.backFromAbcd)
        back.setOnClickListener(){
            val intent = Intent(this@ABCD2,MainActivity::class.java)
            startActivity(intent)
        }

        val dbcdAgeLess60 = findViewById<RadioButton>(R.id.rbAgeAbcd60)
        val dbcdAgeMore60 = findViewById<RadioButton>(R.id.rbAgeAbcd60More)
        val agAbcdNormal = findViewById<RadioButton>(R.id.rbAgNormal)
        val agAbcdMore140 = findViewById<RadioButton>(R.id.rbAgMore140)
        val gemiparez = findViewById<RadioButton>(R.id.rbGemiparez)
        val gemiparezSpeak = findViewById<RadioButton>(R.id.rbGemiparezSpeak)
        val gemiparezAny = findViewById<RadioButton>(R.id.rbGemaparezAny)
        val symp10 = findViewById<RadioButton>(R.id.rbSymptLess10)
        val symp60less = findViewById<RadioButton>(R.id.rbSymptLess60)
        val symp60more = findViewById<RadioButton>(R.id.rbSymptMore60)
        val diabNo = findViewById<RadioButton>(R.id.rbAbcdDiabNo)
        val diabYes = findViewById<RadioButton>(R.id.rbAbcdDiabYes)

        val abcdInerpr = findViewById<TextView>(R.id.abcdInterpr)

        var age = 0
        var ag = 0
        var symp = 0
        var duration = 0
        var diabet = 0
        var total = 0



        val result = findViewById<Button>(R.id.abcdResult)
        result.setOnClickListener(){
            if (dbcdAgeLess60.isChecked) age = 0
            if (dbcdAgeMore60.isChecked) age = 1
            if (agAbcdNormal.isChecked) ag = 0
            if (agAbcdMore140.isChecked) ag = 1
            if (gemiparez.isChecked) symp = 2
            if (gemiparezSpeak.isChecked) symp = 1
            if (gemiparezAny.isChecked) symp = 0
            if (symp10.isChecked) duration = 0
            if (symp60less.isChecked) duration = 1
            if (symp60more.isChecked) duration = 2
            if (diabNo.isChecked) diabet = 0
            if (diabYes.isChecked) diabet = 1

            total = age+ag+symp+duration+diabet

            when(total){
                in 0..3 -> {
                    abcdInerpr.visibility = TextView.VISIBLE
                    abcdInerpr.text = "Результат $total \n\nНизкий риск инсульта\n" +
                            "\nРиск инсульта в течение 2 дней: 1.0%. " +
                            "\nРиск инсульта в течение 1 недели: 1.2%. " +
                            "\nРиск инсульта в течение 3 месяцев: 3.1%"
                }
                in 4..5 -> {
                    abcdInerpr.visibility = TextView.VISIBLE
                    abcdInerpr.text = "Результат $total \n\nУмеренный риск инсульта\n" +
                            "\nРиск инсульта в течение 2 дней: 4.1%. " +
                            "\nРиск инсульта в течение 1 недели: 5.9%. " +
                            "\nРиск инсульта в течение 3 месяцев: 9.8%"
                }
                in 6..7 -> {
                    abcdInerpr.visibility = TextView.VISIBLE
                    abcdInerpr.text = "Результат $total \n\nВысокий риск инсульта\n" +
                            "\nРиск инсульта в течение 2 дней: 8.1%. " +
                            "\nРиск инсульта в течение 1 недели: 11.7%. " +
                            "\nРиск инсульта в течение 3 месяцев: 17.8%"
                }

            }

        }


    }
}