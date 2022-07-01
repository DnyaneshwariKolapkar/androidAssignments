package com.example.allassignments

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn1 = findViewById<Button>(R.id.button1)
        val btn2 = findViewById<Button>(R.id.button2)
        val btn3 = findViewById<Button>(R.id.button3)
        val btn4 = findViewById<Button>(R.id.button4)

        btn1.setOnClickListener {
            startActivity(Intent(this, bdaygreet::class.java))
        }
        btn2.setOnClickListener {
            startActivity(Intent(this, conversion::class.java))
        }
        btn3.setOnClickListener {
            startActivity(Intent(this, androidHistory::class.java))
        }
        btn4.setOnClickListener {
            startActivity(Intent(this, MyBMI::class.java))
        }
    }
}