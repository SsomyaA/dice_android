package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    private ImageView DicyImageView_1;
    private ImageView DicyImageView_2;

    Random myRandomNumber = new Random();

    Button myButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DicyImageView_1 = findViewById(R.id.imageView1);
        DicyImageView_2 = findViewById(R.id.imageView2);

        myButton = findViewById(R.id.button);
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ranCreate();
            }
        });

    }

    public void buttonPressed(View view) {

    }

    private void ranCreate() {
        int myRanNum_1 = myRandomNumber.nextInt(6) + 1;
        int myRanNum_2 = myRandomNumber.nextInt(6) + 1;

        switch (myRanNum_1) {

            case 1:
                DicyImageView_1.setImageResource(R.drawable.dice_1);
                break;
            case 2:
                DicyImageView_1.setImageResource(R.drawable.dice_2);
                break;
            case 3:
                DicyImageView_1.setImageResource(R.drawable.dice_3);
                break;
            case 4:
                DicyImageView_1.setImageResource(R.drawable.dice_4);
                break;
            case 5:
                DicyImageView_1.setImageResource(R.drawable.dice_5);
                break;
            case 6:
                DicyImageView_1.setImageResource(R.drawable.dice_6);
                break;
        }

        switch (myRanNum_2) {

            case 1:
                DicyImageView_2.setImageResource(R.drawable.dice_1);
                break;
            case 2:
                DicyImageView_2.setImageResource(R.drawable.dice_2);
                break;
            case 3:
                DicyImageView_2.setImageResource(R.drawable.dice_3);
                break;
            case 4:
                DicyImageView_2.setImageResource(R.drawable.dice_4);
                break;
            case 5:
                DicyImageView_2.setImageResource(R.drawable.dice_5);
                break;
            case 6:
                DicyImageView_2.setImageResource(R.drawable.dice_6);
                break;
        }
    }

}
