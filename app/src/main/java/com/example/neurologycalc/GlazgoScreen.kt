package com.example.neurologycalc


import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RadioButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class GlazgoScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_glazgo_screen)

        var backFromGlazgo = findViewById<Button>(R.id.backFromGlazgo)
        backFromGlazgo.setOnClickListener(){
            val intent = Intent(this@GlazgoScreen,Consciousness::class.java)
            finish()
            startActivity(intent)
        }

        val eye4 = findViewById<RadioButton>(R.id.eye4)
        val eye3 = findViewById<RadioButton>(R.id.eye3)
        val eye2 = findViewById<RadioButton>(R.id.eye2)
        val eye1 = findViewById<RadioButton>(R.id.eye1)

        val motor6 = findViewById<RadioButton>(R.id.motor6)
        val motor5 = findViewById<RadioButton>(R.id.motor5)
        val motor4 = findViewById<RadioButton>(R.id.motor4)
        val motor3 = findViewById<RadioButton>(R.id.motor3)
        val motor2 = findViewById<RadioButton>(R.id.motor2)
        val motor1 = findViewById<RadioButton>(R.id.motor1)

        val verbal5 = findViewById<RadioButton>(R.id.verbal5)
        val verbal4 = findViewById<RadioButton>(R.id.verbal4)
        val verbal3 = findViewById<RadioButton>(R.id.verbal3)
        val verbal3_1 = findViewById<RadioButton>(R.id.verbal3_1)
        val verbal2 = findViewById<RadioButton>(R.id.verbal2)
        val verbal1 = findViewById<RadioButton>(R.id.verbal1)

        var totalEye = 0
        var totalMotor = 0
        var totalVerbal = 0
        var total = 0

        var amountBtn = findViewById<Button>(R.id.amountBtn)
        amountBtn.setOnClickListener(){
            if (eye4.isChecked){
                totalEye = 4
            }
            if (eye3.isChecked){
                totalEye = 3
            }
            if (eye2.isChecked){
                totalEye = 2
            }
            if (eye1.isChecked){
                totalEye = 1
            }

            if (motor6.isChecked){
                totalMotor = 6
            }
            if (motor5.isChecked){
                totalMotor = 5
            }
            if (motor4.isChecked){
                totalMotor = 4
            }
            if (motor3.isChecked){
                totalMotor = 3
            }
            if (motor2.isChecked){
                totalMotor = 2
            }
            if (motor1.isChecked){
                totalMotor = 1
            }

            if (verbal5.isChecked){
                totalVerbal = 5
            }
            if (verbal4.isChecked){
                totalVerbal = 4
            }
            if (verbal3.isChecked){
                totalVerbal = 3
            }
            if (verbal3_1.isChecked){
                totalVerbal = 3
            }
            if (verbal2.isChecked){
                totalVerbal = 2
            }
            if (verbal1.isChecked){
                totalVerbal = 1
            }

            total = totalEye + totalMotor + totalVerbal
            var interpretationTxt = findViewById<TextView>(R.id.interpretationTxt)
            var amountTxt = findViewById<TextView>(R.id.amountTxt)
            amountTxt.text = ""
            interpretationTxt.text = ""
            amountTxt.text = "Сумма баллов составляет $total"

            when(total){
               in 3..4 -> {
                   interpretationTxt.visibility = TextView.VISIBLE
                   interpretationTxt.text = "Кома 3"
               }
                in 5..6 -> {
                    interpretationTxt.visibility = TextView.VISIBLE
                    interpretationTxt.text = "Кома 2"
                }
                in 7..8 -> {
                    interpretationTxt.visibility = TextView.VISIBLE
                    interpretationTxt.text = "Кома 1"
                }
                in 9..10 -> {
                    interpretationTxt.visibility = TextView.VISIBLE
                    interpretationTxt.text = "Сопор"
                }
                in 11..14 -> {
                    interpretationTxt.visibility = TextView.VISIBLE
                    interpretationTxt.text = "Умеренное и глубокое оглушение"
                }
                15 -> {
                    interpretationTxt.visibility = TextView.VISIBLE
                    interpretationTxt.text = "Сознание ясное"
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