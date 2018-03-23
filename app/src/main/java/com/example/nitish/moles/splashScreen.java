package com.example.nitish.moles;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class splashScreen extends AppCompatActivity {

    private static int SPLASH_TIME_OUT = 1400;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_splash_screen);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run(){
                Intent home = new Intent(splashScreen.this, homePage.class);
                startActivity(home);
                finish();
            }
        },SPLASH_TIME_OUT);
    }
}
