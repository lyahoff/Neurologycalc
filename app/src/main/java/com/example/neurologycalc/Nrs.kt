package com.example.neurologycalc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton

class Nrs : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nrs)

        val back = findViewById<Button>(R.id.backFromNrs)
        back.setOnClickListener(){
            val intent = Intent(this@Nrs,MainActivity::class.java)
            startActivity(intent)
        }

        val result = findViewById<Button>(R.id.nrsResult)
        result.setOnClickListener(){
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

            var nrsTotal = nrs1 + nrs2+ nrs3+ nrs4+ nrs5+ nrs6+ nrs7+ nrs8+ nrs9+ nrs10+ nrs11+ nrs12+ nrs13+ nrs14+ nrs15+ nrs16+ nrs17+ nrs18+ nrs19+ nrs20 + nrs21









        }

    }
}