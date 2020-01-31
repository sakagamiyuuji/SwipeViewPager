package com.e.swipeviewpager;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    public boolean isFragmentDisplayed = false;
    public static String STATE_FRAGMENT = "state_fragment";
    private ViewPager viewPager;
    private AdapterVP adapterVP;
    private TabLayout tabMenu;
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //implement view pager
        viewPager = findViewById(R.id.pager_fragment);
        adapterVP = new AdapterVP(getSupportFragmentManager());
        viewPager.setAdapter(adapterVP);
        tabMenu = findViewById(R.id.menu);
        tabMenu.setupWithViewPager(viewPager);

    }

    //Fragment adapter merupakan abstrac class, tidak bisa langsung di buat objek
    //harus di implementasikan terlebih dahulu

    public class AdapterVP extends FragmentStatePagerAdapter{

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
            return 11;
        }

        @Nullable
        @Override
        public CharSequence getPageTitle(int position) {
            CharSequence title;
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
            return title;
        }
    }
}