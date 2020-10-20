package com.example.ll

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener{
            val dateOfBirth:Int =textView.text.toString().toInt();
            val yearToday = Calendar.getInstance().get(Calendar.YEAR);
            val age = yearToday-dateOfBirth;

            ageshow.text = "youre age is"+age.toString()+"years";

        }
    }
}