package com.example.neurologycalc

import android.app.Activity
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView
import java.lang.Math.pow
import kotlin.math.pow
import java.text.DecimalFormat

class SKF : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skf)

        val back = findViewById<Button>(R.id.backFromSkf)
        back.setOnClickListener() {
            val intent = Intent(this@SKF, MainActivity::class.java)
            finish()
            startActivity(intent)
        }

        val crt = findViewById<EditText>(R.id.etCrt)
        val age = findViewById<EditText>(R.id.SkfAge)

        val male = findViewById<RadioButton>(R.id.btnMale)
        val female = findViewById<RadioButton>(R.id.btnFemale)

        val interpretation = findViewById<TextView>(R.id.skfInterpretation)

        val result = findViewById<Button>(R.id.skfResult)
        result.setOnClickListener() {

            var crtText = crt.text.toString()
            var ageText = age.text.toString()

            var crtResult: Double
            var ageResult: Double

            var total: Double
            var mdrd : Double

            if(crtText.isEmpty()){
                crtResult = 0.0
            }
            else{
                crtResult = crt.text.toString().toDouble()
            }

            if(ageText.isEmpty()){
                ageResult = 0.0
            }
            else{
                ageResult = age.text.toString().toDouble()
            }


            if (crtResult<=62 && female.isChecked){
                total = 144 * (0.993.pow(ageResult)) * pow(((crtResult/88.4)/0.7),-0.328)
                mdrd = 175 * pow(crtResult/88.4,-1.154) * pow(ageResult,-0.203) * 0.742
                val df = DecimalFormat("#")
                interpretation.visibility = TextView.VISIBLE

                when(total){
                    in 0.0..14.9 -> {
                        interpretation.text = "CKD-EPI: ${df.format(total)} мл/мин / 1,73 кв.м\n\n" +
                                "MDRD:  ${df.format(mdrd)} мл/мин / 1,73 кв.м\n\n" +
                                "Стадия ХБП: V\tТерминальная почечная недостаточность."
                    }
                    in 15.0..29.9 -> {
                        interpretation.text = "CKD-EPI: ${df.format(total)} мл/мин / 1,73 кв.м\n\n" +
                                "MDRD:  ${df.format(mdrd)} мл/мин / 1,73 кв.м\n\n" +
                                "Стадия ХБП: IV\tВыраженное снижение СКФ."
                    }
                    in 30.0..59.9 -> {
                        interpretation.text = "CKD-EPI: ${df.format(total)} мл/мин / 1,73 кв.м\n\n" +
                                "MDRD:  ${df.format(mdrd)} мл/мин / 1,73 кв.м\n\n" +
                                "Стадия ХБП: III\tУмеренное снижение СКФ."
                    }
                    in 60.0..89.9 -> {
                        interpretation.text = "CKD-EPI: ${df.format(total)} мл/мин / 1,73 кв.м\n\n" +
                                "MDRD:  ${df.format(mdrd)} мл/мин / 1,73 кв.м\n\n" +
                                "Стадия ХБП: II\tПризнаки повреждения почек с начальным снижением СКФ."
                    }
                    in 90.0..200.0 -> {
                    interpretation.text = "CKD-EPI: ${df.format(total)} мл/мин / 1,73 кв.м\n\n" +
                            "MDRD:  ${df.format(mdrd)} мл/мин / 1,73 кв.м\n\n" +
                            "Стадия ХБП: I\tПризнаки повреждения почек с нормальной или повышенной СКФ."
                }
                }

            }
            if (crtResult>62 && female.isChecked){
                total = 144 * (0.993.pow(ageResult)) * pow(((crtResult/88.4)/0.7),-1.210)
                mdrd = 175 * pow(crtResult/88.4,-1.154) * pow(ageResult,-0.203) * 0.742
                val df = DecimalFormat("#")
                interpretation.visibility = TextView.VISIBLE
                when(total){
                    in 0.0..14.9 -> {
                        interpretation.text = "CKD-EPI: ${df.format(total)} мл/мин / 1,73 кв.м\n\n" +
                                "MDRD:  ${df.format(mdrd)} мл/мин / 1,73 кв.м\n\n" +
                                "Стадия ХБП: V\tТерминальная почечная недостаточность."
                    }
                    in 15.0..29.9 -> {
                        interpretation.text = "CKD-EPI: ${df.format(total)} мл/мин / 1,73 кв.м\n\n" +
                                "MDRD:  ${df.format(mdrd)} мл/мин / 1,73 кв.м\n\n" +
                                "Стадия ХБП: IV\tВыраженное снижение СКФ."
                    }
                    in 30.0..59.9 -> {
                        interpretation.text = "CKD-EPI: ${df.format(total)} мл/мин / 1,73 кв.м\n\n" +
                                "MDRD:  ${df.format(mdrd)} мл/мин / 1,73 кв.м\n\n" +
                                "Стадия ХБП: III\tУмеренное снижение СКФ."
                    }
                    in 60.0..89.9 -> {
                        interpretation.text = "CKD-EPI: ${df.format(total)} мл/мин / 1,73 кв.м\n\n" +
                                "MDRD:  ${df.format(mdrd)} мл/мин / 1,73 кв.м\n\n" +
                                "Стадия ХБП: II\tПризнаки повреждения почек с начальным снижением СКФ."
                    }
                    in 90.0..200.0 -> {
                        interpretation.text = "CKD-EPI: ${df.format(total)} мл/мин / 1,73 кв.м\n\n" +
                                "MDRD:  ${df.format(mdrd)} мл/мин / 1,73 кв.м\n\n" +
                                "Стадия ХБП: I\tПризнаки повреждения почек с нормальной или повышенной СКФ."
                    }
                }
            }

            if (crtResult<=80 && male.isChecked){
                total = 141 * (0.993.pow(ageResult)) * pow(((crtResult/88.4)/0.9),-0.412)
                mdrd = 175 * pow(crtResult/88.4,-1.154) * pow(ageResult,-0.203)
                val df = DecimalFormat("#")
                interpretation.visibility = TextView.VISIBLE
                when(total){
                    in 0.0..14.9 -> {
                        interpretation.text = "CKD-EPI: ${df.format(total)} мл/мин / 1,73 кв.м\n\n" +
                                "MDRD:  ${df.format(mdrd)} мл/мин / 1,73 кв.м\n\n" +
                                "Стадия ХБП: V\tТерминальная почечная недостаточность."
                    }
                    in 15.0..29.9 -> {
                        interpretation.text = "CKD-EPI: ${df.format(total)} мл/мин / 1,73 кв.м\n\n" +
                                "MDRD:  ${df.format(mdrd)} мл/мин / 1,73 кв.м\n\n" +
                                "Стадия ХБП: IV\tВыраженное снижение СКФ."
                    }
                    in 30.0..59.9 -> {
                        interpretation.text = "CKD-EPI: ${df.format(total)} мл/мин / 1,73 кв.м\n\n" +
                                "MDRD:  ${df.format(mdrd)} мл/мин / 1,73 кв.м\n\n" +
                                "Стадия ХБП: III\tУмеренное снижение СКФ."
                    }
                    in 60.0..89.9 -> {
                        interpretation.text = "CKD-EPI: ${df.format(total)} мл/мин / 1,73 кв.м\n\n" +
                                "MDRD:  ${df.format(mdrd)} мл/мин / 1,73 кв.м\n\n" +
                                "Стадия ХБП: II\tПризнаки повреждения почек с начальным снижением СКФ."
                    }
                    in 90.0..200.0 -> {
                        interpretation.text = "CKD-EPI: ${df.format(total)} мл/мин / 1,73 кв.м\n\n" +
                                "MDRD:  ${df.format(mdrd)} мл/мин / 1,73 кв.м\n\n" +
                                "Стадия ХБП: I\tПризнаки повреждения почек с нормальной или повышенной СКФ."
                    }
                }
            }
            if (crtResult>80 && male.isChecked){
                total = 141 * (0.993.pow(ageResult)) * pow(((crtResult/88.4)/0.9),-1.210)
                mdrd = 175 * pow(crtResult/88.4,-1.154) * pow(ageResult,-0.203)
                val df = DecimalFormat("#")
                interpretation.visibility = TextView.VISIBLE
                when(total){
                    in 0.0..14.9 -> {
                        interpretation.text = "CKD-EPI: ${df.format(total)} мл/мин / 1,73 кв.м\n\n" +
                                "MDRD:  ${df.format(mdrd)} мл/мин / 1,73 кв.м\n\n" +
                                "Стадия ХБП: V\tТерминальная почечная недостаточность."
                    }
                    in 15.0..29.9 -> {
                        interpretation.text = "CKD-EPI: ${df.format(total)} мл/мин / 1,73 кв.м\n\n" +
                                "MDRD:  ${df.format(mdrd)} мл/мин / 1,73 кв.м\n\n" +
                                "Стадия ХБП: IV\tВыраженное снижение СКФ."
                    }
                    in 30.0..59.9 -> {
                        interpretation.text = "CKD-EPI: ${df.format(total)} мл/мин / 1,73 кв.м\n\n" +
                                "MDRD:  ${df.format(mdrd)} мл/мин / 1,73 кв.м\n\n" +
                                "Стадия ХБП: III\tУмеренное снижение СКФ."
                    }
                    in 60.0..89.9 -> {
                        interpretation.text = "CKD-EPI: ${df.format(total)} мл/мин / 1,73 кв.м\n\n" +
                                "MDRD:  ${df.format(mdrd)} мл/мин / 1,73 кв.м\n\n" +
                                "Стадия ХБП: II\tПризнаки повреждения почек с начальным снижением СКФ."
                    }
                    in 90.0..200.0 -> {
                        interpretation.text = "CKD-EPI: ${df.format(total)} мл/мин / 1,73 кв.м\n\n" +
                                "MDRD:  ${df.format(mdrd)} мл/мин / 1,73 кв.м\n\n" +
                                "Стадия ХБП: I\tПризнаки повреждения почек с нормальной или повышенной СКФ."
                    }
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



