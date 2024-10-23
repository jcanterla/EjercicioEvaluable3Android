package com.ejercicioevaluable13

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.boton1).setOnClickListener {
            startActivity(Intent(this, MainActivity2::class.java))
        }

        findViewById<Button>(R.id.boton2).setOnClickListener {
            startActivity(Intent(this, MainActivity3::class.java))
        }

        findViewById<Button>(R.id.boton3).setOnClickListener {
            startActivity(Intent(this, MainActivity4::class.java))
        }
    }
}