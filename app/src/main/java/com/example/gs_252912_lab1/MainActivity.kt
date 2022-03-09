package com.example.gs_252912_lab1

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    /*onCreate*/
    override fun onCreate(savedInstanceState: Bundle?) { //
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("Lifecycle_MSG","onCreate")
    }

    /*onStart*/
    override fun onStart() { //
        super.onStart()
        Log.d("Lifecycle_MSG","onStart")
    }

    /*onResume*/
    override fun onResume() {
        super.onResume()
        Log.d("Lifecycle_MSG","onResume")
    }

    /* onPause*/
    override fun onPause() {
        super.onPause()
        Log.d("Lifecycle_MSG","onPause")
    }

    /*onStop*/
    override fun onStop() { //
        super.onStop()
        Log.d("Lifecycle_MSG","onStop")
    }

    /*onRestart*/
    override fun onRestart() {
        super.onRestart()
        Log.d("Lifecycle_MSG","onRestart")
    }

    /*onDestroy*/
    override fun onDestroy(){
        super.onDestroy()
        Log.d("Lifecycle_MSG","onDestroy")
    }

    /*onSaveInstanceState*/
    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.d("Lifecycle_MSG","onSaveInstanceState")
    }

    /*onRestoreInstanceState*/
    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.d("Lifecycle_MSG","onRestoreInstanceState")
    }
}