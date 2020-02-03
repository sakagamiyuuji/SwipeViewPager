package com.e.swipeviewpager;

import android.content.ClipData;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CostumListAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<Ensiklopedia.Character> characters;

    public CostumListAdapter(Context context, ArrayList<Ensiklopedia.Character> characters){
        this.context = context;
        this.characters = characters;
    }


    @Override
    public int getCount() {
        return characters.size();
    }

    @Override
    public Object getItem(int position) {
        return characters.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null){
            convertView = LayoutInflater.from(context).
                    inflate(R.layout.layout_lv, parent, false);
        }

        Ensiklopedia.Character currentItem = characters.get(position);
        //bisa langsung getItem(position)

        TextView nama = convertView.findViewById(R.id.nama);
        TextView umur = convertView.findViewById(R.id.umur);

        nama.setText(currentItem.getNama());
        umur.setText(currentItem.getUmur());

        return convertView;
    }
}
