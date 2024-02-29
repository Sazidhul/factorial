package com.example.a229;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvDisplay;

    int factorial = 1;



    LinearLayout myLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvDisplay = findViewById(R.id.tvDisplay);

        for (int x=1; x<=5; x++){
            factorial = factorial*x;
        }

        tvDisplay.setText("Fec of 5 is : "+factorial);


    }
}