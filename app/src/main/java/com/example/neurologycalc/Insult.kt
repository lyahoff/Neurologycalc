package com.example.neurologycalc

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.ads.AdError
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.FullScreenContentCallback
import com.google.android.gms.ads.LoadAdError
import com.google.android.gms.ads.interstitial.InterstitialAd
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback

class Insult : AppCompatActivity() {
    private var mInterstitialAd: InterstitialAd? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_insult)
        loadInterAd()
        val backToMain = findViewById<Button>(R.id.backToMain)
        backToMain.setOnClickListener(){
            showInterAd()
        }

        val nihssBtn = findViewById<Button>(R.id.nihssBtn)
        nihssBtn.setOnClickListener(){
            val intent = Intent(this@Insult,Nihss::class.java)
            finish()
            startActivity(intent)
        }

        val cha2Btn = findViewById<Button>(R.id.cha2Btn)
        cha2Btn.setOnClickListener(){
            val intent = Intent(this@Insult,Cha2::class.java)
            finish()
            startActivity(intent)
        }

        val hasBled = findViewById<Button>(R.id.hasBledBtn)
        hasBled.setOnClickListener(){
            val intent = Intent(this@Insult,HasBled::class.java)
            finish()
            startActivity(intent)
        }

        val abcd2 = findViewById<Button>(R.id.abcd2Btn)
        abcd2.setOnClickListener(){
            val intent = Intent(this@Insult,ABCD2::class.java)
            finish()
            startActivity(intent)
        }

        val rtPa = findViewById<Button>(R.id.rtpaBtn)
        rtPa.setOnClickListener(){
            val intent = Intent(this@Insult,RtPa::class.java)
            finish()
            startActivity(intent)
        }

        val renkin = findViewById<Button>(R.id.renkinBtn)
        renkin.setOnClickListener(){
            val intent = Intent(this@Insult,Renkin::class.java)
            finish()
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

    private fun showInterAd() {
        if (mInterstitialAd != null ){

            mInterstitialAd?.fullScreenContentCallback = object : FullScreenContentCallback(){
                override fun onAdClicked() {
                    super.onAdClicked()
                }

                override fun onAdDismissedFullScreenContent() {
                    super.onAdDismissedFullScreenContent()
                    val intent = Intent(this@Insult,MainActivity::class.java)
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
            val intent = Intent(this@Insult,MainActivity::class.java)
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