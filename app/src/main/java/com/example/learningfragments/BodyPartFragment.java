package com.example.learningfragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


/**
 * A simple {@link Fragment} subclass.
 */
public class BodyPartFragment extends Fragment
{

    public BodyPartFragment()
    {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
        Bundle savedInstanceState)
    {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_body_part, container, false);
        ImageView body_part = (ImageView) rootView.findViewById(R.id.body_part);
        body_part.setImageResource(AndroidImageAssets.getHeads().get(0));
        return rootView;
    }

}
