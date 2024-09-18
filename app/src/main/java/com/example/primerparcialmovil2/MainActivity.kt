package com.example.primerparcialmovil2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.primerparcialmovil2.roll_dice.RollDiceMainActivity

class MainActivity : AppCompatActivity() {
    private lateinit var btnDiceRoller : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initComponents()
        initListeners()

    }

    private fun initListeners() {
        btnDiceRoller.setOnClickListener {
            val intent = Intent(this, RollDiceMainActivity::class.java)
            startActivity(intent)
        }
    }

    private fun initComponents() {
        btnDiceRoller = findViewById(R.id.btnEnterDiceRoller)
    }
}