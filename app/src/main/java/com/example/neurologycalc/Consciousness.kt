package com.example.neurologycalc


import android.content.Intent
import android.os.Bundle
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


    }
}