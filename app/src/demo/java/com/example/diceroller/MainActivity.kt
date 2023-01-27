package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.diceroller.utils.rollDice

/**
 * This activity allows the user to roll a dice and view the result
 * on the screen.
 */
class MainActivity : AppCompatActivity() {

    /**
     * This method is called when the Activity is created.
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Find the Button in the layout
        val rollButton: Button = findViewById(R.id.button)
        val diceImage: ImageView = findViewById(R.id.imageView)
        // Set a click listener on the button to roll the dice when the user taps the button
        rollButton.setOnClickListener { rollDice(diceImage) }

        // Do a dice roll when the app starts
        rollDice(diceImage)
    }


}
