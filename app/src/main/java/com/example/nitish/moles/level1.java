package com.example.nitish.moles;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Toast;
import java.util.Timer;
import java.util.TimerTask;
import android.os.Handler;
import android.os.CountDownTimer;



public class level1 extends AppCompatActivity {

    int a,b, score=0;// life=10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_level1);

        // all widget declarations here:

        final ImageView iv1 = (ImageView)findViewById(R.id.imageView5);
        final ImageView iv2 = (ImageView)findViewById(R.id.iv2);
        final ImageView iv3 = (ImageView)findViewById(R.id.ev3);
        final ImageView iv4 = (ImageView)findViewById(R.id.iv4);
        final ImageView iv5 = (ImageView)findViewById(R.id.iv5);
        final ImageView iv6 = (ImageView)findViewById(R.id.iv6);
        final ImageView iv7 = (ImageView)findViewById(R.id.iv7);
        final ImageView iv8 = (ImageView)findViewById(R.id.iv8);
        final ImageView iv9 = (ImageView)findViewById(R.id.iv9);

        final TextView tv2 = (TextView)findViewById(R.id.textView2);
        final TextView tv3 = (TextView)findViewById(R.id.textView3);

        final Button b1 = (Button)findViewById(R.id.b1);
        final Button b2 = (Button)findViewById(R.id.b2);
        final Button b3 = (Button)findViewById(R.id.b3);
        final Button b4 = (Button)findViewById(R.id.b4);
        final Button b5 = (Button)findViewById(R.id.b5);
        final Button b6 = (Button)findViewById(R.id.b6);
        final Button b7 = (Button)findViewById(R.id.b7);
        final Button b8 = (Button)findViewById(R.id.b8);
        final Button b9 = (Button)findViewById(R.id.b9);

