package com.e.swipeviewpager;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentPertama extends Fragment {

    public static FragmentPertama newInstance(String datass){
        FragmentPertama fragmentPertama = new FragmentPertama();

        Bundle arguments = new Bundle();
        arguments.putString("data" , datass);
        fragmentPertama.setArguments(arguments);
        return fragmentPertama;
    }


    public FragmentPertama() {
        // Required empty public constructor
    }

    private TextView textData;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.pertama_fragment, container, false);
        textData = rootView.findViewById(R.id.tv_frag1);
        textData.setText(getArguments().getString("data"));
        return rootView;
    }

}
