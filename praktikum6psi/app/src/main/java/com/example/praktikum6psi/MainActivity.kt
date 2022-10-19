package com.example.praktikum6psi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlin.system.exitProcess

class MainActivity : AppCompatActivity() {

    private lateinit var areaBtn: Button
    private lateinit var volumeBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        areaBtn = findViewById(R.id.areaCard_btn)
        volumeBtn = findViewById(R.id.volCard_btn)

        areaBtn.setOnClickListener {
            Toast.makeText(applicationContext,"Hitung Luas Segitiga",Toast.LENGTH_SHORT).show()
            Intent(this,SecondActivity::class.java).also{
                startActivity(it)
            }
        }

        volumeBtn.setOnClickListener {
            Toast.makeText(applicationContext,"Hitung Volume Kubus",Toast.LENGTH_SHORT).show()
            Intent(this,ThirdActivity::class.java).also{
                startActivity(it)
            }
        }

        findViewById<Button>(R.id.exit_btn).setOnClickListener {
            exitProcess(0)
        }
    }
}