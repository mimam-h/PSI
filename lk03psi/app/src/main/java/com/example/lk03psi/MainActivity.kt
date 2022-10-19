package com.example.lk03psi

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var likeBtn: Button
    lateinit var cookBtn: Button
    lateinit var tvCurrentCardRating: TextView
    private val SHAREDCOMP = "shared"
    private val RATE = "rate"
    private var rating = "20 user"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        likeBtn = findViewById(R.id.current_card_btnLike)
        cookBtn = findViewById(R.id.current_card_btnCook)
        tvCurrentCardRating = findViewById(R.id.current_menu_rating)
        val container = getSharedPreferences(SHAREDCOMP, Context.MODE_PRIVATE)


        likeBtn.setOnClickListener {
            Toast.makeText(this, "Like berhasil ditambahkan", Toast.LENGTH_SHORT).show()
            val rateAfter = "21 user"
            tvCurrentCardRating.text = rateAfter
            val editor = container.edit()
            editor.putString(RATE,rateAfter)
            editor.apply()
        }

        cookBtn.setOnClickListener {
            Intent(this, SecondActivity::class.java).also {
                startActivity(it)
            }
        }

        cookBtn.setOnLongClickListener {
            Toast.makeText(this,"On Long Click Event", Toast.LENGTH_SHORT).show()
            true
        }

        val getCurentRate = container.getString(RATE,rating)
        tvCurrentCardRating.text = getCurentRate.toString()
    }
}