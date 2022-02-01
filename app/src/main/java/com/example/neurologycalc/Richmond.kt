package com.example.neurologycalc

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Richmond : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_richmond)

        val backFromRichmond = findViewById<Button>(R.id.backFromRichmond)

        backFromRichmond.setOnClickListener() {
            val intent = Intent(this@Richmond, MainActivity::class.java)
            startActivity(intent)
        }

        val richmondRadioButton4 = findViewById<RadioButton>(R.id.richmond4)
        val richmondRadioButton3 = findViewById<RadioButton>(R.id.richmond3)
        val richmondRadioButton2 = findViewById<RadioButton>(R.id.richmond2)
        val richmondRadioButton1 = findViewById<RadioButton>(R.id.richmond1)
        val richmondRadioButton0 = findViewById<RadioButton>(R.id.richmond0)
        val richmondRadioButtonMinus1 = findViewById<RadioButton>(R.id.richmond_1)
        val richmondRadioButtonMinus2 = findViewById<RadioButton>(R.id.richmond_2)
        val richmondRadioButtonMinus3 = findViewById<RadioButton>(R.id.richmond_3)
        val richmondRadioButtonMinus4 = findViewById<RadioButton>(R.id.richmond_4)
        val richmondRadioButtonMinus5 = findViewById<RadioButton>(R.id.richmond_5)

        val getResult = findViewById<Button>(R.id.getRichmond)


        getResult.setOnClickListener() {
            if (richmondRadioButton4.isChecked) {
                var richmondInterpretation = findViewById<TextView>(R.id.richmondInterpretation)
                richmondInterpretation.text = "Буйное состояние"
            }
            if (richmondRadioButton3.isChecked) {
                var richmondInterpretation = findViewById<TextView>(R.id.richmondInterpretation)
                richmondInterpretation.text = "Выраженное возбуждение"
            }
            if (richmondRadioButton2.isChecked) {
                var richmondInterpretation = findViewById<TextView>(R.id.richmondInterpretation)
                richmondInterpretation.text = "Возбуждение"
            }
            if (richmondRadioButton1.isChecked) {
                var richmondInterpretation = findViewById<TextView>(R.id.richmondInterpretation)
                richmondInterpretation.text = "Беспокойство"
            }
            if (richmondRadioButton0.isChecked) {
                var richmondInterpretation = findViewById<TextView>(R.id.richmondInterpretation)
                richmondInterpretation.text = "Спокойствие"
            }
            if (richmondRadioButtonMinus1.isChecked) {
                var richmondInterpretation = findViewById<TextView>(R.id.richmondInterpretation)
                richmondInterpretation.text = "Сонливость"
            }
            if (richmondRadioButtonMinus2.isChecked) {
                var richmondInterpretation = findViewById<TextView>(R.id.richmondInterpretation)
                richmondInterpretation.text = "Легкая седация"
            }
            if (richmondRadioButtonMinus3.isChecked) {
                var richmondInterpretation = findViewById<TextView>(R.id.richmondInterpretation)
                richmondInterpretation.text = "Средняя седация"
            }
            if (richmondRadioButtonMinus4.isChecked) {
                var richmondInterpretation = findViewById<TextView>(R.id.richmondInterpretation)
                richmondInterpretation.text = "Глубокая седация"
            }
            if (richmondRadioButtonMinus5.isChecked) {
                var richmondInterpretation = findViewById<TextView>(R.id.richmondInterpretation)
                richmondInterpretation.text = "Невозможность разбудить больного"
            }


        }
    }


}