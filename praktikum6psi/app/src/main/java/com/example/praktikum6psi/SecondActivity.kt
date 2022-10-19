package com.example.praktikum6psi

import android.content.Context
import android.net.wifi.WifiConfiguration.AuthAlgorithm.SHARED
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class SecondActivity : AppCompatActivity() {

    private lateinit var backBtn: Button
    private lateinit var getResultBtn: Button
    private lateinit var alasCol: EditText
    private lateinit var tinggiCol: EditText
    private lateinit var resultCol: TextView
    private val RESULT = "ResultCal"
    private val SHARED = "KeyShared"
    private val ALAS = "InputCol1"
    private val TINGGI = "InputCOl2"
    private var result = 0.0f

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

//      Get View Element
        backBtn = findViewById(R.id.back_btn)
        getResultBtn = findViewById(R.id.calTriangle_btn)
        alasCol = findViewById(R.id.alas_col)
        tinggiCol = findViewById(R.id.tinggi_col)
        resultCol = findViewById(R.id.hasil_col)
        var container = getSharedPreferences(SHARED, Context.MODE_PRIVATE)


//      Operation
        getResultBtn.setOnClickListener {
            Toast.makeText(applicationContext,"Berhasil",Toast.LENGTH_SHORT).show()
            result = (alasCol.text.toString().toFloat() * tinggiCol.text.toString().toFloat())/2
            resultCol.text = result.toString()
            val editor = container.edit()
            editor.putFloat(RESULT,result)
            editor.putString(ALAS,alasCol.text.toString())
            editor.putString(TINGGI,tinggiCol.text.toString())
            editor.apply()
        }

        backBtn.setOnClickListener {
            Toast.makeText(applicationContext,"Kembali ke Home",Toast.LENGTH_SHORT).show()
            finish()
        }

        val getResultCalc = container.getFloat(RESULT, 0.0f)
        val getResultAlas = container.getString(ALAS, "")
        val getResultTinggi = container.getString(TINGGI, "")
        resultCol.text = getResultCalc.toString()
        alasCol.setText(getResultAlas)
        tinggiCol.setText(getResultTinggi)
    }
}