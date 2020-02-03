package com.e.swipeviewpager;


import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentPertama extends Fragment {

    ListView lvAnime;
    private static ArrayList<Ensiklopedia.Character> dataSet;
    private Context context;


    public static FragmentPertama newInstance(String datass){
        FragmentPertama fragmentPertama = new FragmentPertama();

        Bundle arguments = new Bundle();
        arguments.putString("data" , datass);
        fragmentPertama.setArguments(arguments);
        return fragmentPertama;
    }

    public static FragmentPertama newInstance(ArrayList<Ensiklopedia.Character> dataSett){
        FragmentPertama fragmentPertama = new FragmentPertama();
        dataSet= dataSett;
        return fragmentPertama;
    }


    public FragmentPertama() {
        // Required empty public constructor
    }

    private TextView textData;
    private ListView listView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.pertama_fragment, container, false);
        CostumListAdapter adapter = new CostumListAdapter(getActivity(), dataSet);

        listView =  rootView.findViewById(R.id.lv_anime);
        listView.setAdapter(adapter);

        //textData = rootView.findViewById(R.id.lv_anime);
        //textData.setText(getArguments().getString("data"));
        return rootView;
    }

}
