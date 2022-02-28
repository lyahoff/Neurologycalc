package com.example.neurologycalc

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EdgeEffect
import android.widget.EditText
import android.widget.TextView
import java.text.DecimalFormat

class Algover : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_algover)

        val back = findViewById<Button>(R.id.backFromAlgover)
        back.setOnClickListener(){
            val intent = Intent(this@Algover, MainActivity::class.java)
            finish()
            startActivity(intent)
        }

        val result = findViewById<Button>(R.id.algoverResultBtn)
        result.setOnClickListener(){
            val heartET = findViewById<EditText>(R.id.algoverHeart)
            val pressureET = findViewById<EditText>(R.id.algoverPressure)
            val interpretation = findViewById<TextView>(R.id.algoverInterpretation)
            var total : Double
            var heartTotal : Double
            var pressureTotal : Double

            var heartText = heartET.text.toString()
            var pressureText = pressureET.text.toString()

            if (heartText.isEmpty()){
                heartTotal = 0.0
            }
            else{
                heartTotal = heartText.toString().toDouble()
            }
            if (pressureText.isEmpty()){
                pressureTotal = 0.0
            }
            else{
                pressureTotal = pressureText.toString().toDouble()
            }
            if (pressureTotal == 0.0) pressureET.hint = "Значение должно быть выше 0"

            total = heartTotal / pressureTotal

            val df = DecimalFormat("#.##")

            when(total){
                in  0.1..0.79 -> {
                    interpretation.visibility = TextView.VISIBLE
                    interpretation.text = "Индекс Альговера составляет ${df.format(total)} \n\nНет шока"
                }
                in  0.8..0.9 -> {
                    interpretation.visibility = TextView.VISIBLE
                    interpretation.text = "Индекс Альговера составляет ${df.format(total)} \n" +
                            "\nШок I степени. Кровопотеря 15 - 20% ОЦК"
                }
                in  0.91..1.2 -> {
                    interpretation.visibility = TextView.VISIBLE
                    interpretation.text = "Индекс Альговера составляет ${df.format(total)} \n" +
                            "\nШок II степени. Кровопотеря 20 - 40% ОЦК"
                }
                in  1.21..2.0 -> {
                    interpretation.visibility = TextView.VISIBLE
                    interpretation.text = "Индекс Альговера составляет ${df.format(total)} \n" +
                            "\nШок III степени. Кровопотеря более 40% ОЦК"
                }
                in  2.1..100.0 -> {
                    interpretation.visibility = TextView.VISIBLE
                    interpretation.text = "Индекс Альговера составляет ${df.format(total)} \n" +
                            "\nТерминальная стадия шока"
                }
            }




        }


    }
}