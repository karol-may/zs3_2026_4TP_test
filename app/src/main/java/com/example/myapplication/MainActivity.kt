package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val polubieniaTextView = findViewById<TextView>(R.id.polubieniaTextView)
        val polubButton = findViewById<Button>(R.id.polubButton)
        val usunButton = findViewById<Button>(R.id.usunButton)
        val zapiszButton = findViewById<Button>(R.id.zapiszButton)

        var licznik = 0;

        fun refreshPolubieniaTextView() {
            polubieniaTextView.text = licznik.toString() + " polubień";
        }

        refreshPolubieniaTextView();

        polubButton.setOnClickListener {
            licznik++;
            refreshPolubieniaTextView();
        }

        usunButton.setOnClickListener {
            if (licznik > 0) {
                licznik--;
                refreshPolubieniaTextView();
            }
        }


    }





}