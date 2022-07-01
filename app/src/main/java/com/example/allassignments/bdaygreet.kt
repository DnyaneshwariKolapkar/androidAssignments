package com.example.allassignments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class bdaygreet : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_bdaygreet)
        val btn = findViewById<Button>(R.id.wishbutton)
        val name = findViewById<EditText>(R.id.editTextTextPersonName)
        btn.setOnClickListener {
            Toast.makeText(this, "Hello "+ name.text + "!!!", Toast.LENGTH_LONG).show()
        }
    }
}//