package com.example.neurologycalc

import android.app.Activity
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EdgeEffect
import android.widget.EditText
import android.widget.TextView
import com.google.android.gms.ads.AdError
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.FullScreenContentCallback
import com.google.android.gms.ads.LoadAdError
import com.google.android.gms.ads.interstitial.InterstitialAd
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback
import java.text.DecimalFormat

class Algover : Activity() {
    private var mInterstitialAd: InterstitialAd? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_algover)
        loadInterAd()

        val back = findViewById<Button>(R.id.backFromAlgover)
        back.setOnClickListener(){
            showInterAd()

        }

        val result = findViewById<Button>(R.id.algoverResultBtn)
        result.setOnClickListener(){
            val heartET = findViewById<EditText>(R.id.algoverHeart)
            val pressureET = findViewById<EditText>(R.id.algoverPressure)
            val interpretation = findViewById<TextView>(R.id.algoverInterpretation)
            var total : Double
            var heartTotal : Double
            var pressureTotal : Double

            var heartText = heartET.text.toString()
            var pressureText = pressureET.text.toString()

            if (heartText.isEmpty()){
                heartTotal = 0.0
            }
            else{
                heartTotal = heartText.toString().toDouble()
            }
            if (pressureText.isEmpty()){
                pressureTotal = 0.0
            }
            else{
                pressureTotal = pressureText.toString().toDouble()
            }
            if (pressureTotal == 0.0) pressureET.hint = "Значение должно быть выше 0"

            total = heartTotal / pressureTotal

            val df = DecimalFormat("#.##")

            when(total){
                in  0.1..0.79 -> {
                    interpretation.visibility = TextView.VISIBLE
                    interpretation.text = "Индекс Альговера составляет ${df.format(total)} \n\nНет шока"
                }
                in  0.8..0.9 -> {
                    interpretation.visibility = TextView.VISIBLE
                    interpretation.text = "Индекс Альговера составляет ${df.format(total)} \n" +
                            "\nШок I степени. Кровопотеря 15 - 20% ОЦК"
                }
                in  0.91..1.2 -> {
                    interpretation.visibility = TextView.VISIBLE
                    interpretation.text = "Индекс Альговера составляет ${df.format(total)} \n" +
                            "\nШок II степени. Кровопотеря 20 - 40% ОЦК"
                }
                in  1.21..2.0 -> {
                    interpretation.visibility = TextView.VISIBLE
                    interpretation.text = "Индекс Альговера составляет ${df.format(total)} \n" +
                            "\nШок III степени. Кровопотеря более 40% ОЦК"
                }
                in  2.1..100.0 -> {
                    interpretation.visibility = TextView.VISIBLE
                    interpretation.text = "Индекс Альговера составляет ${df.format(total)} \n" +
                            "\nТерминальная стадия шока"
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

    private fun showInterAd() {
        if (mInterstitialAd != null ){

            mInterstitialAd?.fullScreenContentCallback = object : FullScreenContentCallback(){
                override fun onAdClicked() {
                    super.onAdClicked()
                }

                override fun onAdDismissedFullScreenContent() {
                    super.onAdDismissedFullScreenContent()
                    val intent = Intent(this@Algover, MainActivity::class.java)
                    finish()
                    startActivity(intent)
                }

                override fun onAdFailedToShowFullScreenContent(p0: AdError) {
                    super.onAdFailedToShowFullScreenContent(p0)
                }

                override fun onAdImpression() {
                    super.onAdImpression()
                }

                override fun onAdShowedFullScreenContent() {
                    super.onAdShowedFullScreenContent()
                }

            }

            mInterstitialAd?.show(this)

        }else{
            val intent = Intent(this@Algover, MainActivity::class.java)
            finish()
            startActivity(intent)
        }
    }

    private fun loadInterAd() {
        val inter : String = getString(R.string.inter)

        var adRequest = AdRequest.Builder().build()

        InterstitialAd.load(this,inter, adRequest, object : InterstitialAdLoadCallback() {
            override fun onAdFailedToLoad(adError: LoadAdError) {
                mInterstitialAd = null
            }

            override fun onAdLoaded(interstitialAd: InterstitialAd) {
                mInterstitialAd = interstitialAd
            }
        })
    }
}