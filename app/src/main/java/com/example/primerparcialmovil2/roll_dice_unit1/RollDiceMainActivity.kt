package com.example.primerparcialmovil2.roll_dice_unit1

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.primerparcialmovil2.R
import java.util.Random


class RollDiceMainActivity : AppCompatActivity() {
    private lateinit var diceImageView: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_roll_dice_main)

        val rollButton: Button = findViewById(R.id.btn_roll_button)
        diceImageView = findViewById(R.id.ivDice)

        rollButton.text = "Let's Roll!"

        rollButton.setOnClickListener {
            //Toast.makeText(this, "Button Clicked", Toast.LENGTH_SHORT).show()
            rollDice()
        }
    }

    private fun rollDice() {
        //val resultText : TextView = findViewById(R.id.tvDiceText)

        val randomInt = Random().nextInt(6) + 1

        val drawableResource = when(randomInt){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            6 -> R.drawable.dice_6
            else -> {R.drawable.empty_dice}
        }

        diceImageView.setImageResource(drawableResource)

        //resultText.text = randomInt.toString()
    }
}