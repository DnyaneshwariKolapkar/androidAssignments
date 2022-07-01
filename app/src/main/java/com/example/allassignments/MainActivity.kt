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
        val btn5 = findViewById<Button>(R.id.button5)
        val btn6 = findViewById<Button>(R.id.button6)

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
        btn5.setOnClickListener {
            startActivity(Intent(this, fragment_demo::class.java))
        }
        btn6.setOnClickListener {
            startActivity(Intent(this, menus::class.java))
        }

    }
}