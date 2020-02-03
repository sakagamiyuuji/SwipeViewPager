package com.e.swipeviewpager;


import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import android.os.Bundle;
import com.google.android.material.tabs.TabLayout;
import java.util.ArrayList;
import android.widget.ArrayAdapter;

public class MainActivity extends AppCompatActivity {

    public boolean isFragmentDisplayed = false;
    public static String STATE_FRAGMENT = "state_fragment";
    private ViewPager viewPager;
    private AdapterVP adapterVP;
    private TabLayout tabMenu;

    ArrayList<String> menuTitleData = new ArrayList<>();
    ArrayList<String> data = new ArrayList<>();
    ArrayList<Ensiklopedia> ensiKlo = new ArrayList<>();




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        generateTitle();
        generateDate();
        ensiklopedia();


        //implement view pager
        viewPager = findViewById(R.id.pager_fragment);
        //adapterVP = AdapterVP.newInstance(getSupportFragmentManager(), menuTitleData, data);
        adapterVP = AdapterVP.newInstance(getSupportFragmentManager(), ensiKlo);
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

    private void ensiklopedia(){

        ArrayList<Ensiklopedia.Character> sao = new ArrayList<>();
        sao.add(new Ensiklopedia.Character("Kirigaya Kazuto", "17 Tahun"));
        sao.add(new Ensiklopedia.Character("Yuuki Asuna", "18 Tahun"));
        sao.add(new Ensiklopedia.Character("Alice Zuberg", "19 Tahun"));

        ArrayList<Ensiklopedia.Character> haiToGen = new ArrayList<>();
        haiToGen.add(new Ensiklopedia.Character("Haruhiro", "17 Tahun"));
        haiToGen.add(new Ensiklopedia.Character("Manato", "17 Tahun"));

        ArrayList<Ensiklopedia.Character> theIrregular = new ArrayList<>();
        theIrregular.add(new Ensiklopedia.Character("Shiba Miyuki", "17 Tahun"));
        theIrregular.add(new Ensiklopedia.Character("Shiba Tatsuya", "18 Tahun"));


        ensiKlo.add(new Ensiklopedia("Sword Art Online", sao));
        ensiKlo.add(new Ensiklopedia("The irregular school", theIrregular));
        ensiKlo.add(new Ensiklopedia("Hai to gensou no grimgar", haiToGen));
        //ensiKlo.add(new Ensiklopedia("Golden Time", "Tada"));
    }

}