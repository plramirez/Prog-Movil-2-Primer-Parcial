package com.example.primerparcialmovil2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.primerparcialmovil2.about_me_unit2.AboutMeMainActivity
import com.example.primerparcialmovil2.color_my_views_unit2.ColorMyViewsMainActivity
import com.example.primerparcialmovil2.roll_dice_unit1.RollDiceMainActivity

class MainActivity : AppCompatActivity() {
    private lateinit var btnDiceRoller : Button
    private lateinit var btnAboutMe : Button
    private lateinit var btnColorMyViews : Button


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

        btnAboutMe.setOnClickListener {
            val intent = Intent(this, AboutMeMainActivity::class.java)
            startActivity(intent)
        }

        btnColorMyViews.setOnClickListener {
            val intent = Intent(this, ColorMyViewsMainActivity::class.java)
            startActivity(intent)
        }
    }

    private fun initComponents() {
        btnDiceRoller = findViewById(R.id.btnEnterDiceRoller)
        btnAboutMe = findViewById(R.id.btnAboutMe)
        btnColorMyViews = findViewById(R.id.btnColorMyViews)
    }
}