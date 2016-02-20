package com.example.rkrul.quizapp;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link TxtQuestion.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link TxtQuestion#newInstance} factory method to
 * create an instance of this fragment.
 */
public class TxtQuestion extends Fragment {

    private static final String ARG_PARAM1 = "param1";

    private boolean correct;
    private boolean correct2;

    private CheckBox check1;
    private CheckBox check2;
    private CheckBox check3;
    private CheckBox check4;
    private CheckBox check5;
    private Button submit;

    private OnFragmentInteractionListener mListener;

    public TxtQuestion() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @return A new instance of fragment TxtQuestion.
     */
    // TODO: Rename and change types and number of parameters
    public static TxtQuestion newInstance(boolean param1) {
        TxtQuestion fragment = new TxtQuestion();
        Bundle args = new Bundle();
        args.putBoolean(ARG_PARAM1, param1);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            correct = getArguments().getBoolean(ARG_PARAM1);
        }
        correct2 = false;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_txt_question, container, false);
        check1 = (CheckBox)view.findViewById(R.id.checkBox);
        check2 = (CheckBox)view.findViewById(R.id.checkBox2);
        check3 = (CheckBox)view.findViewById(R.id.checkBox3);
        check4 = (CheckBox)view.findViewById(R.id.checkBox4);
        check5 = (CheckBox)view.findViewById(R.id.checkBox5);
        submit = (Button)view.findViewById(R.id.button5);
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
                if (check2.isChecked() && check5.isChecked() && !check1.isChecked() && !check3.isChecked()
                        && !check4.isChecked()) {
                    correct2 = true;
                }
                Intent playIntent = new Intent(getActivity(), Results.class);
                playIntent.putExtra("message1",correct);
                playIntent.putExtra("message2",correct2);
                startActivity(playIntent);
            }
        });
    }

    public void submitPressed(View view) {
        if (check2.isChecked() && check5.isChecked() && !check1.isChecked() && !check3.isChecked()
                && !check4.isChecked()) {
            correct2 = true;
        }
        Intent playIntent = new Intent(getActivity(), Results.class);
        playIntent.putExtra("message1",correct);
        playIntent.putExtra("message2",correct2);
        startActivity(playIntent);
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
