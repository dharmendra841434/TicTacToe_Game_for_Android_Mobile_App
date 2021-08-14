package com.example.tictactoe;

import androidx.annotation.DrawableRes;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class home extends AppCompatActivity implements View.OnClickListener {

    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,reset,exit,t1,t2;
    String startgame = "x";
    int xcount=0;
    int ocount=0;
    int t,d;
    boolean checker;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        b1=findViewById(R.id.one);
        b1.setOnClickListener(this);
        b2=findViewById(R.id.two);
        b2.setOnClickListener(this);
        b3=findViewById(R.id.three);
        b3.setOnClickListener(this);
        b4=findViewById(R.id.four);
        b4.setOnClickListener(this);
        b5=findViewById(R.id.five);
        b5.setOnClickListener(this);
        b6=findViewById(R.id.six);
        b6.setOnClickListener(this);
        b7=findViewById(R.id.seven);
        b7.setOnClickListener(this);
        b8=findViewById(R.id.eight);
        b8.setOnClickListener(this);
        b9=findViewById(R.id.nine);
        b9.setOnClickListener(this);
        t1=findViewById(R.id.plx);
        t2 =findViewById(R.id.plo);
        reset=findViewById(R.id.resetbtn);
        reset.setOnClickListener(this);
        exit=findViewById(R.id.exitbtn);
        exit.setOnClickListener(this);




    }
    private void rest()
    {
        b1.setEnabled(true);
        b2.setEnabled(true);
        b3.setEnabled(true);
        b4.setEnabled(true);
        b5.setEnabled(true);
        b6.setEnabled(true);
        b7.setEnabled(true);
        b8.setEnabled(true);
        b9.setEnabled(true);

        b1.setText("");
        b2.setText("");
        b3.setText("");
        b4.setText("");
        b5.setText("");
        b6.setText("");
        b7.setText("");
        b8.setText("");
        b9.setText("");

        b1.setBackgroundColor(Color.parseColor("#ffffff"));
        b2.setBackgroundColor(Color.parseColor("#ffffff"));
        b3.setBackgroundColor(Color.parseColor("#ffffff"));
        b4.setBackgroundColor(Color.parseColor("#ffffff"));
        b5.setBackgroundColor(Color.parseColor("#ffffff"));
        b6.setBackgroundColor(Color.parseColor("#ffffff"));
        b7.setBackgroundColor(Color.parseColor("#ffffff"));
        b8.setBackgroundColor(Color.parseColor("#ffffff"));
        b9.setBackgroundColor(Color.parseColor("#ffffff"));

    }

    private  void gamescore()
    {
        t1.setText(String.valueOf(xcount));
        t2.setText(String.valueOf(ocount));

    }
    private void choose()
    {

        if(startgame.equalsIgnoreCase("x"))
        {
            startgame="0";
        }
        else
        {
            startgame="x";
        }

    }
    private void wingame()
    {
        String s1= (String) b1.getText();
        String s2= (String) b2.getText();
        String s3= (String) b3.getText();
        String s4= (String) b4.getText();
        String s5= (String) b5.getText();
        String s6= (String) b6.getText();
        String s7= (String) b7.getText();
        String s8= (String) b8.getText();
        String s9= (String) b9.getText();

        if(s1=="x" && s2=="x" && s3=="x")
        {
            b1.setBackgroundColor(Color.parseColor("#29F704"));
            b2.setBackgroundColor(Color.parseColor("#29F704"));
            b3.setBackgroundColor(Color.parseColor("#29F704"));
            AlertDialog alertDialog = new AlertDialog.Builder(this)
                    .setMessage("PlayerX is Winner")
                    .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            rest();
                        }
                    }).show();


            xcount++;
            gamescore();

        }
        if(s4=="x" && s5=="x" && s6=="x")
        {
            b4.setBackgroundColor(Color.parseColor("#29F704"));
            b5.setBackgroundColor(Color.parseColor("#29F704"));
            b6.setBackgroundColor(Color.parseColor("#29F704"));

            AlertDialog alertDialog = new AlertDialog.Builder(this)
                    .setMessage("PlayerX is Winner")
                    .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            rest();
                        }
                    }).show();

            xcount++;
            gamescore();

        }
        if(s7=="x" && s8=="x" && s9=="x")
        {
            b7.setBackgroundColor(Color.parseColor("#29F704"));
            b8.setBackgroundColor(Color.parseColor("#29F704"));
            b9.setBackgroundColor(Color.parseColor("#29F704"));
            AlertDialog alertDialog = new AlertDialog.Builder(this)
                    .setMessage("PlayerX is Winner")
                    .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            rest();
                        }
                    }).show();
            xcount++;
            gamescore();

        }
        if(s1=="x" && s4=="x" && s7=="x")
        {
            b1.setBackgroundColor(Color.parseColor("#29F704"));
            b4.setBackgroundColor(Color.parseColor("#29F704"));
            b7.setBackgroundColor(Color.parseColor("#29F704"));
            AlertDialog alertDialog = new AlertDialog.Builder(this)
                    .setMessage("PlayerX is Winner")
                    .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            rest();
                        }
                    }).show();
            xcount++;
            gamescore();

        }
        if(s2=="x" && s5=="x" && s8=="x")
        {
            b2.setBackgroundColor(Color.parseColor("#29F704"));
            b5.setBackgroundColor(Color.parseColor("#29F704"));
            b8.setBackgroundColor(Color.parseColor("#29F704"));
            AlertDialog alertDialog = new AlertDialog.Builder(this)
                    .setMessage("PlayerX is Winner")
                    .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            rest();
                        }
                    }).show();
            xcount++;
            gamescore();

        }
        if(s3=="x" && s6=="x" && s9=="x")
        {
            b3.setBackgroundColor(Color.parseColor("#29F704"));
            b6.setBackgroundColor(Color.parseColor("#29F704"));
            b9.setBackgroundColor(Color.parseColor("#29F704"));
            AlertDialog alertDialog = new AlertDialog.Builder(this)
                    .setMessage("PlayerX is Winner")
                    .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            rest();
                        }
                    }).show();
            xcount++;
            gamescore();

        }
        if(s1=="x" && s5=="x" && s9=="x")
        {
            b1.setBackgroundColor(Color.parseColor("#29F704"));
            b5.setBackgroundColor(Color.parseColor("#29F704"));
            b9.setBackgroundColor(Color.parseColor("#29F704"));
            AlertDialog alertDialog = new AlertDialog.Builder(this)
                    .setMessage("PlayerX is Winner")
                    .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            rest();
                        }
                    }).show();
            xcount++;
            gamescore();

        }
        if(s3=="x" && s5=="x" && s7=="x")
        {
            b3.setBackgroundColor(Color.parseColor("#29F704"));
            b5.setBackgroundColor(Color.parseColor("#29F704"));
            b7.setBackgroundColor(Color.parseColor("#29F704"));
            AlertDialog alertDialog = new AlertDialog.Builder(this)
                    .setMessage("PlayerX is Winner")
                    .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            rest();
                        }
                    }).show();
            xcount++;
            gamescore();

        }
        if(s1=="0" && s2=="0" && s3=="0")
        {
            b1.setBackgroundColor(Color.parseColor("#F704C2"));
            b2.setBackgroundColor(Color.parseColor("#F704C2"));
            b3.setBackgroundColor(Color.parseColor("#F704C2"));
            AlertDialog alertDialog = new AlertDialog.Builder(this)
                    .setMessage("PlayerO is Winner")
                    .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            rest();
                        }
                    }).show();
            ocount++;
            gamescore();

        }
        if(s4=="0" && s5=="0" && s6=="0")
        {
            b4.setBackgroundColor(Color.parseColor("#F704C2"));
            b5.setBackgroundColor(Color.parseColor("#F704C2"));
            b6.setBackgroundColor(Color.parseColor("#F704C2"));
            AlertDialog alertDialog = new AlertDialog.Builder(this)
                    .setMessage("PlayerO is Winner")
                    .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            rest();
                        }
                    }).show();
            ocount++;
            gamescore();

        }
        if(s7=="0" && s8=="0" && s9=="0")
        {
            b7.setBackgroundColor(Color.parseColor("#F704C2"));
            b8.setBackgroundColor(Color.parseColor("#F704C2"));
            b9.setBackgroundColor(Color.parseColor("#F704C2"));
            AlertDialog alertDialog = new AlertDialog.Builder(this)
                    .setMessage("PlayerO is Winner")
                    .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            rest();
                        }
                    }).show();
            ocount++;
            gamescore();

        }
        if(s1=="0" && s4=="0" && s7=="0")
        {
            b1.setBackgroundColor(Color.parseColor("#F704C2"));
            b4.setBackgroundColor(Color.parseColor("#F704C2"));
            b7.setBackgroundColor(Color.parseColor("#F704C2"));
            AlertDialog alertDialog = new AlertDialog.Builder(this)
                    .setMessage("PlayerO is Winner")
                    .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            rest();
                        }
                    }).show();
            ocount++;
            gamescore();

        }
        if(s2=="0" && s5=="0" && s8=="0")
        {
            b2.setBackgroundColor(Color.parseColor("#F704C2"));
            b5.setBackgroundColor(Color.parseColor("#F704C2"));
            b8.setBackgroundColor(Color.parseColor("#F704C2"));
            AlertDialog alertDialog = new AlertDialog.Builder(this)
                    .setMessage("PlayerO is Winner")
                    .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            rest();
                        }
                    }).show();
            ocount++;
            gamescore();

        }
        if(s3=="0" && s6=="0" && s9=="0")
        {
            b3.setBackgroundColor(Color.parseColor("#F704C2"));
            b6.setBackgroundColor(Color.parseColor("#F704C2"));
            b9.setBackgroundColor(Color.parseColor("#F704C2"));
            AlertDialog alertDialog = new AlertDialog.Builder(this)
                    .setMessage("PlayerO is Winner")
                    .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            rest();
                        }
                    }).show();
            ocount++;
            gamescore();

        }
        if(s1=="0" && s5=="0" && s9=="0")
        {
            b1.setBackgroundColor(Color.parseColor("#F704C2"));
            b5.setBackgroundColor(Color.parseColor("#F704C2"));
            b9.setBackgroundColor(Color.parseColor("#F704C2"));
            AlertDialog alertDialog = new AlertDialog.Builder(this)
                    .setMessage("PlayerO is Winner")
                    .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            rest();
                        }
                    }).show();
            ocount++;
            gamescore();

        }
        if(s3=="0" && s5=="0" && s7=="0")
        {
            b3.setBackgroundColor(Color.parseColor("#F704C2"));
            b5.setBackgroundColor(Color.parseColor("#F704C2"));
            b7.setBackgroundColor(Color.parseColor("#F704C2"));
            AlertDialog alertDialog = new AlertDialog.Builder(this)
                    .setMessage("PlayerO is Winner")
                    .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            rest();
                        }
                    }).show();
            ocount++;
            gamescore();

        }

    }

    @Override
    public void onClick(View view) {

        switch (view.getId())
        {
            case R.id.one:
                b1.setText(startgame);
                if(startgame.equalsIgnoreCase("x"))
                {
                    checker = false;
                }
                else
                {
                    checker = true;
                }
                choose();
                wingame();
                break;
            case R.id.two:
                b2.setText(startgame);
                if(startgame.equalsIgnoreCase("x"))
                {
                    checker = false;
                }
                else
                {
                    checker = true;
                }
                choose();
                wingame();
                break;
            case R.id.three:
                b3.setText(startgame);
                if(startgame.equalsIgnoreCase("x"))
                {
                    checker = false;
                }
                else
                {
                    checker = true;
                }
                choose();
                wingame();
                break;
            case R.id.four:
                b4.setText(startgame);
                if(startgame.equalsIgnoreCase("x"))
                {
                    checker = false;
                }
                else
                {
                    checker = true;
                }
                choose();
                wingame();
                break;
            case R.id.five:
                b5.setText(startgame);
                if(startgame.equalsIgnoreCase("x"))
                {
                    checker = false;
                }
                else
                {
                    checker = true;
                }
                choose();
                wingame();
                break;
            case R.id.six:
                b6.setText(startgame);
                if(startgame.equalsIgnoreCase("x"))
                {
                    checker = false;
                }
                else
                {
                    checker = true;
                }
                choose();
                wingame();
                break;
            case R.id.seven:
                b7.setText(startgame);
                if(startgame.equalsIgnoreCase("x"))
                {
                    checker = false;
                }
                else
                {
                    checker = true;
                }
                choose();
                wingame();
                break;
            case R.id.eight:
                b8.setText(startgame);
                if(startgame.equalsIgnoreCase("x"))
                {
                    checker = false;
                }
                else
                {
                    checker = true;
                }
                choose();
                wingame();
                break;
            case R.id.nine:
                b9.setText(startgame);
                if(startgame.equalsIgnoreCase("x"))
                {
                    checker = false;
                }
                else
                {
                    checker = true;
                }
                choose();
                wingame();
                break;
            case R.id.resetbtn:
                rest();

                break;
            case R.id.exitbtn:

                AlertDialog alertDialog = new AlertDialog.Builder(this)
                        .setMessage("Are You Sure To Exit")
                        .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                finish();
                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                d=1;
                            }
                        }).show();

                if(d==1)
                {
                    rest();}
                break;
        }

    }
}