package com.example.nitish.moles;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class homePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_home_page);


        Button b2 = (Button)findViewById(R.id.button2); //help button

        b2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                Intent help = new Intent(homePage.this, helpPage.class);
                startActivity(help);
                finish();
            }

        });

        Button b = (Button)findViewById(R.id.button); //play button

        b.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                Intent level1 = new Intent(homePage.this, level1.class);
                startActivity(level1);
                finish();
            }

        });

    }
}
