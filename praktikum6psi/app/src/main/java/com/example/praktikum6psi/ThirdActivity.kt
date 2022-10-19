package com.example.praktikum6psi

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class ThirdActivity : AppCompatActivity() {

    private lateinit var backBtn: Button
    private lateinit var getResultBtn: Button
    private lateinit var rusukCol: EditText
    private lateinit var resultCol: TextView
    private val RESULT = "ResultCal"
    private val SHARED = "KeyShared"
    private val RUSUK = "RusukColumn"
    private var result = 0.0f

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        //      Get View Element
        backBtn = findViewById(R.id.back_btn)
        getResultBtn = findViewById(R.id.calTriangle_btn)
        rusukCol = findViewById(R.id.rusuk_col)
        resultCol = findViewById(R.id.hasil_col)
        var container = getSharedPreferences("KeyShared", Context.MODE_PRIVATE)


//      Operation
        getResultBtn.setOnClickListener {
            Toast.makeText(applicationContext,"Berhasil",Toast.LENGTH_SHORT).show()
            result = rusukCol.text.toString().toFloat() * rusukCol.text.toString().toFloat() * rusukCol.text.toString().toFloat()
            resultCol.text = result.toString()
            val editor = container.edit()
            editor.putFloat(RESULT,result)
            editor.putString(RUSUK,rusukCol.text.toString())
            editor.apply()
        }

        backBtn = findViewById(R.id.back_btn)

        backBtn.setOnClickListener {
            Toast.makeText(applicationContext,"Kembali ke Home",Toast.LENGTH_SHORT).show()
            finish()
        }

        val getResultCalc = container.getFloat(RESULT, 0.0f)
        val getResultRusuk = container.getString(RUSUK, "")
        resultCol.text = getResultCalc.toString()
        rusukCol.setText(getResultRusuk)
    }
}