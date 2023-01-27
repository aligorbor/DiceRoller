package com.example.diceroller.utils

import android.widget.ImageView
import com.example.diceroller.data.Dice

/**
 * Roll the dice and update the screen with the result.
 */
fun rollDice(diceImage: ImageView) {
    // Create new Dice object with 6 sides and roll it
    val dice = Dice(6)
    val diceRoll = dice.roll()

    // Find the ImageView in the layout

    // Determine which drawable resource ID to use based on the dice roll
    val drawableResource = when (diceRoll) {
        1 -> R.drawable.dice_1
        2 -> R.drawable.dice_2
        3 -> R.drawable.dice_3
        4 -> R.drawable.dice_4
        5 -> R.drawable.dice_5
        else -> R.drawable.dice_6
    }

    // Update the ImageView with the correct drawable resource ID
    diceImage.setImageResource(drawableResource)

    // Update the content description
    diceImage.contentDescription = diceRoll.toString()

}