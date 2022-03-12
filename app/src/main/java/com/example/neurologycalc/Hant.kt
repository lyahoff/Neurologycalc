package com.example.neurologycalc

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.TextView
import com.google.android.gms.ads.AdError
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.FullScreenContentCallback
import com.google.android.gms.ads.LoadAdError
import com.google.android.gms.ads.interstitial.InterstitialAd
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback

class Hant : AppCompatActivity() {
    private var mInterstitialAd: InterstitialAd? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hant)
        loadInterAd()
        val back = findViewById<Button>(R.id.backFromHant)
        back.setOnClickListener(){
            showInterAd()
        }

        val result = findViewById<Button>(R.id.hantResultBtn)
        result.setOnClickListener(){
            val hant1 = findViewById<RadioButton>(R.id.rbHant1)
            val hant2 = findViewById<RadioButton>(R.id.rbHant2)
            val hant3 = findViewById<RadioButton>(R.id.rbHant3)
            val hant4 = findViewById<RadioButton>(R.id.rbHant4)
            val hant5 = findViewById<RadioButton>(R.id.rbHant5)

            val chbHant = findViewById<CheckBox>(R.id.chbHant1)

            val interpretation = findViewById<TextView>(R.id.hantInterpretation)

            var total  = 0

            if (hant1.isChecked) total = 1
            if (hant2.isChecked) total = 2
            if (hant3.isChecked) total = 3
            if (hant4.isChecked) total = 4
            if (hant5.isChecked) total = 5
            if (chbHant.isChecked) total += 1 else total = total

            when(total){
                1 -> {
                    interpretation.visibility = TextView.VISIBLE
                    interpretation.text = "1 балл. При выявлении аневризмы возможно проведение незамедлительного оперативного лечения. Риск хирургической летальности - 30%"
                }
                2 -> {
                    interpretation.visibility = TextView.VISIBLE
                    interpretation.text = "2 балла. При выявлении аневризмы возможно проведение незамедлительного оперативного лечения. Риск хирургической летальности - 40%"
                }
                3 -> {
                    interpretation.visibility = TextView.VISIBLE
                    interpretation.text = "3 балла. При выявлении аневризмы проводится консервативное лечение до достижения 2-х или 1-го балла по шкале. Риск хирургической летальности - 50%"
                }
                4 -> {
                    interpretation.visibility = TextView.VISIBLE
                    interpretation.text = "4 балла. При выявлении аневризмы проводится консервативное лечение до достижения 2-х или 1-го балла по шкале. Риск хирургической летальности - 80%"
                }
                5 -> {
                    interpretation.visibility = TextView.VISIBLE
                    interpretation.text = "5 баллов. При выявлении аневризмы проводится консервативное лечение до достижения 2-х или 1-го балла по шкале. Риск хирургической летальности - 90%"
                }
                6 -> {
                    interpretation.visibility = TextView.VISIBLE
                    interpretation.text = "6 баллов. При выявлении аневризмы проводится консервативное лечение до достижения 2-х или 1-го балла по шкале. Риск хирургической летальности - 90%"
                }
            }
            if (!hant1.isChecked&&!hant2.isChecked&&!hant3.isChecked&&!hant4.isChecked&&!hant5.isChecked&&chbHant.isChecked){
                interpretation.visibility = TextView.VISIBLE
                interpretation.text = "Необходимо выбрать один из критериев"
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
                    val intent = Intent(this@Hant, MainActivity::class.java)
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
            val intent = Intent(this@Hant, MainActivity::class.java)
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