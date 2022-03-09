package com.example.neurologycalc

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Cha2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cha2)

        val back = findViewById<Button>(R.id.backFromCha2)
        back.setOnClickListener(){
            val intent = Intent(this@Cha2,Insult::class.java)
            finish()
            startActivity(intent)
        }

        val heart = findViewById<CheckBox>(R.id.heart)
        val arter = findViewById<CheckBox>(R.id.arter)
        val diab = findViewById<CheckBox>(R.id.diab)
        val insChB = findViewById<CheckBox>(R.id.insultChB)
        val infarkt = findViewById<CheckBox>(R.id.infarkt)

        val rb65 = findViewById<RadioButton>(R.id.rb65)
        val rb75 = findViewById<RadioButton>(R.id.rb75)

        val rbMale = findViewById<RadioButton>(R.id.rbMale)
        val rbFemale = findViewById<RadioButton>(R.id.rbFemale)
        var total = 0
        var check = 0
        var age = 0
        var sex = 0

        val result = findViewById<Button>(R.id.cha2ResultBtn)
        val cha2int = findViewById<TextView>(R.id.cha2Inter)
        result.setOnClickListener(){


            if (heart.isChecked) check += 1

            if (arter.isChecked) check += 1

            if (diab.isChecked) check += 1

            if (insChB.isChecked) check += 2

            if (infarkt.isChecked) check += 1


            if (rb65.isChecked) age = 1
            if (rb75.isChecked) age = 2

            if (rbMale.isChecked) sex = 0
            if (rbFemale.isChecked) sex = 1

            total = check+age+sex

            when(total){

                1 ->{cha2int.visibility = TextView.VISIBLE
                    cha2int.text = "Результат $total \n\nРиск развития инсульта в течение года: 1,3%"
                    check = 0
                }
                2 ->{cha2int.visibility = TextView.VISIBLE
                    cha2int.text = "Результат $total \n\nРиск развития инсульта в течение года: 2,2%"
                    check = 0
                }
                3 ->{cha2int.visibility = TextView.VISIBLE
                    cha2int.text = "Результат $total \n\nРиск развития инсульта в течение года: 3,2%"
                    check = 0
                }
                4 ->{cha2int.visibility = TextView.VISIBLE
                    cha2int.text = "Результат $total \n\nРиск развития инсульта в течение года: 4,0%"
                    check = 0
                }
                5 ->{cha2int.visibility = TextView.VISIBLE
                    cha2int.text = "Результат $total \n\nРиск развития инсульта в течение года: 6,7%"
                    check = 0
                }
                6 ->{cha2int.visibility = TextView.VISIBLE
                    cha2int.text = "Результат $total \n\nРиск развития инсульта в течение года: 9,8%"
                    check = 0
                }
                7 ->{cha2int.visibility = TextView.VISIBLE
                    cha2int.text = "Результат $total \n\nРиск развития инсульта в течение года: 9,6%"
                    check = 0
                }
                8 ->{cha2int.visibility = TextView.VISIBLE
                    cha2int.text = "Результат $total \n\nРиск развития инсульта в течение года: 6,7%"
                    check = 0
                }
                9 ->{cha2int.visibility = TextView.VISIBLE
                    cha2int.text = "Результат $total \n\nРиск развития инсульта в течение года: 15,2%"
                    check = 0
                }
                0 ->{cha2int.visibility = TextView.VISIBLE
                    cha2int.text = "Результат $total \n\nРиск развития инсульта в течение года: 0,0%"
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