package com.example.myapplication44;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        ImageButton box1 = (ImageButton) findViewById(R.id.box1);
        box1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), box1.class);
                startActivity(intent);


            }

        });


        ImageButton box2 = (ImageButton) findViewById(R.id.box2);
        box2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), box2.class);
                startActivity(intent);
            }
        });

        ImageButton box3 = (ImageButton) findViewById(R.id.box3);
        box3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), box3.class);
                startActivity(intent);
            }
        });

        ImageButton box4 = (ImageButton) findViewById(R.id.box4);
        box4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), box4.class);
                startActivity(intent);
            }
        });

        ImageButton box5 = (ImageButton) findViewById(R.id.box5);
        box5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), box5.class);
                startActivity(intent);
            }
        });

        ImageButton QR = (ImageButton) findViewById(R.id.QR);
        QR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), QR.class);
                startActivity(intent);
            }
        });

        ImageButton imageButton = (ImageButton) findViewById(R.id.MAP);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), map.class);
                startActivity(intent);
            }
        });
    }
}