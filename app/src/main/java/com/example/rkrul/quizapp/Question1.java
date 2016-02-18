package com.example.rkrul.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by rkrul on 2/18/2016.
 */
public class Question1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question1);
    }

    public void submit1Pressed(View view){
        Intent playIntent = new Intent("com.example.rkrul.quizapp.Question2");
        startActivity(playIntent);
    }
}
