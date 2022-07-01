package com.example.allassignments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class conversion : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_conversion)
        supportActionBar?.hide()
        val btn = findViewById<Button>(R.id.button)
        val x = findViewById<EditText>(R.id.editTextTextPersonName)
        val result = findViewById<TextView>(R.id.textView)



        btn.setOnClickListener {
            try {
                var dollars: Int? = x.text.toString().toIntOrNull()
                if (dollars != null) {
                    dollars*=75
                }
                result.text = "value in rupees " + dollars.toString()
            }
            catch (nfe : NumberFormatException){
                //result.text = "please enter value to convert"
            }
            Toast.makeText(this, "Thank you for using my app!!!", Toast.LENGTH_LONG).show()
        }
    }
}