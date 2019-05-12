package com.example.coursework;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.io.File;
import java.util.ArrayList;
import static android.widget.Toast.LENGTH_SHORT;

public class Courses extends AppCompatActivity {


        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);

            setContentView(R.layout.activity_courses);
            Button button1 = (Button) findViewById(R.id.Computer_Sci);
            Button button2 = (Button) findViewById(R.id.Maths);
            Button button3 = (Button) findViewById(R.id.Engineering);
//When button " " is clicked it will go to " " activity

            button1.setOnClickListener(new View.OnClickListener() {

                public void onClick(View v) {
                    Intent myintent2 = new Intent(Courses.this,Computer_science.class);
                    startActivity(myintent2);

                }
            });
            button2.setOnClickListener(new View.OnClickListener() {

                public void onClick(View v) {
                    Intent myintent2 = new Intent(Courses.this, Maths.class);
                    startActivity(myintent2);

                }
            });
            button3.setOnClickListener(new View.OnClickListener() {

                public void onClick(View v) {
                    Intent myintent2 = new Intent(Courses.this, engineering.class);
                    startActivity(myintent2);
                }
            });


        }
}
