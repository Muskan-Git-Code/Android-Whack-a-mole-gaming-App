package com.example.whackamolegame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity{

    ImageButton s[];
    ImageButton i1, i2, i3, i4, i5, i6, i7, i8, i9;

    TextView tv1, tv2;
    MediaPlayer m1, m2;
    int ix, score=0;
    CountDownTimer ct;
    Random rand;

    Integer resource[];
    long disappear[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        i1= (ImageButton)findViewById(R.id.imageView);
        i2= (ImageButton)findViewById(R.id.imageView2);
        i3= (ImageButton)findViewById(R.id.imageView3);
        i4= (ImageButton)findViewById(R.id.imageView4);
        i5= (ImageButton)findViewById(R.id.imageView5);
        i6= (ImageButton)findViewById(R.id.imageView6);
        i7= (ImageButton)findViewById(R.id.imageView7);
        i8= (ImageButton)findViewById(R.id.imageView8);
        i9= (ImageButton)findViewById(R.id.imageView9);

        s=new ImageButton[9];
        s[0]=i1;
        s[1]=i2;
        s[2]=i3;
        s[3]=i4;
        s[4]=i5;
        s[5]=i6;
        s[6]=i7;
        s[7]=i8;
        s[8]=i9;

        tv1= (TextView)findViewById(R.id.textView);
        tv2= (TextView)findViewById(R.id.textView2);
        tv2.setText("Score: " + String.valueOf(score));

        m1= MediaPlayer.create(getApplicationContext(), R.raw.supermarioworld);
        m2= MediaPlayer.create(getApplicationContext(), R.raw.yoshi);
        m1.start();

        rand = new Random();
        ix= rand.nextInt(9);

        resource = new Integer[9];
        disappear = new long[9];

        for (int i = 0; i < s.length; i++) {
            s[i].setImageResource(R.drawable.moledown);
            s[i].setTag(R.drawable.moledown);
            resource[i] = (Integer) s[i].getTag();
        }

        timeStarter();


        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (resource[0] == R.drawable.moleup) {
                    i1.setImageResource(R.drawable.moledown);
                    i1.setTag(R.drawable.moledown);
                    resource[0] = (Integer) i1.getTag();
                    score++;

                    m2.start();
                }
                tv2.setText("Score: " + String.valueOf(score));
            }
        });
        i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (resource[1] == R.drawable.moleup) {
                    i2.setImageResource(R.drawable.moledown);
                    i2.setTag(R.drawable.moledown);
                    resource[1] = (Integer) i2.getTag();
                    score++;

                    m2.start();
                }
                tv2.setText("Score: " + String.valueOf(score));
            }
        });
        i3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (resource[2] == R.drawable.moleup) {
                    i3.setImageResource(R.drawable.moledown);
                    i3.setTag(R.drawable.moledown);
                    resource[2] = (Integer) i3.getTag();
                    score++;

                    m2.start();
                }
                tv2.setText("Score: " + String.valueOf(score));
            }
        });
        i4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (resource[3] == R.drawable.moleup) {
                    i4.setImageResource(R.drawable.moledown);
                    i4.setTag(R.drawable.moledown);
                    resource[3] = (Integer) i4.getTag();
                    score++;

                    m2.start();
                }
                tv2.setText("Score: " + String.valueOf(score));
            }
        });
        i5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (resource[4] == R.drawable.moleup) {
                    i5.setImageResource(R.drawable.moledown);
                    i5.setTag(R.drawable.moledown);
                    resource[4] = (Integer) i5.getTag();
                    score++;

                    m2.start();
                }
                tv2.setText("Score: " + String.valueOf(score));
            }
        });
        i6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (resource[5] == R.drawable.moleup) {
                    i6.setImageResource(R.drawable.moledown);
                    i6.setTag(R.drawable.moledown);
                    resource[5] = (Integer) i6.getTag();
                    score++;

                    m2.start();
                }
                tv2.setText("Score: " + String.valueOf(score));
            }
        });
        i7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (resource[6] == R.drawable.moleup) {
                    i7.setImageResource(R.drawable.moledown);
                    i7.setTag(R.drawable.moledown);
                    resource[6] = (Integer) i7.getTag();
                    score++;

                    m2.start();
                }
                tv2.setText("Score: " + String.valueOf(score));
            }
        });
        i8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (resource[7] == R.drawable.moleup) {
                    i8.setImageResource(R.drawable.moledown);
                    i8.setTag(R.drawable.moledown);
                    resource[7] = (Integer) i8.getTag();
                    score++;

                    m2.start();
                }
                tv2.setText("Score: " + String.valueOf(score));
            }
        });
        i9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (resource[8] == R.drawable.moleup) {
                    i9.setImageResource(R.drawable.moledown);
                    i9.setTag(R.drawable.moledown);
                    resource[8] = (Integer) i9.getTag();
                    score++;

                    m2.start();
                }
                tv2.setText("Score: " + String.valueOf(score));
            }
        });


    }

    public void timeStarter() {
        ct = new CountDownTimer(120*1000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                tv1.setText("Time Left: " + millisUntilFinished / 1000);
                for (int i = 0; i < disappear.length; i++) {
                    if (disappear[i] == millisUntilFinished / 1000) {
                        s[i].setImageResource(R.drawable.moledown);
                        s[i].setTag(R.drawable.moledown);
                        resource[i] = (Integer) s[i].getTag();
                    }
                }
                ix = rand.nextInt(9);
                while (resource[ix] == R.drawable.moleup) {
                    ix = rand.nextInt(9);
                }

                s[ix].setImageResource(R.drawable.moleup);
                s[ix].setTag(R.drawable.moleup);
                resource[ix] = (Integer) s[ix].getTag();

                if (millisUntilFinished / 1000 >= 2) {
                    disappear[ix] = millisUntilFinished / 1000 - 2;
                }
            }

            @Override
            public void onFinish() {
                tv1.setText("FINISH!");
                for (int i = 0; i < s.length; i++) {
                    s[i].setImageResource(R.drawable.moledown);
                }
                m2.release();
            }
        };
        ct.start();
    }

}