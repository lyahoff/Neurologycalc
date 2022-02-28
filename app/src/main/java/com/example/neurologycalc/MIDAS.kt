package com.example.neurologycalc


import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class MIDAS : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_midas)

        val backButton = findViewById<Button>(R.id.backFromMidas)
        backButton.setOnClickListener(){
            val intent = Intent(this@MIDAS, MainActivity::class.java)
            finish()
            startActivity(intent)
        }

        var midas1 = findViewById<EditText>(R.id.midas1)
        var midas2 = findViewById<EditText>(R.id.midas2)
        var midas3 = findViewById<EditText>(R.id.midas3)
        var midas4 = findViewById<EditText>(R.id.midas4)
        var midas5 = findViewById<EditText>(R.id.midas5)

        var midasInterpetation = findViewById<TextView>(R.id.midasInterpretation)

        val getResult = findViewById<Button>(R.id.midasResult)
        getResult.setOnClickListener(){

            val zero = "0"

            var str1 = midas1.text.toString()
            var str2 = midas2.text.toString()
            var str3 = midas3.text.toString()
            var str4 = midas4.text.toString()
            var str5 = midas5.text.toString()

            var m1: Int
            var m2: Int
            var m3: Int
            var m4: Int
            var m5: Int

            if (str1.isEmpty())
            {
                m1 = 0
            }
            else{
                m1 = str1.toString().toInt()
            }
            if (str2.isEmpty())
            {
                m2 = 0
            }
            else{
                m2 = str2.toString().toInt()
            }
            if (str3.isEmpty())
            {
                m3 = 0
            }
            else{
                m3 = str3.toString().toInt()
            }
            if (str4.isEmpty())
            {
                m4 = 0
            }
            else{
                m4 = str4.toString().toInt()
            }
            if (str5.isEmpty())
            {
                m5 = 0
            }
            else{
                m5 = str5.toString().toInt()
            }

            var totalMidas = m1+m2+m3+m4+m5

            when(totalMidas){
                in 0..5 -> {
                    midasInterpetation.text = "Общая оценка = $totalMidas \n\nСтепень I \n\nМалая интенсивность боли, отсутствие или минимальное снижение повседневной активности"
                    midasInterpetation.visibility = TextView.VISIBLE
                }
                in 6..10 -> {
                    midasInterpetation.text = "Общая оценка = $totalMidas \n\nСтепень II \n\nУмеренная / выраженная боль, незначительное ограничение повседневной активности"
                    midasInterpetation.visibility = TextView.VISIBLE
                }
                in 11..20 -> {
                    midasInterpetation.text = "Общая оценка = $totalMidas \n\nСтепень III \n\nСильная боль. Выраженное ограничение повседневной активности"
                    midasInterpetation.visibility = TextView.VISIBLE
                }
                in 21..92 -> {
                    midasInterpetation.text = "Общая оценка = $totalMidas \n\nСтепень IV \n\nСильная боль. Значительное снижение повседневной активности"
                    midasInterpetation.visibility = TextView.VISIBLE
                }

            }

            if (totalMidas>92){
                midasInterpetation.text = "Общая оценка не объективна, так как количество дней преувеличено"
                midasInterpetation.visibility = TextView.VISIBLE
            }










        }








    }
}