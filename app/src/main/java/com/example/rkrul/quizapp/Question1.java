package com.example.rkrul.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

/**
 * Created by rkrul on 2/18/2016.
 */
public class Question1 extends AppCompatActivity {

    private EditText answer;
    private boolean correctness;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question1);
        answer = (EditText)findViewById(R.id.editText);
        correctness = false;
    }

    public void submit1Pressed(View view){
        if (answer.getText().toString().equals("tiger")) {
            correctness = true;
        }
        Intent playIntent = new Intent("com.example.rkrul.quizapp.Question2");
        playIntent.putExtra("message1",correctness);
        startActivity(playIntent);
    }
}
