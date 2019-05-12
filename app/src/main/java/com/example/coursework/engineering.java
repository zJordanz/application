package com.example.coursework;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class engineering extends AppCompatActivity {


    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Gives buttons identifiers linked to their Id

        setContentView(R.layout.activity_engineering);
        Button button1 = (Button) findViewById(R.id.projects);
        Button button2 = (Button) findViewById(R.id.to_do2);

        //When button " " is clicked it will go to " " activity

        button1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent myintent2 = new Intent(engineering.this, projects.class);
                startActivity(myintent2);

            }
        });
        button2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent myintent2 = new Intent(engineering.this, eng_rem.class);
                startActivity(myintent2);

            }
        });

    }

}
