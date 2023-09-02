package com.coding.meet.gridlayoutapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val item1CardView = findViewById<CardView>(R.id.item1CardView)
        item1CardView.setOnClickListener {
            Toast.makeText(this,"Item 1 Clicked",Toast.LENGTH_LONG).show()
        }
    }
}