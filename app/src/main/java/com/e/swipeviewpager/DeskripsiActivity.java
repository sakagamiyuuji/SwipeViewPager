package com.e.swipeviewpager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class DeskripsiActivity extends AppCompatActivity{

    TextView deskrip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deskripsi);

        Ensiklopedia.Character character = getIntent().getParcelableExtra("character");
        String text = character.getDes();
        deskrip = findViewById(R.id.tv_des);
        deskrip.setText(text);


    }

}