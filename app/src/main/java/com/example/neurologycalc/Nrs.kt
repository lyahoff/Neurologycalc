package com.example.neurologycalc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.TextView

class Nrs : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nrs)

        val back = findViewById<Button>(R.id.backFromNrs)
        back.setOnClickListener(){
            val intent = Intent(this@Nrs,MainActivity::class.java)
            finish()
            startActivity(intent)
        }

        val result = findViewById<Button>(R.id.nrsResult)
        result.setOnClickListener(){
            val interpretation = findViewById<TextView>(R.id.nrsInterpretation)

            val nrs1_10 = findViewById<RadioButton>(R.id.nrs1_10)
            val nrs1_7 = findViewById<RadioButton>(R.id.nrs1_7)
            val nrs1_4 = findViewById<RadioButton>(R.id.nrs1_4)
            val nrs1_0 = findViewById<RadioButton>(R.id.nrs1_0)

            val nrs2_5 = findViewById<RadioButton>(R.id.nrs2_5)
            val nrs2_3 = findViewById<RadioButton>(R.id.nrs2_3)
            val nrs2_1 = findViewById<RadioButton>(R.id.nrs2_1)
            val nrs2_0 = findViewById<RadioButton>(R.id.nrs2_0)

            val nrs3_6 = findViewById<RadioButton>(R.id.nrs3_6)
            val nrs3_4 = findViewById<RadioButton>(R.id.nrs3_4)
            val nrs3_2 = findViewById<RadioButton>(R.id.nrs3_2)
            val nrs3_0 = findViewById<RadioButton>(R.id.nrs3_0)

            val nrs4_5 = findViewById<RadioButton>(R.id.nrs4_5)
            val nrs4_3 = findViewById<RadioButton>(R.id.nrs4_3)
            val nrs4_1 = findViewById<RadioButton>(R.id.nrs4_1)
            val nrs4_0 = findViewById<RadioButton>(R.id.nrs4_0)

            val nrs5_5 = findViewById<RadioButton>(R.id.nrs5_5)
            val nrs5_3 = findViewById<RadioButton>(R.id.nrs5_3)
            val nrs5_1 = findViewById<RadioButton>(R.id.nrs5_1)
            val nrs5_0 = findViewById<RadioButton>(R.id.nrs5_0)

            val nrs6_5 = findViewById<RadioButton>(R.id.nrs6_5)
            val nrs6_3 = findViewById<RadioButton>(R.id.nrs6_3)
            val nrs6_1 = findViewById<RadioButton>(R.id.nrs6_1)
            val nrs6_0 = findViewById<RadioButton>(R.id.nrs6_0)

            val nrs7_5 = findViewById<RadioButton>(R.id.nrs7_5)
            val nrs7_3 = findViewById<RadioButton>(R.id.nrs7_3)
            val nrs7_1 = findViewById<RadioButton>(R.id.nrs7_1)
            val nrs7_0 = findViewById<RadioButton>(R.id.nrs7_0)

            val nrs8_5 = findViewById<RadioButton>(R.id.nrs8_5)
            val nrs8_3 = findViewById<RadioButton>(R.id.nrs8_3)
            val nrs8_1 = findViewById<RadioButton>(R.id.nrs8_1)
            val nrs8_0 = findViewById<RadioButton>(R.id.nrs8_0)

            val nrs9_5 = findViewById<RadioButton>(R.id.nrs9_5)
            val nrs9_3 = findViewById<RadioButton>(R.id.nrs9_3)
            val nrs9_1 = findViewById<RadioButton>(R.id.nrs9_1)
            val nrs9_0 = findViewById<RadioButton>(R.id.nrs9_0)

            val nrs10_5 = findViewById<RadioButton>(R.id.nrs10_5)
            val nrs10_3 = findViewById<RadioButton>(R.id.nrs10_3)
            val nrs10_1 = findViewById<RadioButton>(R.id.nrs10_1)
            val nrs10_0 = findViewById<RadioButton>(R.id.nrs10_0)

            val nrs11_4 = findViewById<RadioButton>(R.id.nrs11_4)
            val nrs11_3 = findViewById<RadioButton>(R.id.nrs11_3)
            val nrs11_1 = findViewById<RadioButton>(R.id.nrs11_1)
            val nrs11_0 = findViewById<RadioButton>(R.id.nrs11_0)

            val nrs12_4 = findViewById<RadioButton>(R.id.nrs12_4)
            val nrs12_3 = findViewById<RadioButton>(R.id.nrs12_3)
            val nrs12_1 = findViewById<RadioButton>(R.id.nrs12_1)
            val nrs12_0 = findViewById<RadioButton>(R.id.nrs12_0)

            val nrs13_4 = findViewById<RadioButton>(R.id.nrs13_4)
            val nrs13_3 = findViewById<RadioButton>(R.id.nrs13_3)
            val nrs13_1 = findViewById<RadioButton>(R.id.nrs13_1)
            val nrs13_0 = findViewById<RadioButton>(R.id.nrs13_0)

            val nrs14_3 = findViewById<RadioButton>(R.id.nrs14_3)
            val nrs14_2 = findViewById<RadioButton>(R.id.nrs14_2)
            val nrs14_1 = findViewById<RadioButton>(R.id.nrs14_1)
            val nrs14_0 = findViewById<RadioButton>(R.id.nrs14_0)

            val nrs15_3 = findViewById<RadioButton>(R.id.nrs15_3)
            val nrs15_2 = findViewById<RadioButton>(R.id.nrs15_2)
            val nrs15_1 = findViewById<RadioButton>(R.id.nrs15_1)
            val nrs15_0 = findViewById<RadioButton>(R.id.nrs15_0)

            val nrs16_3 = findViewById<RadioButton>(R.id.nrs16_3)
            val nrs16_2 = findViewById<RadioButton>(R.id.nrs16_2)
            val nrs16_1 = findViewById<RadioButton>(R.id.nrs16_1)
            val nrs16_0 = findViewById<RadioButton>(R.id.nrs16_0)

            val nrs17_3 = findViewById<RadioButton>(R.id.nrs17_3)
            val nrs17_2 = findViewById<RadioButton>(R.id.nrs17_2)
            val nrs17_1 = findViewById<RadioButton>(R.id.nrs17_1)
            val nrs17_0 = findViewById<RadioButton>(R.id.nrs17_0)

            val nrs18_5 = findViewById<RadioButton>(R.id.nrs18_5)
            val nrs18_3 = findViewById<RadioButton>(R.id.nrs18_3)
            val nrs18_1 = findViewById<RadioButton>(R.id.nrs18_1)
            val nrs18_0 = findViewById<RadioButton>(R.id.nrs18_0)

            val nrs19_5 = findViewById<RadioButton>(R.id.nrs19_5)
            val nrs19_3 = findViewById<RadioButton>(R.id.nrs19_3)
            val nrs19_1 = findViewById<RadioButton>(R.id.nrs19_1)
            val nrs19_0 = findViewById<RadioButton>(R.id.nrs19_0)

            val nrs20_10 = findViewById<RadioButton>(R.id.nrs20_10)
            val nrs20_7 = findViewById<RadioButton>(R.id.nrs20_7)
            val nrs20_4 = findViewById<RadioButton>(R.id.nrs20_4)
            val nrs20_0 = findViewById<RadioButton>(R.id.nrs20_0)

            val nrs21_0 = findViewById<RadioButton>(R.id.nrs21_0)
            val nrs21_1 = findViewById<RadioButton>(R.id.nrs21_1)
            val nrs21_7 = findViewById<RadioButton>(R.id.nrs21_7)
            val nrs21_10 = findViewById<RadioButton>(R.id.nrs21_10)

            var nrs1 = 0
            var nrs2 = 0
            var nrs3 = 0
            var nrs4 = 0
            var nrs5 = 0
            var nrs6 = 0
            var nrs7 = 0
            var nrs8 = 0
            var nrs9 = 0
            var nrs10 = 0
            var nrs11 = 0
            var nrs12 = 0
            var nrs13 = 0
            var nrs14 = 0
            var nrs15 = 0
            var nrs16 = 0
            var nrs17 = 0
            var nrs18 = 0
            var nrs19 = 0
            var nrs20 = 0
            var nrs21 = 0

            if (nrs1_10.isChecked) nrs1 = 10
            if (nrs1_7.isChecked) nrs1 = 7
            if (nrs1_4.isChecked) nrs1 = 4
            if (nrs1_0.isChecked) nrs1 = 0

            if (nrs2_5.isChecked) nrs2 = 5
            if (nrs2_3.isChecked) nrs2 = 3
            if (nrs2_1.isChecked) nrs2 = 1
            if (nrs2_0.isChecked) nrs2 = 0

            if (nrs3_6.isChecked) nrs3 = 6
            if (nrs3_4.isChecked) nrs3 = 4
            if (nrs3_2.isChecked) nrs3 = 2
            if (nrs3_0.isChecked) nrs3 = 0

            if (nrs4_5.isChecked) nrs4 = 5
            if (nrs4_3.isChecked) nrs4 = 3
            if (nrs4_1.isChecked) nrs4 = 1
            if (nrs4_0.isChecked) nrs4 = 0

            if (nrs5_5.isChecked) nrs5 = 5
            if (nrs5_3.isChecked) nrs5 = 3
            if (nrs5_1.isChecked) nrs5 = 1
            if (nrs5_0.isChecked) nrs5 = 0

            if (nrs6_5.isChecked) nrs6 = 5
            if (nrs6_3.isChecked) nrs6 = 3
            if (nrs6_1.isChecked) nrs6 = 1
            if (nrs6_0.isChecked) nrs6 = 0

            if (nrs7_5.isChecked) nrs7 = 5
            if (nrs7_3.isChecked) nrs7 = 3
            if (nrs7_1.isChecked) nrs7 = 1
            if (nrs7_0.isChecked) nrs7 = 0

            if (nrs8_5.isChecked) nrs8 = 5
            if (nrs8_3.isChecked) nrs8 = 3
            if (nrs8_1.isChecked) nrs8 = 1
            if (nrs8_0.isChecked) nrs8 = 0

            if (nrs9_5.isChecked) nrs9 = 5
            if (nrs9_3.isChecked) nrs9 = 3
            if (nrs9_1.isChecked) nrs9 = 1
            if (nrs9_0.isChecked) nrs9 = 0

            if (nrs10_5.isChecked) nrs10 = 5
            if (nrs10_3.isChecked) nrs10 = 3
            if (nrs10_1.isChecked) nrs10 = 1
            if (nrs10_0.isChecked) nrs10 = 0

            if (nrs11_4.isChecked) nrs11 = 4
            if (nrs11_3.isChecked) nrs11 = 3
            if (nrs11_1.isChecked) nrs11 = 1
            if (nrs11_0.isChecked) nrs11 = 0

            if (nrs12_4.isChecked) nrs12 = 4
            if (nrs12_3.isChecked) nrs12 = 3
            if (nrs12_1.isChecked) nrs12 = 1
            if (nrs12_0.isChecked) nrs12 = 0

            if (nrs13_4.isChecked) nrs13 = 4
            if (nrs13_3.isChecked) nrs13 = 3
            if (nrs13_1.isChecked) nrs13 = 1
            if (nrs13_0.isChecked) nrs13 = 0

            if (nrs14_3.isChecked) nrs14 = 3
            if (nrs14_2.isChecked) nrs14 = 2
            if (nrs14_1.isChecked) nrs14 = 1
            if (nrs14_0.isChecked) nrs14 = 0

            if (nrs15_3.isChecked) nrs15 = 3
            if (nrs15_2.isChecked) nrs15 = 2
            if (nrs15_1.isChecked) nrs15 = 1
            if (nrs15_0.isChecked) nrs15 = 0

            if (nrs16_3.isChecked) nrs16 = 3
            if (nrs16_2.isChecked) nrs16 = 2
            if (nrs16_1.isChecked) nrs16 = 1
            if (nrs16_0.isChecked) nrs16 = 0

            if (nrs17_3.isChecked) nrs17 = 3
            if (nrs17_2.isChecked) nrs17 = 2
            if (nrs17_1.isChecked) nrs17 = 1
            if (nrs17_0.isChecked) nrs17 = 0

            if (nrs18_5.isChecked) nrs18 = 5
            if (nrs18_3.isChecked) nrs18 = 3
            if (nrs18_1.isChecked) nrs18 = 1
            if (nrs18_0.isChecked) nrs18 = 0

            if (nrs19_5.isChecked) nrs19 = 5
            if (nrs19_3.isChecked) nrs19 = 3
            if (nrs19_1.isChecked) nrs19 = 1
            if (nrs19_0.isChecked) nrs19 = 0

            if (nrs20_10.isChecked) nrs20 = 10
            if (nrs20_7.isChecked) nrs20 = 7
            if (nrs20_4.isChecked) nrs20 = 4
            if (nrs20_0.isChecked) nrs20 = 0

            if (nrs21_0.isChecked) nrs21 = 0
            if (nrs21_1.isChecked) nrs21 = -1
            if (nrs21_7.isChecked) nrs21 = -7
            if (nrs21_10.isChecked) nrs21 = -10



            if (!nrs1_10.isChecked&&!nrs1_7.isChecked&&!nrs1_4.isChecked&&!nrs1_0.isChecked&&!nrs2_5.isChecked&&!nrs2_3.isChecked&&!nrs2_1.isChecked&&!nrs2_0.isChecked){
                interpretation.visibility = TextView.VISIBLE
                interpretation.text = "Необходимо отметить каждый пункт"
            }
            if (!nrs3_6.isChecked&&!nrs3_4.isChecked&&!nrs3_2.isChecked&&!nrs3_0.isChecked&&!nrs4_5.isChecked&&!nrs4_3.isChecked&&!nrs4_1.isChecked&&!nrs4_0.isChecked){
                interpretation.visibility = TextView.VISIBLE
                interpretation.text = "Необходимо отметить каждый пункт"
            }
            if (!nrs5_5.isChecked&&!nrs5_3.isChecked&&!nrs5_1.isChecked&&!nrs5_0.isChecked&&!nrs6_5.isChecked&&!nrs6_3.isChecked&&!nrs6_1.isChecked&&!nrs6_0.isChecked){
                interpretation.visibility = TextView.VISIBLE
                interpretation.text = "Необходимо отметить каждый пункт"
            }
            if (!nrs7_5.isChecked&&!nrs7_3.isChecked&&!nrs7_1.isChecked&&!nrs7_0.isChecked&&!nrs8_5.isChecked&&!nrs8_3.isChecked&&!nrs8_1.isChecked&&!nrs8_0.isChecked){
                interpretation.visibility = TextView.VISIBLE
                interpretation.text = "Необходимо отметить каждый пункт"
            }
            if (!nrs9_5.isChecked&&!nrs9_3.isChecked&&!nrs9_1.isChecked&&!nrs9_0.isChecked&&!nrs10_5.isChecked&&!nrs10_3.isChecked&&!nrs10_1.isChecked&&!nrs10_0.isChecked){
                interpretation.visibility = TextView.VISIBLE
                interpretation.text = "Необходимо отметить каждый пункт"
            }
            if (!nrs11_4.isChecked&&!nrs11_3.isChecked&&!nrs11_1.isChecked&&!nrs11_0.isChecked&&!nrs12_4.isChecked&&!nrs12_3.isChecked&&!nrs12_1.isChecked&&!nrs12_0.isChecked){
                interpretation.visibility = TextView.VISIBLE
                interpretation.text = "Необходимо отметить каждый пункт"
            }
            if (!nrs13_4.isChecked&&!nrs13_3.isChecked&&!nrs13_1.isChecked&&!nrs13_0.isChecked&&!nrs14_3.isChecked&&!nrs14_3.isChecked&&!nrs14_1.isChecked&&!nrs14_0.isChecked){
                interpretation.visibility = TextView.VISIBLE
                interpretation.text = "Необходимо отметить каждый пункт"
            }
            if (!nrs15_3.isChecked&&!nrs15_2.isChecked&&!nrs15_1.isChecked&&!nrs15_0.isChecked&&!nrs16_3.isChecked&&!nrs16_2.isChecked&&!nrs16_1.isChecked&&!nrs16_0.isChecked){
                interpretation.visibility = TextView.VISIBLE
                interpretation.text = "Необходимо отметить каждый пункт"
            }
            if (!nrs17_3.isChecked&&!nrs17_2.isChecked&&!nrs17_1.isChecked&&!nrs17_0.isChecked&&!nrs18_5.isChecked&&!nrs18_3.isChecked&&!nrs18_1.isChecked&&!nrs18_0.isChecked){
                interpretation.visibility = TextView.VISIBLE
                interpretation.text = "Необходимо отметить каждый пункт"
            }
            if (!nrs19_5.isChecked&&!nrs19_3.isChecked&&!nrs19_1.isChecked&&!nrs19_0.isChecked&&!nrs20_10.isChecked&&!nrs20_7.isChecked&&!nrs20_4.isChecked&&!nrs20_0.isChecked){
                interpretation.visibility = TextView.VISIBLE
                interpretation.text = "Необходимо отметить каждый пункт"
            }
            if (!nrs21_0.isChecked&&!nrs21_1.isChecked&&!nrs21_7.isChecked&&!nrs21_10.isChecked){
                interpretation.visibility = TextView.VISIBLE
                interpretation.text = "Необходимо отметить каждый пункт"
            }

            val nrsTotal = nrs1 + nrs2+ nrs3+ nrs4+ nrs5+ nrs6+ nrs7+ nrs8+ nrs9+ nrs10+ nrs11+ nrs12+ nrs13+ nrs14+ nrs15+ nrs16+ nrs17+ nrs18+ nrs19+ nrs20 + nrs21

            when(nrsTotal){
                in 0..39 -> {
                    interpretation.visibility = TextView.VISIBLE
                    interpretation.text = "Набрано $nrsTotal баллов. Тяжелые неврологические нарушения"
                }
                in 40..69 -> {
                    interpretation.visibility = TextView.VISIBLE
                    interpretation.text = "Набрано $nrsTotal баллов. Неврологические нарушения средней степени тяжести"
                }
                in 70..99 -> {
                    interpretation.visibility = TextView.VISIBLE
                    interpretation.text = "Набрано $nrsTotal баллов. Неврологические нарушения легкой степени тяжести"
                }
                100 -> {
                    interpretation.visibility = TextView.VISIBLE
                    interpretation.text = "Набрано $nrsTotal баллов. Отсутствуют изменения в неврологическом статусе"
                }
            }






        }

    }
}