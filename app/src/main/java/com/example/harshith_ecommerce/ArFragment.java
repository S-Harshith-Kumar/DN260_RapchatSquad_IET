package com.example.harshith_ecommerce;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class ArFragment extends Fragment {

    public ArFragment() {
        // Required empty public constructor
    }

    private TextView arViewOne;
    private TextView arViewTwo;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = LayoutInflater.from(getContext()).inflate(R.layout.fragment_ar,null);

        arViewOne = view.findViewById(R.id.tv_ar_1);
        arViewTwo = view.findViewById(R.id.tv_ar_2);

        arViewOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent arIntent = new Intent(getContext(), ArProduct1Activity.class);
                getContext().startActivity(arIntent);
            }
        });
        arViewTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent arIntent = new Intent(getContext(), ArProductt2Activity.class);
                getContext().startActivity(arIntent);
            }
        });


        return view;
    }
}
