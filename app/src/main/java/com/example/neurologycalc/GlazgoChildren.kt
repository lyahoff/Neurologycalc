package com.example.neurologycalc

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RadioButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class GlazgoChildren : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_glazgo_children)

        var backFromGlazgoChildren = findViewById<Button>(R.id.backFromGlazgoChildren)
        backFromGlazgoChildren.setOnClickListener(){
            val intent = Intent(this@GlazgoChildren, Consciousness::class.java)
            finish()
            startActivity(intent)
        }

        val eyeChildren4 = findViewById<RadioButton>(R.id.eyeChildren4)
        val eyeChildren3 = findViewById<RadioButton>(R.id.eyeChildren3)
        val eyeChildren2 = findViewById<RadioButton>(R.id.eyeChildren2)
        val eyeChildren1 = findViewById<RadioButton>(R.id.eyeChildren1)

        val verbalChildren5 = findViewById<RadioButton>(R.id.verbalChildren5)
        val verbalChildren4 = findViewById<RadioButton>(R.id.verbalChildren4)
        val verbalChildren3 = findViewById<RadioButton>(R.id.verbalChildren3)
        val verbalChildren2 = findViewById<RadioButton>(R.id.verbalChildren2)
        val verbalChildren1 = findViewById<RadioButton>(R.id.verbalChildren1)

        val motorChildren6 = findViewById<RadioButton>(R.id.motorChildren6)
        val motorChildren5 = findViewById<RadioButton>(R.id.motorChildren5)
        val motorChildren4 = findViewById<RadioButton>(R.id.motorChildren4)
        val motorChildren3 = findViewById<RadioButton>(R.id.motorChildren3)
        val motorChildren2 = findViewById<RadioButton>(R.id.motorChildren2)
        val motorChildren1 = findViewById<RadioButton>(R.id.motorChildren1)

        var totalEye = 0
        var totalVerbal = 0
        var totalMotor = 0
        var total = 0

        var amountChildrenGlazgo = findViewById<TextView>(R.id.amountChildrenGlazgo)
        var interpretationChildrenGlazgo = findViewById<TextView>(R.id.interpretationChildrenGlazgo)

        var getResultGlazgoChildrenButton = findViewById<Button>(R.id.getResultGlazgoChildren)
        getResultGlazgoChildrenButton.setOnClickListener(){
            if (eyeChildren4.isChecked){
                totalEye = 4
            }
            if (eyeChildren3.isChecked){
                totalEye = 3
            }
            if (eyeChildren2.isChecked){
                totalEye = 2
            }
            if (eyeChildren1.isChecked){
                totalEye = 1
            }

            if (verbalChildren5.isChecked){
                totalVerbal = 5
            }
            if (verbalChildren4.isChecked){
                totalVerbal = 4
            }
            if (verbalChildren3.isChecked){
                totalVerbal = 3
            }
            if (verbalChildren2.isChecked){
                totalVerbal = 2
            }
            if (verbalChildren1.isChecked){
                totalVerbal = 1
            }

            if (motorChildren6.isChecked){
                totalMotor = 6
            }
            if (motorChildren5.isChecked){
                totalMotor = 5
            }
            if (motorChildren4.isChecked){
                totalMotor = 4
            }
            if (motorChildren3.isChecked){
                totalMotor = 3
            }
            if (motorChildren2.isChecked){
                totalMotor = 2
            }
            if (motorChildren1.isChecked){
                totalMotor = 1
            }

            total = totalEye + totalMotor + totalVerbal

            amountChildrenGlazgo.text = "Сумма баллов составляет $total"

            when(total){
                in 3..4 -> {
                    interpretationChildrenGlazgo.visibility = TextView.VISIBLE
                    interpretationChildrenGlazgo.text = "Кома 3"
                }
                in 5..6 -> {
                    interpretationChildrenGlazgo.visibility = TextView.VISIBLE
                    interpretationChildrenGlazgo.text = "Кома 2"
                }
                in 7..8 -> {
                    interpretationChildrenGlazgo.visibility = TextView.VISIBLE
                    interpretationChildrenGlazgo.text = "Кома 1"
                }
                in 9..10 -> {
                    interpretationChildrenGlazgo.visibility = TextView.VISIBLE
                    interpretationChildrenGlazgo.text = "Сопор"
                }
                in 11..14 -> {
                    interpretationChildrenGlazgo.visibility = TextView.VISIBLE
                    interpretationChildrenGlazgo.text = "Умеренное и глубокое оглушение"
                }
                15 -> {
                    interpretationChildrenGlazgo.visibility = TextView.VISIBLE
                    interpretationChildrenGlazgo.text = "Сознание ясное"
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