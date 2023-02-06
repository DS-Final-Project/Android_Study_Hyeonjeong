package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button);
        rollButton.setOnClickListener{ rollDice() };

        /*val countUpButton: Button = findViewById(R.id.count_up);
        /countUpButton.setOnClickListener{ countUp() };

        result text가 Default로 String일 경우 result text에 1을 할당
        val resultText: TextView = findViewById(R.id.result_text);
        var text = resultText.toString().toIntOrNull(); //Int형이 아니면 Null
        if(text == null) resultText.text = "1";
        */
    }

    private fun rollDice() {
        val randomInt = (1..6).random()
        val diceImage: ImageView = findViewById(R.id.dice_image)
        //val resultText: TextView = findViewById(R.id.result_text)
        //resultText.text = randomInt.toString()
        val drawableResource = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImage.setImageResource(drawableResource)
    }

    /*private fun countUp(){
        val resultText: TextView = findViewById(R.id.result_text);
        var num =  resultText.text.toString().toInt();
        if(num != 6) num += 1;
        resultText.text = num.toString();

    }*/
}