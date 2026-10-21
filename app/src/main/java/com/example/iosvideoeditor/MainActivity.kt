package com.example.iosvideoeditor

import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnCancel = findViewById<TextView>(R.id.btnCancel)
        val btnDone = findViewById<TextView>(R.id.btnDone)

        btnCancel.setOnClickListener {
            Toast.makeText(this, "Editing dibatalkan", Toast.LENGTH_SHORT).show()
        }

        btnDone.setOnClickListener {
            Toast.makeText(this, "Perubahan video disimpan (Simulasi)", Toast.LENGTH_SHORT).show()
        }
    }
}
