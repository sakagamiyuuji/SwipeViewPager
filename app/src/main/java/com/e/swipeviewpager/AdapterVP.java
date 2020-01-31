package com.e.swipeviewpager;

import android.widget.AdapterView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.ArrayList;


//Fragment adapter merupakan abstrac class, tidak bisa langsung di buat objek
//harus di implementasikan terlebih dahulu
public class AdapterVP extends FragmentStatePagerAdapter {

    private static ArrayList<String> myTitles;
    private static ArrayList<String> myData;

    private static int numOfItem;

    public static AdapterVP newInstance(FragmentManager fragmentManager, ArrayList<String> titles, ArrayList<String> datas){
        AdapterVP adapterVP = new AdapterVP(fragmentManager);
        myTitles = titles;
        myData = datas;
        numOfItem = datas.size(); //set numOfItem as size of data or titles
        return adapterVP;
    }

    //buat constructor
    public AdapterVP(FragmentManager fm) {
        super(fm);
    }


    @Override
    public Fragment getItem(int position) {
        FragmentPertama fragmentPertama = new FragmentPertama();
        FragmentKedua fragmentKedua = new FragmentKedua();
        Fragment item = null;

        switch(position){
            case 0:
                item = fragmentPertama;
                break;
            //return fragmentPertama;
            case 1:
                item = fragmentKedua;
                break;
            //return fragmentKedua;
            default:
                item = fragmentPertama;
                break;
        }
        return item;
    }

    @Override
    public int getCount() {
        //jumlah berapa fragment
        return numOfItem;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String title = myTitles.get(position);
        return title;

        /*CharSequence title;
        switch (position){
            case 0:
                title = "Rimuru";
                break;
            case 1:
                title = "Slime";
                break;
            default:
                title = "KOPLAK";
        }
        return title;*/
    }
}