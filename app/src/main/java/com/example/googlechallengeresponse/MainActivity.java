package com.example.googlechallengeresponse;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Button button1, button2, button3, button4;
    ImageView imgVerify;
    int answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        imgVerify = findViewById(R.id.imageView);

        button4.setOnClickListener(view -> {
            int num1 = (int) Math.floor(Math.random() * 100);
            int num2 = (int) Math.floor(Math.random() * 100);
            int num3 = (int) Math.floor(Math.random() * 100);
            while (num1 == num2 || num1 == num3){
                num1 = (int) Math.floor(Math.random() * 100);
            }
            while (num1 == num2 || num2 == num3){
                num2 = (int) Math.floor(Math.random() * 100);
            }
            button1.setVisibility(View.VISIBLE);
            button2.setVisibility(View.VISIBLE);
            button3.setVisibility(View.VISIBLE);
            imgVerify.setVisibility(View.INVISIBLE);
            button1.setText(String.valueOf(num1));
            button2.setText(String.valueOf(num2));
            button3.setText(String.valueOf(num3));
            answer = (int) Math.ceil(Math.random()*3);
            if (answer == 1){
                System.out.println("Correct option is: " + num1);
            } else if (answer == 2){
                System.out.println("Correct option is: " + num2);
            } else {
                System.out.println("Correct option is: " + num3);
            }
        });

        button1.setOnClickListener(view -> {
            if(answer == 1){
                imgVerify.setImageResource(R.drawable.correct);
                imgVerify.setVisibility(View.VISIBLE);
            } else {
                imgVerify.setImageResource(R.drawable.ic_baseline_clear_24);
                imgVerify.setVisibility(View.VISIBLE);
            }
        });

        button2.setOnClickListener(view -> {
            if(answer == 2){
                imgVerify.setImageResource(R.drawable.correct);
                imgVerify.setVisibility(View.VISIBLE);
            } else {
                imgVerify.setImageResource(R.drawable.ic_baseline_clear_24);
                imgVerify.setVisibility(View.VISIBLE);
            }
        });

        button3.setOnClickListener(view -> {
            if(answer == 3){
                imgVerify.setImageResource(R.drawable.correct);
                imgVerify.setVisibility(View.VISIBLE);
            } else {
                imgVerify.setImageResource(R.drawable.ic_baseline_clear_24);
                imgVerify.setVisibility(View.VISIBLE);
            }
        });
    }
}