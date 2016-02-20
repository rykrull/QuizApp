package com.example.rkrul.quizapp;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class playActivity extends AppCompatActivity
        implements PicQuestion.OnFragmentInteractionListener, TxtQuestion.OnFragmentInteractionListener{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);
        getFragmentManager()
                .beginTransaction()
                .replace(R.id.main_fragment_container, PicQuestion.newInstance())
                .addToBackStack(null)
                .commit();
    }

    public void onFragmentInteraction(Uri uri){
        //you can leave it empty
    }


}
