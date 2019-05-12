package com.example.coursework;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Maths extends AppCompatActivity {


    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maths);

        // Gives buttons identifiers linked to their Id
        Button button1 = (Button) findViewById(R.id.algebra);
        Button button2 = (Button) findViewById(R.id.to_do1);

        //When button " " is clicked it will go to " " activity

        button1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent myintent2 = new Intent(Maths.this, Algebra.class);
                startActivity(myintent2);

            }
        });
        button2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent myintent2 = new Intent(Maths.this, Reminders2.class);
                startActivity(myintent2);

            }
        });
//

    }

}
