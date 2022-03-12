package com.example.neurologycalc


import android.app.Activity
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.android.gms.ads.AdError
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.FullScreenContentCallback
import com.google.android.gms.ads.LoadAdError
import com.google.android.gms.ads.interstitial.InterstitialAd
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback


class MIDAS : Activity() {
    private var mInterstitialAd: InterstitialAd? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_midas)
        loadInterAd()

        val backButton = findViewById<Button>(R.id.backFromMidas)
        backButton.setOnClickListener(){
            showInterAd()

        }

        var midas1 = findViewById<EditText>(R.id.midas1)
        var midas2 = findViewById<EditText>(R.id.midas2)
        var midas3 = findViewById<EditText>(R.id.midas3)
        var midas4 = findViewById<EditText>(R.id.midas4)
        var midas5 = findViewById<EditText>(R.id.midas5)

        var midasInterpetation = findViewById<TextView>(R.id.midasInterpretation)

        val getResult = findViewById<Button>(R.id.midasResult)
        getResult.setOnClickListener(){

            val zero = "0"

            var str1 = midas1.text.toString()
            var str2 = midas2.text.toString()
            var str3 = midas3.text.toString()
            var str4 = midas4.text.toString()
            var str5 = midas5.text.toString()

            var m1: Int
            var m2: Int
            var m3: Int
            var m4: Int
            var m5: Int

            if (str1.isEmpty())
            {
                m1 = 0
            }
            else{
                m1 = str1.toString().toInt()
            }
            if (str2.isEmpty())
            {
                m2 = 0
            }
            else{
                m2 = str2.toString().toInt()
            }
            if (str3.isEmpty())
            {
                m3 = 0
            }
            else{
                m3 = str3.toString().toInt()
            }
            if (str4.isEmpty())
            {
                m4 = 0
            }
            else{
                m4 = str4.toString().toInt()
            }
            if (str5.isEmpty())
            {
                m5 = 0
            }
            else{
                m5 = str5.toString().toInt()
            }

            var totalMidas = m1+m2+m3+m4+m5

            when(totalMidas){
                in 0..5 -> {
                    midasInterpetation.text = "Общая оценка = $totalMidas \n\nСтепень I \n\nМалая интенсивность боли, отсутствие или минимальное снижение повседневной активности"
                    midasInterpetation.visibility = TextView.VISIBLE
                }
                in 6..10 -> {
                    midasInterpetation.text = "Общая оценка = $totalMidas \n\nСтепень II \n\nУмеренная / выраженная боль, незначительное ограничение повседневной активности"
                    midasInterpetation.visibility = TextView.VISIBLE
                }
                in 11..20 -> {
                    midasInterpetation.text = "Общая оценка = $totalMidas \n\nСтепень III \n\nСильная боль. Выраженное ограничение повседневной активности"
                    midasInterpetation.visibility = TextView.VISIBLE
                }
                in 21..92 -> {
                    midasInterpetation.text = "Общая оценка = $totalMidas \n\nСтепень IV \n\nСильная боль. Значительное снижение повседневной активности"
                    midasInterpetation.visibility = TextView.VISIBLE
                }

            }

            if (totalMidas>92){
                midasInterpetation.text = "Общая оценка не объективна, так как количество дней преувеличено"
                midasInterpetation.visibility = TextView.VISIBLE
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
                    val intent = Intent(this@MIDAS, MainActivity::class.java)
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
            val intent = Intent(this@MIDAS, MainActivity::class.java)
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