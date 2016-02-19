package com.example.rkrul.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by rkrul on 2/18/2016.
 */
public class Results extends AppCompatActivity {

    private TextView question1;
    private TextView question2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.results);
        Bundle extras = getIntent().getExtras();
        question1 = (TextView)findViewById(R.id.textView6);
        question2 = (TextView)findViewById(R.id.textView8);
        if (extras.getBoolean("message1")){
            question1.setText("Correct");
        } else{
            question1.setText("Incorrect");
        }
        if (extras.getBoolean("message2")){
            question2.setText("Correct");
        } else{
            question2.setText("Incorrect");
        }
    }

    public void quitPressed(View view){
        Intent start = new Intent(this,MainActivity.class);
        startActivity(start);
    }

    public void restartPressed(View view){
        Intent start = new Intent("com.example.rkrul.quizapp.Question1");
        startActivity(start);
    }

}
