package com.example.exampletst

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val myLabel : TextView = findViewById(R.id.myTxt)

        //In this typical Android activity ,but here you use the HelperClass
        var myObject = HelperDB()
        myLabel.text = myObject.myFun("Hello World")
        myObject.returned = myLabel.text.toString()

    }
}