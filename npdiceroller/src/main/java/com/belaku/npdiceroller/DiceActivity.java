package com.belaku.npdiceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class DiceActivity extends AppCompatActivity {

    private ImageView imageViewDice;
    private Random random;
    private int randomNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dice);

        imageViewDice = findViewById(R.id.imgv_dice);
        random = new Random();

        imageViewDice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                randomNumber = random.nextInt(7 - 1) + 1;

                switch (randomNumber) {
                    case 1 :
                        imageViewDice.setImageResource(R.drawable.dice_1);
                        break;
                    case 2 :
                        imageViewDice.setImageResource(R.drawable.dice_2);
                        break;
                    case 3 :
                        imageViewDice.setImageResource(R.drawable.dice_3);
                        break;
                    case 4 :
                        imageViewDice.setImageResource(R.drawable.dice_4);
                        break;
                    case 5 :
                        imageViewDice.setImageResource(R.drawable.dice_5);
                        break;
                    case 6 :
                        imageViewDice.setImageResource(R.drawable.dice_6);
                        break;
                }
            }
        });
    }
}
