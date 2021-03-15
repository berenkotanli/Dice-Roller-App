package com.beren.dicerollerapp

import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Defining the components
        val imageDiceOne : ImageView = findViewById(R.id.imageDiceOne)
        val imageDiceTwo : ImageView = findViewById(R.id.imageDiceTwo)
        val diceCleanButton : Button = findViewById(R.id.diceCleanButton)
        val diceRollButton : Button = findViewById(R.id.diceRollButton)
        val resultTextView: TextView = findViewById(R.id.textView)
        val eightSidedDice : Button = findViewById(R.id.eightButton)

        //Setting a clicker on delete button to replace dice images with empty ones and setting the text to title back
        //Also, informing the user with a toast message to say the screen is cleaned
        diceCleanButton.setOnClickListener {
            imageDiceOne.setImageResource(R.drawable.empty_dice)
            imageDiceTwo.setImageResource(R.drawable.empty_dice)
            resultTextView.text="Zar Atma Uygulaması"

            val myToast = Toast.makeText(applicationContext,"TEMİZLENDİ",Toast.LENGTH_SHORT)
            myToast.setGravity(Gravity.BOTTOM,-350,0)
            myToast.show()


        }
        //Rolling the standard dice with 6 sides
        diceRollButton.setOnClickListener {
            //creating 2 random numbers between 1-6 to and putting the proper dice images
            val randomOne = (1..6).random()
            val randomTwo = (1..6).random()
            val resource = when (randomOne) {
                1 -> R.drawable.dice_1
                2 -> R.drawable.dice_2
                3 -> R.drawable.dice_3
                4 -> R.drawable.dice_4
                5 -> R.drawable.dice_5
                else -> R.drawable.dice_6
            }
            imageDiceOne.setImageResource(resource)
            val resourceTwo = when (randomTwo) {
                1 -> R.drawable.dice_1
                2 -> R.drawable.dice_2
                3 -> R.drawable.dice_3
                4 -> R.drawable.dice_4
                5 -> R.drawable.dice_5
                else -> R.drawable.dice_6
            }
            imageDiceTwo.setImageResource(resourceTwo)
            //Showing a toast message to inform the user that dices are rolled
            val myToast = Toast.makeText(applicationContext,"STANDART ZAR ATILDI",Toast.LENGTH_SHORT)
            myToast.setGravity(Gravity.BOTTOM,350,0)
            myToast.show()
            // Showing the dice numbers in a text box as well
            resultTextView.text = "Sayılarınız:  $randomOne , $randomTwo"


        }
        //This part is optional. It is doing similar stuff with standard dice rolling part but the dice I roll here is 8-sided
        //However I could not find 8-sided dice images to put thats why I had to edit the xml for it.
        eightSidedDice.setOnClickListener {
            val random = (1..8).random()
            val random2 = (1..8).random()
            val resource = when (random) {
                1 -> R.drawable.dice_1
                2 -> R.drawable.dice_2
                3 -> R.drawable.dice_3
                4 -> R.drawable.dice_4
                5 -> R.drawable.dice_5
                6 -> R.drawable.dice_6
                7-> R.drawable.dice_7
                else-> R.drawable.dice_8
            }
            imageDiceOne.setImageResource(resource)
            val resourceTwo = when (random2) {
                1 -> R.drawable.dice_1
                2 -> R.drawable.dice_2
                3 -> R.drawable.dice_3
                4 -> R.drawable.dice_4
                5 -> R.drawable.dice_5
                6 -> R.drawable.dice_6
                7-> R.drawable.dice_7
                else-> R.drawable.dice_8
            }
            imageDiceTwo.setImageResource(resourceTwo)
            val myToast = Toast.makeText(applicationContext,"8 YÜZLÜ ZAR ATILDI",Toast.LENGTH_SHORT)
            myToast.setGravity(Gravity.BOTTOM,350,0)
            myToast.show()
            resultTextView.text = "Sayılarınız:  $random , $random2"
        }
    }


}
