package com.example.rkrul.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;

public class Question2 extends AppCompatActivity {

    private CheckBox check1;
    private CheckBox check2;
    private CheckBox check3;
    private CheckBox check4;
    private CheckBox check5;
    private boolean correctness;
    private Bundle extras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question2);
        check1 = (CheckBox)findViewById(R.id.checkBox);
        check2 = (CheckBox)findViewById(R.id.checkBox2);
        check3 = (CheckBox)findViewById(R.id.checkBox3);
        check4 = (CheckBox)findViewById(R.id.checkBox4);
        check5 = (CheckBox)findViewById(R.id.checkBox5);
        correctness = false;
        extras = getIntent().getExtras();

    }

    public void submit2Pressed(View view){
        if (check2.isChecked() && check5.isChecked() && !check1.isChecked() && !check3.isChecked()
                && !check4.isChecked()) {
            correctness = true;
        }
        Intent playIntent = new Intent("com.example.rkrul.quizapp.Results");
        playIntent.putExtra("message1",extras.getBoolean("message1"));
        playIntent.putExtra("message2",correctness);
        startActivity(playIntent);
    }

}
