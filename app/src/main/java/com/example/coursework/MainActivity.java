package com.example.coursework;

import android.app.NotificationManager;
import android.content.Intent;
import android.os.Handler;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
//variables declared
public static int TIME_OUT = 2000;
public static final String CHANNEL_ID = "notification_channel";
public static final int NOTIFICATION_ID = 001;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//once the activity has loaded it will change the activity to the launch activity
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, launch.class);
                startActivity(intent);
                finish();
            }
        }, TIME_OUT);
    }
}
