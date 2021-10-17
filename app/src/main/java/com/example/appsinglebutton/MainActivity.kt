package com.example.appsinglebutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var btnSubmit:Button
    lateinit var textView:TextView
    lateinit var userText:EditText
    lateinit var text:String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSubmit=findViewById(R.id.btnSubmit)
        textView=findViewById(R.id.textView)
        userText=findViewById(R.id.edt)

        btnSubmit.setOnClickListener(){
            text=userText.text.toString()
            if (text.isNotEmpty()){
                textView.text=text
            }
        }
    }
}