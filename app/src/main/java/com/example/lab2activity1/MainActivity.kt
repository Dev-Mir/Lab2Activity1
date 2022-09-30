package com.example.lab2activity1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("Message : ","In onCreate Method")

    }


    override fun onStart() {
        super.onStart()
        Log.d("Message : ","In onStart Method")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Message : ","In onResume Method")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Message : ","In onPause Method")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Message : ","In onStop Method")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Message : ","In onRestart Method")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Message : ","In onDestroy Method")

    }


}