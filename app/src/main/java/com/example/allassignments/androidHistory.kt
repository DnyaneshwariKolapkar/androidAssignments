package com.example.allassignments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.Toast

class androidHistory : AppCompatActivity() {
    val language = arrayOf<String>("Android 11","Android 9 pie","Android Oreo","Marshmallow","Kitkat","Gingerbread")
    val description = arrayOf<String>(
        "It is a latest Android version",
        "It was first announced by Google on March 7, 2018, and the first developer preview was released on the same day",
        "It was first released as a developer preview, codenamed Android O, on March 21, 2017.",
        "Android 6.0 Marshmallow was unveiled under the codename Android M during Google I/O on May 28, 2015",
        "Google announced Android 4.4 KitKat on September 3, 2013.",
        "On December 6, 2010, the Android 2.3 (Gingerbread) SDK was released, based on Linux kernel 2.6.35.",
    )

    val imageId = arrayOf<Int>(
        R.drawable.android11,R.drawable.androidpie,R.drawable.androidoreo,
        R.drawable.androidmarsh,R.drawable.androidkitkat, R.drawable.androidginger
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_android_history)
        supportActionBar?.hide()
        var listView = findViewById<ListView>(R.id.listView)
        val myListAdapter = listAdapter_ah(this,language,description,imageId)
        listView.adapter = myListAdapter

        listView.setOnItemClickListener(){adapterView, view, position, id ->
            val itemAtPos = adapterView.getItemAtPosition(position)
            val itemIdAtPos = adapterView.getItemIdAtPosition(position)
            Toast.makeText(this, "You clicked on $itemAtPos it is $itemIdAtPos item on the list ", Toast.LENGTH_LONG).show()
        }
    }
}