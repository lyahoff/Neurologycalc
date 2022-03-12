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

class Consciousness : AppCompatActivity() {
    private var mInterstitialAd: InterstitialAd? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_consciousness)
        loadInterAd()

        val consciousnessButton = findViewById<Button>(R.id.backFromConsciousnessButton)
        consciousnessButton.setOnClickListener(){
            showInterAd()
        }

        val glazgoButton = findViewById<Button>(R.id.glazgoButton)
        glazgoButton.setOnClickListener(){
            val intent = Intent(this@Consciousness,GlazgoScreen::class.java)
            finish()
            startActivity(intent)
        }

        val glazgoChildrenButton = findViewById<Button>(R.id.glazgoChildrenButton)
        glazgoChildrenButton.setOnClickListener(){
            val intent = Intent(this@Consciousness,GlazgoChildren::class.java)
            finish()
            startActivity(intent)
        }

        val fourButton = findViewById<Button>(R.id.fourButton)
        fourButton.setOnClickListener(){
            val intent = Intent(this@Consciousness, FOUR::class.java)
            finish()
            startActivity(intent)
        }

        val richmondButton = findViewById<Button>(R.id.richmondButton)
        richmondButton.setOnClickListener(){
            val intent = Intent(this@Consciousness, Richmond::class.java)
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
                    val intent = Intent(this@Consciousness,MainActivity::class.java)
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
            val intent = Intent(this@Consciousness,MainActivity::class.java)
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