package com.trocaCor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

        TextView textView2;
        Button buttonA, buttonL, buttonV, buttonAL;
        LinearLayout linearLayout;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            textView2 = findViewById(R.id.proximo);
            buttonA = findViewById(R.id.btn_azul);
            buttonL = findViewById(R.id.btn_laranja);
            buttonV = findViewById(R.id.btn_vermelho);
            buttonAL = findViewById(R.id.btn_aleatorio);
            linearLayout = findViewById(R.id.fundo);

            textView2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    // move to the next page
                    Intent intent = new Intent(MainActivity.this, Pag2.class);
                    startActivity(intent);
                }
            });

            buttonA.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    // set the color blue on layout
                    linearLayout.setBackgroundResource(R.color.blue);
                }
            });

            buttonL.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    // set the color orange on layout
                    linearLayout.setBackgroundResource(R.color.orange);
                }
            });

            buttonV.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    // set the color red on layout
                    linearLayout.setBackgroundResource(R.color.red);
                }
            });

            buttonAL.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    // set a random color in background and on the button
                    Random rnd = new Random();
                    int color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
                    linearLayout.setBackgroundColor(color);
                    buttonAL.setBackgroundColor(color);
                }
            });




    }
}