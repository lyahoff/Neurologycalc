package com.example.neurologycalc

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RadioButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Renkin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_renkin)

        val back = findViewById<Button>(R.id.backFromRenkinBtn)
        back.setOnClickListener(){
            val intent = Intent(this@Renkin, Insult::class.java)
            startActivity(intent)
        }

        val result = findViewById<Button>(R.id.renkinResultBtn)
        result.setOnClickListener(){
            val renkin0 = findViewById<RadioButton>(R.id.reRenkin0)
            val renkin1 = findViewById<RadioButton>(R.id.reRenkin1)
            val renkin2 = findViewById<RadioButton>(R.id.reRenkin2)
            val renkin3 = findViewById<RadioButton>(R.id.reRenkin3)
            val renkin4 = findViewById<RadioButton>(R.id.reRenkin4)
            val renkin5 = findViewById<RadioButton>(R.id.reRenkin5)

            val interpretation = findViewById<TextView>(R.id.renkinInterpr)

            if (renkin0.isChecked) {
                interpretation.visibility = TextView.VISIBLE
                interpretation.text = "Результат: 0\nНет симптомов"
            }
            if (renkin1.isChecked) {
                interpretation.visibility = TextView.VISIBLE
                interpretation.text = "Результат: 1\n" +
                        "Первая степень предполагает отсутствие признаков инвалидности, больной в состоянии выполнять без посторонней помощи все действия по уходу за собой. Однако это не исключает у больного наличия мышечной слабости, расстройств чувствительности, нарушений речи или других неврологических функций. Эти нарушения выражены в незначительной степени и не ведут к ограничению активности."
            }
            if (renkin2.isChecked) {
                interpretation.visibility = TextView.VISIBLE
                interpretation.text = "Результат: 2\n" +
                        "Вторая степень инвалидизации по Рэнкину предполагает наличие легких признаков инвалидности, но больной в состоянии ухаживать за собой без посторонней помощи. Например, не может вернуться к прежней работе, но способен обслуживать себя без постороннего присмотра."
            }
            if (renkin3.isChecked) {
                interpretation.visibility = TextView.VISIBLE
                interpretation.text = "Результат: 3\n" +
                        "Третья степень умеренно выраженные признаки инвалидности, больной нуждается в некоторой посторонней помощи при одевании, гигиеническом уходе за собой; больной не в состоянии внятно читать или свободно общаться с окружающими. Больной может пользоваться ортопедическими приспособлениями или тростью."
            }
            if (renkin4.isChecked) {
                interpretation.visibility = TextView.VISIBLE
                interpretation.text = "Результат: 4\n" +
                        "Четвертая степень предполагает наличие выраженных признаков инвалидности. Больной не в состоянии ходить и ухаживать за собой без посторонней помощи, он нуждается в круглосуточном присмотре и в ежедневной посторонней помощи. При этом он в состоянии самостоятельно или при минимальной помощи со стороны выполнять какую-то часть мероприятий по уходу за собой."
            }
            if (renkin5.isChecked) {
                interpretation.visibility = TextView.VISIBLE
                interpretation.text = "Результат: 5\n" +
                        "Пятая степень сильно выраженные признаки инвалидности. Больной прикован к постели, неопрятен и нуждается в постоянном уходе и наблюдении."
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