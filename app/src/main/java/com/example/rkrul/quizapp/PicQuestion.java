package com.example.rkrul.quizapp;

import android.content.Context;
import android.net.Uri;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link PicQuestion.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link PicQuestion#newInstance} factory method to
 * create an instance of this fragment.
 */
public class PicQuestion extends Fragment {
    Button submit;
    EditText answer;

    private OnFragmentInteractionListener mListener;

    public PicQuestion() {
        // Required empty public constructor
    }


    public static PicQuestion newInstance() {
        PicQuestion fragment = new PicQuestion();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_pic_question, container, false);
        submit = (Button)view.findViewById(R.id.button4);
        answer = (EditText)view.findViewById(R.id.editText);
        return view;
    }


    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        //TA Implementation

        //different way of implementing click interaction.
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                String str = answer.getText().toString().toLowerCase();
                boolean correct = false;
                if (str.equals("tiger")){
                    correct = true;
                }
                getFragmentManager()
                        .beginTransaction()
                        .replace(R.id.main_fragment_container, TxtQuestion.newInstance(correct))
                        .addToBackStack(null)
                        .commit();
            }
        });
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p/>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
