package com.example.rkrul.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Question2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question2);
    }

    public void submit2Pressed(View view){
        Intent playIntent = new Intent("com.example.rkrul.quizapp.Results");
        startActivity(playIntent);
    }

}
