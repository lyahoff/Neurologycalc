package com.example.neurologycalc


import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Consciousness : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_consciousness)

        val consciousnessButton = findViewById<Button>(R.id.backFromConsciousnessButton)
        consciousnessButton.setOnClickListener(){
            val intent = Intent(this@Consciousness,MainActivity::class.java)
            finish()
            startActivity(intent)
        }

        val glazgoButton = findViewById<Button>(R.id.glazgoButton)
        glazgoButton.setOnClickListener(){
            val intent = Intent(this@Consciousness,GlazgoScreen::class.java)
            startActivity(intent)
        }

        val glazgoChildrenButton = findViewById<Button>(R.id.glazgoChildrenButton)
        glazgoChildrenButton.setOnClickListener(){
            val intent = Intent(this@Consciousness,GlazgoChildren::class.java)
            startActivity(intent)
        }

        val fourButton = findViewById<Button>(R.id.fourButton)
        fourButton.setOnClickListener(){
            val intent = Intent(this@Consciousness, FOUR::class.java)
            startActivity(intent)
        }

        val richmondButton = findViewById<Button>(R.id.richmondButton)
        richmondButton.setOnClickListener(){
            val intent = Intent(this@Consciousness, Richmond::class.java)
            startActivity(intent)
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