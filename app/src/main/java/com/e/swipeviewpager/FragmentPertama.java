package com.e.swipeviewpager;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentPertama extends Fragment {

    ListView lvAnime;
    private ArrayList<Ensiklopedia.Character> dataSet;



    public static FragmentPertama newInstance(String datass){
        FragmentPertama fragmentPertama = new FragmentPertama();

        Bundle arguments = new Bundle();
        arguments.putString("data" , datass);
        fragmentPertama.setArguments(arguments);
        return fragmentPertama;
    }

    //BUG in first tab
    /*public static FragmentPertama newInstance(ArrayList<Ensiklopedia.Character> dataSett){
        FragmentPertama fragmentPertama = new FragmentPertama();
        dataSet= dataSett;
        return fragmentPertama;
    }*/


    public FragmentPertama() {
        // Required empty public constructor
    }

    public void getData(ArrayList<Ensiklopedia.Character> dataSett){
        this.dataSet = dataSett;
    }

    private TextView textData;
    private ListView listView;

    public void cek(){
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent next = new Intent(getActivity(), DeskripsiActivity.class);
                next.putExtra("character", adapter.getItem(position));
                startActivity(next);
                //Toast.makeText(getActivity(), String.valueOf(position), Toast.LENGTH_LONG).show();
            }
        });
    }

    CostumListAdapter adapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.pertama_fragment, container, false);
        adapter = new CostumListAdapter(getActivity(), dataSet);

        listView =  rootView.findViewById(R.id.lv_anime);
        listView.setAdapter(adapter);
        cek();

        //textData = rootView.findViewById(R.id.lv_anime);
        //textData.setText(getArguments().getString("data"));
        return rootView;
    }

    public void desActivity(){

    }



}
