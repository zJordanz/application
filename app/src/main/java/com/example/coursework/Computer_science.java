package com.example.coursework;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Computer_science extends AppCompatActivity {

    // Gives buttons identifiers linked to their Id
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_computer_science);
        Button button1 = (Button) findViewById(R.id.mob);
        Button button2 = (Button) findViewById(R.id.web);
        Button button3 = (Button) findViewById(R.id.oop);
        Button button4 = (Button) findViewById(R.id.to_do);

        //When button " " is clicked it will go to " " activity
        button1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent myintent2 = new Intent(Computer_science.this, mobile_reminder.class);
                startActivity(myintent2);

            }
        });
        button2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent myintent2 = new Intent(Computer_science.this, Web.class);
                startActivity(myintent2);

            }
        });
        button3.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent myintent2 = new Intent(Computer_science.this, Object_Orientated_Programming.class);
                startActivity(myintent2);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent myintent2 = new Intent(Computer_science.this, Reminders.class);
                startActivity(myintent2);
            }
        });
    }
}