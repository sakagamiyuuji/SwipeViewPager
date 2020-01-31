package com.e.swipeviewpager;


import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import android.os.Bundle;
import com.google.android.material.tabs.TabLayout;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public boolean isFragmentDisplayed = false;
    public static String STATE_FRAGMENT = "state_fragment";
    private ViewPager viewPager;
    private AdapterVP adapterVP;
    private TabLayout tabMenu;

    ArrayList<String> menuTitleData = new ArrayList<>();
    ArrayList<String> data = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        generateTitle();
        generateDate();

        //implement view pager
        viewPager = findViewById(R.id.pager_fragment);
        adapterVP = AdapterVP.newInstance(getSupportFragmentManager(), menuTitleData, data);
        
        //adapterVP = new AdapterVP(getSupportFragmentManager());

        viewPager.setAdapter(adapterVP);

        tabMenu = findViewById(R.id.menu);
        tabMenu.setupWithViewPager(viewPager);

    }

    private void generateTitle(){
        menuTitleData.add("Promo");
        menuTitleData.add("Paket Hemat");
        menuTitleData.add("Minuman");
        menuTitleData.add("Desert");
        menuTitleData.add("Syalalalal");
    }

    private void generateDate(){
        data.add("data 1");
        data.add("data 2");
        data.add("data 3");
        data.add("data 4");
        data.add("data 5");
    }
}