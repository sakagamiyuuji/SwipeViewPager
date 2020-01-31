package com.e.swipeviewpager;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


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


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.pertama_fragment, container, false);
    }

}
