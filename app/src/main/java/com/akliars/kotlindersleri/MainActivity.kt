package com.akliars.kotlindersleri

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    var mesaj:String? = null
    lateinit var info:String
    //lateinit var sayi:Int
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //info = "Merhaba"
        //info.lowercase()
    }
}