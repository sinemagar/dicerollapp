package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton : Button = findViewById(R.id.rollbutton)
        rollButton.setOnClickListener {zarat()

        }
        val diceImage : ImageView = findViewById(R.id.image)
        diceImage.setImageResource(R.drawable.dice)
    }

    fun zarat(){
        var randamNumber =(1..6).random()
        val numtext : TextView = findViewById(R.id.number)
        numtext.text = "${randamNumber} geldi."
        val diceImage : ImageView = findViewById(R.id.image)

        if(randamNumber == 1){
            diceImage.setImageResource(R.drawable.dice1)
        }
        if(randamNumber == 2){
            diceImage.setImageResource(R.drawable.dice2)
        }
        if(randamNumber == 3){
            diceImage.setImageResource(R.drawable.dice3)
        }
        if(randamNumber == 4){
            diceImage.setImageResource(R.drawable.dice4)
        }
        if(randamNumber == 5){
            diceImage.setImageResource(R.drawable.dice5)
        }
        if(randamNumber == 6){
            diceImage.setImageResource(R.drawable.dice6)
        }


    }

}