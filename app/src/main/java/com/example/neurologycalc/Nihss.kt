package com.example.neurologycalc

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RadioButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Nihss : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nihss)

        val back = findViewById<Button>(R.id.backFromNihss)
        back.setOnClickListener(){
            val intent = Intent(this@Nihss,Insult::class.java)
            startActivity(intent)
        }

        val rb1_1a0 = findViewById<RadioButton>(R.id.rb1_1a0)
        val rb1_1a1 = findViewById<RadioButton>(R.id.rb1_1a1)
        val rb1_1a2 = findViewById<RadioButton>(R.id.rb1_1a2)
        val rb1_1a3 = findViewById<RadioButton>(R.id.rb1_1a3)

        val rb1_1b0 = findViewById<RadioButton>(R.id.rb1_1b0)
        val rb1_1b1 = findViewById<RadioButton>(R.id.rb1_1b1)
        val rb1_1b2 = findViewById<RadioButton>(R.id.rb1_1b2)

        val rb1_1v0 = findViewById<RadioButton>(R.id.rb1_1v0)
        val rb1_1v1 = findViewById<RadioButton>(R.id.rb1_1v1)
        val rb1_1v2 = findViewById<RadioButton>(R.id.rb1_1v2)

        val rbEye0 = findViewById<RadioButton>(R.id.rbEye0)
        val rbEye1 = findViewById<RadioButton>(R.id.rbEye1)
        val rbEye2 = findViewById<RadioButton>(R.id.rbEye2)

        val rbVision0 = findViewById<RadioButton>(R.id.rbVision0)
        val rbVision1 = findViewById<RadioButton>(R.id.rbVision1)
        val rbVision2 = findViewById<RadioButton>(R.id.rbVision2)
        val rbVision3 = findViewById<RadioButton>(R.id.rbVision3)

        val rbFace0 = findViewById<RadioButton>(R.id.rbFace0)
        val rbFace1 = findViewById<RadioButton>(R.id.rbFace1)
        val rbFace2 = findViewById<RadioButton>(R.id.rbFace2)
        val rbFace3 = findViewById<RadioButton>(R.id.rbFace3)

        val rbLA0 = findViewById<RadioButton>(R.id.rbLA0)
        val rbLA1 = findViewById<RadioButton>(R.id.rbLA1)
        val rbLA2 = findViewById<RadioButton>(R.id.rbLA2)
        val rbLA3 = findViewById<RadioButton>(R.id.rbLA3)
        val rbLA4 = findViewById<RadioButton>(R.id.rbLA4)

        val rbRA0 = findViewById<RadioButton>(R.id.rbRA0)
        val rbRA1 = findViewById<RadioButton>(R.id.rbRA1)
        val rbRA2 = findViewById<RadioButton>(R.id.rbRA2)
        val rbRA3 = findViewById<RadioButton>(R.id.rbRA3)
        val rbRA4 = findViewById<RadioButton>(R.id.rbRA4)

        val rbLL0 = findViewById<RadioButton>(R.id.rbLL0)
        val rbLL1 = findViewById<RadioButton>(R.id.rbLL1)
        val rbLL2 = findViewById<RadioButton>(R.id.rbLL2)
        val rbLL3 = findViewById<RadioButton>(R.id.rbLL3)
        val rbLL4 = findViewById<RadioButton>(R.id.rbLL4)

        val rbRL0 = findViewById<RadioButton>(R.id.rbRL0)
        val rbRL1 = findViewById<RadioButton>(R.id.rbRL1)
        val rbRL2 = findViewById<RadioButton>(R.id.rbRL2)
        val rbRL3 = findViewById<RadioButton>(R.id.rbRL3)
        val rbRL4 = findViewById<RadioButton>(R.id.rbRL4)

        val rbAtaxya0 = findViewById<RadioButton>(R.id.rbAtaxya0)
        val rbAtaxya1 = findViewById<RadioButton>(R.id.rbAtaxya1)
        val rbAtaxya2 = findViewById<RadioButton>(R.id.rbAtaxya2)

        val rbSens0 = findViewById<RadioButton>(R.id.rbSens0)
        val rbSens1 = findViewById<RadioButton>(R.id.rbSens1)
        val rbSens2 = findViewById<RadioButton>(R.id.rbSens2)

        val rbSpeak0 = findViewById<RadioButton>(R.id.rbSpeak0)
        val rbSpeak1 = findViewById<RadioButton>(R.id.rbSpeak1)
        val rbSpeak2 = findViewById<RadioButton>(R.id.rbSpeak2)
        val rbSpeak3 = findViewById<RadioButton>(R.id.rbSpeak3)

        val rbDis0 = findViewById<RadioButton>(R.id.rbDis0)
        val rbDis1 = findViewById<RadioButton>(R.id.rbDis1)
        val rbDis2 = findViewById<RadioButton>(R.id.rbDis2)

        val rbNegl0 = findViewById<RadioButton>(R.id.rbNegl0)
        val rbNegl1 = findViewById<RadioButton>(R.id.rbNegl1)
        val rbNegl2 = findViewById<RadioButton>(R.id.rbNegl2)

        val interpretation = findViewById<TextView>(R.id.nihssInterpretation)

        val nihssResult = findViewById<Button>(R.id.nihssResult)

        nihssResult.setOnClickListener(){

            var nihss1a = 0
            var nihss1b = 0
            var nihss1v = 0
            var nihss2 = 0
            var nihss3 = 0
            var nihss4 = 0
            var nihss5a = 0
            var nihss5b = 0
            var nihss6a = 0
            var nihss6b = 0
            var nihss7 = 0
            var nihss8 = 0
            var nihss9 = 0
            var nihss10 = 0
            var nihss11 = 0

            var total = 0

            if (rb1_1a0.isChecked) nihss1a = 0
            if (rb1_1a1.isChecked) nihss1a = 1
            if (rb1_1a2.isChecked) nihss1a = 2
            if (rb1_1a3.isChecked) nihss1a = 3

            if (rb1_1b0.isChecked) nihss1b = 0
            if (rb1_1b1.isChecked) nihss1b = 1
            if (rb1_1b2.isChecked) nihss1b = 2

            if (rb1_1v0.isChecked) nihss1v = 0
            if (rb1_1v1.isChecked) nihss1v = 1
            if (rb1_1v2.isChecked) nihss1v = 2

            if (rbEye0.isChecked) nihss2 = 0
            if (rbEye1.isChecked) nihss2 = 1
            if (rbEye2.isChecked) nihss2 = 2

            if (rbVision0.isChecked) nihss3 = 0
            if (rbVision1.isChecked) nihss3 = 1
            if (rbVision2.isChecked) nihss3 = 2
            if (rbVision3.isChecked) nihss3 = 3

            if (rbFace0.isChecked) nihss4 = 0
            if (rbFace1.isChecked) nihss4 = 1
            if (rbFace2.isChecked) nihss4 = 2
            if (rbFace3.isChecked) nihss4 = 3

            if (rbLA0.isChecked) nihss5a = 0
            if (rbLA1.isChecked) nihss5a = 1
            if (rbLA2.isChecked) nihss5a = 2
            if (rbLA3.isChecked) nihss5a = 3
            if (rbLA4.isChecked) nihss5a = 4

            if (rbRA0.isChecked) nihss5b = 0
            if (rbRA1.isChecked) nihss5b = 1
            if (rbRA2.isChecked) nihss5b = 2
            if (rbRA3.isChecked) nihss5b = 3
            if (rbRA4.isChecked) nihss5b = 4

            if (rbLL0.isChecked) nihss6a = 0
            if (rbLL1.isChecked) nihss6a = 1
            if (rbLL2.isChecked) nihss6a = 2
            if (rbLL3.isChecked) nihss6a = 3
            if (rbLL4.isChecked) nihss6a = 4

            if (rbRL0.isChecked) nihss6b = 0
            if (rbRL1.isChecked) nihss6b = 1
            if (rbRL2.isChecked) nihss6b = 2
            if (rbRL3.isChecked) nihss6b = 3
            if (rbRL4.isChecked) nihss6b = 4

            if (rbAtaxya0.isChecked) nihss7 = 0
            if (rbAtaxya1.isChecked) nihss7 = 1
            if (rbAtaxya2.isChecked) nihss7 = 2

            if (rbSens0.isChecked) nihss8 = 0
            if (rbSens1.isChecked) nihss8 = 1
            if (rbSens2.isChecked) nihss8 = 2

            if (rbSpeak0.isChecked) nihss9 = 0
            if (rbSpeak1.isChecked) nihss9 = 1
            if (rbSpeak2.isChecked) nihss9 = 2
            if (rbSpeak3.isChecked) nihss9 = 3

            if (rbDis0.isChecked) nihss10 = 0
            if (rbDis1.isChecked) nihss10 = 1
            if (rbDis2.isChecked) nihss10 = 2

            if (rbNegl0.isChecked) nihss11 = 0
            if (rbNegl1.isChecked) nihss11 = 1
            if (rbNegl2.isChecked) nihss11 = 2

            total = nihss1a+nihss1b+nihss1v+nihss2+nihss3+nihss4+nihss5a+nihss5b+nihss6a+nihss6b+nihss7+nihss8+nihss9+nihss10+nihss11

            when (total){
                in 0..2 -> {
                    interpretation.visibility = TextView.VISIBLE
                    interpretation.text = "Состояние удовлетворительное"
                }
                in 3..8 -> {
                    interpretation.visibility = TextView.VISIBLE
                    interpretation.text = "Неврологические нарушения легкой степени"
                }
                in 9..12 -> {
                    interpretation.visibility = TextView.VISIBLE
                    interpretation.text = "Неврологические нарушения средней степени"
                }
                in 13..15 -> {
                    interpretation.visibility = TextView.VISIBLE
                    interpretation.text = "Тяжелые неврологические нарушения"
                }
                in 16..33 -> {
                    interpretation.visibility = TextView.VISIBLE
                    interpretation.text = "Неврологические нарушения крайней степени тяжести"
                }
                in 34..35 -> {
                    interpretation.visibility = TextView.VISIBLE
                    interpretation.text = "Кома"
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