package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    TextView t1,t2,t3,t4,t5,t6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        t1=findViewById(R.id.x);
        t2=findViewById(R.id.o);
        t3=findViewById(R.id.x2);

        Animation animation = AnimationUtils.loadAnimation(this,R.anim.topanim);
        t1.startAnimation(animation);
        t2.startAnimation(animation);
        t3.startAnimation(animation);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(MainActivity.this,home.class));
                finish();
            }
        },5000);
    }
}