package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView amountView = findViewById(R.id.amountTextView);

        long firstNumber = getIntent().getExtras().getLong("firstNumber");
        long secondNumber = getIntent().getExtras().getLong("secondNumber");
        long amount = firstNumber + secondNumber;

        if (amount > 1000000000 || amount < -1000000000) {
            amountView.setText("Слишком большое число");
        }
        else if(secondNumber < 0){
            amountView.setText(firstNumber + " + (" +
                    secondNumber + ") = " + amount);
        }
        else {
            amountView.setText(firstNumber + " + " +
                    secondNumber + " = " + amount);
        }
    }
}