package com.example.diceroller

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var dicebtn :Button =findViewById(R.id.dicebtn)

        dicebtn.setOnClickListener {
            rolldice()
        }
    }

    private fun rolldice() {

        var randomNumber = Random.nextInt(6)+1
        var diceImages = when(randomNumber){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        var imgdice : ImageView = findViewById(R.id.dice)
        imgdice.setImageResource(diceImages)
    }
}