        Button b13 = (Button)findViewById(R.id.button13);  // back button from game
        b13.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
                {
                    // Code here executes on main thread after user presses button
                    Intent home = new Intent(level1.this, homePage.class);
                    startActivity(home);
                    finish();
                }
        });

        /*  make all moles visible at beginning
        iv1.setVisibility(View.INVISIBLE);
        iv2.setVisibility(View.INVISIBLE);
        iv3.setVisibility(View.INVISIBLE);
        iv4.setVisibility(View.INVISIBLE);
        iv5.setVisibility(View.INVISIBLE);
        iv6.setVisibility(View.INVISIBLE);
        iv7.setVisibility(View.INVISIBLE);
        iv8.setVisibility(View.INVISIBLE);
        iv9.setVisibility(View.INVISIBLE);
        */


        Thread t = new Thread(){
            @Override
            public void run(){
                while(!isInterrupted()) {
                    try {
                        Thread.sleep(1300);  //control the speed of moles here..
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {

                                // for specific period add the action to be performed

                                iv1.setVisibility(View.INVISIBLE);
                                iv2.setVisibility(View.INVISIBLE);
                                iv3.setVisibility(View.INVISIBLE);
                                iv4.setVisibility(View.INVISIBLE);
                                iv5.setVisibility(View.INVISIBLE);
                                iv6.setVisibility(View.INVISIBLE);
                                iv7.setVisibility(View.INVISIBLE);
                                iv8.setVisibility(View.INVISIBLE);
                                iv9.setVisibility(View.INVISIBLE);

                                int a = (int) (Math.random() * 10);
                                if (a == 0) {
                                    b = 1;
                                } else {
                                    b = a;
                                }

                                //tv2.setText(String.valueOf(life));

                                switch (b) {

                                    case 1:
                                        iv1.setVisibility(View.VISIBLE);
                                        b1.setOnClickListener(new View.OnClickListener() {

                                            public void onClick(View v) {
                                                if (v.equals(b1)) {
                                                    iv1.setImageResource(R.drawable.dead);
                                                    score++;
                                                } else {
                                                    //life--;
                                                    score--;
                                                    //iv1.setVisibility(View.INVISIBLE);
                                                }
                                            }
                                        });
                                        iv1.setImageResource(R.drawable.mole4);
                                        break;

                                    case 2:
                                        iv2.setVisibility(View.VISIBLE);
                                        b2.setOnClickListener(new View.OnClickListener() {

                                            public void onClick(View v) {
                                                if (v.equals(b2)) {
                                                    iv2.setImageResource(R.drawable.dead);
                                                    score++;
                                                } else {
                                                    //life--;
                                                    score--;
                                                    //iv2.setVisibility(View.INVISIBLE);
                                                }
                                            }
                                        });
                                        iv2.setImageResource(R.drawable.mole4);
                                        break;

                                    case 3:
                                        iv3.setVisibility(View.VISIBLE);
                                        b3.setOnClickListener(new View.OnClickListener() {

                                            public void onClick(View v) {
                                                if (v.equals(b3)) {
                                                    iv3.setImageResource(R.drawable.dead);
                                                    score++;
                                                } else {
                                                    //life--;
                                                    score--;
                                                    //iv3.setVisibility(View.INVISIBLE);
                                                }
                                            }
                                        });
                                        iv3.setImageResource(R.drawable.mole4);
                                        break;

                                    case 4:
                                        iv4.setVisibility(View.VISIBLE);
                                        b4.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                if (v.equals(b4)) {
                                                    iv4.setImageResource(R.drawable.dead);
                                                    score++;
                                                } else {
                                                    //life--;
                                                    score--;
                                                    //iv4.setVisibility(View.INVISIBLE);
                                                }
                                            }
                                        });
                                        iv4.setImageResource(R.drawable.mole4);
                                        break;

                                    case 5:
                                        iv5.setVisibility(View.VISIBLE);
                                        b5.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                if (v.equals(b5)) {
                                                    iv5.setImageResource(R.drawable.dead);
                                                    score++;
                                                } else {
                                                    //life--;
                                                    score--;
                                                    //iv5.setVisibility(View.INVISIBLE);
                                                }
                                            }
                                        });
                                        iv5.setImageResource(R.drawable.mole4);
                                        break;

                                    case 6:
                                        iv6.setVisibility(View.VISIBLE);
                                        b6.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                if (v.equals(b6)) {
                                                    iv6.setImageResource(R.drawable.dead);
                                                    score++;
                                                } else {
                                                    //life--;
                                                    score--;
                                                    //iv6.setVisibility(View.INVISIBLE);
                                                }
                                            }
                                        });
                                        iv6.setImageResource(R.drawable.mole4);
                                        break;

                                    case 7:
                                        iv7.setVisibility(View.VISIBLE);
                                        b7.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                if (v.equals(b7)) {
                                                    iv7.setImageResource(R.drawable.dead);
                                                    score++;
                                                } else {
                                                    //life--;
                                                    score--;
                                                    //iv7.setVisibility(View.INVISIBLE);
                                                }
                                            }
                                        });
                                        iv7.setImageResource(R.drawable.mole4);
                                        break;

                                    case 8:
                                        iv8.setVisibility(View.VISIBLE);
                                        b8.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                if (v.equals(b8)) {
                                                    iv8.setImageResource(R.drawable.dead);
                                                    score++;
                                                } else {
                                                    //life--;
                                                    score--;
                                                    //iv8.setVisibility(View.INVISIBLE);
                                                }
                                            }
                                        });
                                        iv8.setImageResource(R.drawable.mole4);
                                        break;

                                    case 9:
                                        iv9.setVisibility(View.VISIBLE);
                                        b9.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                if (v.equals(b9)) {
                                                    iv9.setImageResource(R.drawable.dead);
                                                    score++;
                                                } else {
                                                    //life--;
                                                    score--;
                                                    //iv9.setVisibility(View.INVISIBLE);
                                                }
                                            }
                                        });
                                        iv9.setImageResource(R.drawable.mole4);
                                        break;


                                }

                                tv3.setText(String.valueOf(score));

                            }
                        });
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        t.start();

    }
}
