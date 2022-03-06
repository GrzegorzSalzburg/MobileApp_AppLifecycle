package com.example.gs_252912_lab1

import android.content.Context
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private var context: Context? = null        //new empty variable to Toast.makeText
    private val duration = Toast.LENGTH_SHORT   //duration

    /*onCreate*/
    override fun onCreate(savedInstanceState: Bundle?) { //
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val exitbutton = findViewById<Button>(R.id.button)
        exitbutton.setOnClickListener {
            finish()
        }

        context = applicationContext                              //applicationContext to variable
        Toast.makeText(context, "onCreate", duration).show() //Toast notification
    }

    /*onStart*/
    override fun onStart() { //
        super.onStart()
        Toast.makeText(context, "onStart", duration).show()
    }

    /*onResume*/
    override fun onResume() {
        super.onResume()
        Toast.makeText(context,"onResume",duration).show()
    }

    /*onSaveInstanceState*/
    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Toast.makeText(context,"onSaveInstanceState",duration).show()
    }

    /* onPause*/
    override fun onPause() {
        super.onPause()
        Toast.makeText(context,"onPause",duration).show()
    }

    /*onStop*/
    override fun onStop() { //
        super.onStop()
        Toast.makeText(context,"onStop",duration).show()
    }

    /*onDestroy*/
    override fun onDestroy(){
        super.onDestroy()
        Toast.makeText(context, "onDestroy", duration).show()
    }

    /*onRestart*/
    override fun onRestart() {
        super.onRestart()
        Toast.makeText(context,"onRestart",duration).show()
    }
}