package com.nepplus.librarypractice_20211105

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        setupEvents()
        setVluse()
    }

    fun setupEvents( )  {


    }

    fun setVluse( ){

//        2.5초 후에 메인화면으로 이동 -> SplahActivity후 종료
        val myHandler = Handler( Looper.getMainLooper() )
        myHandler.postDelayed( {

               val myIntent = Intent(this,MainActivity::class.java)
            startActivity(myIntent)

            finish()


        }, 2500 )

    }
}