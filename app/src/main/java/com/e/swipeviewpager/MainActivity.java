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
        sao.add(new Ensiklopedia.Character("Kirigaya Kazuto", "17 Tahun","Kirigaya Kazuto (桐ヶ谷 和人), born as Narusaka Kazuto (鳴坂 和人なるさか かずと, Narusaka Kazuto, and known as Kirito (キリト, Kirito?) in «Sword Art Online» (SAO), «ALfheim Online» (ALO), «Gun Gale Online» (GGO), and «Project Alicization», is the protagonist of the main Sword Art Online series."));
        sao.add(new Ensiklopedia.Character("Yuuki Asuna", "18 Tahun", "Yuuki Asuna (結城 明日奈), known as Asuna (アスナ) in \\n«Sword Art Online» (SAO)\\n«ALfheim Online» (ALO)\\n\\nas well as «Project Alicization», where she had temporarily used the Stacia (ステイシア) account, is the main heroine of the Sword Art Online series[5], the deuteragonist of the Aincrad Arc, as well as the protagonist of the Mother's Rosario side story. She is the daughter of the former CEO of RECT Inc.. Asuna was one of the 10,000 players trapped in «Sword Art Online», where she was the sub-leader of the «Knights of the Blood» (KoB) guild."));
        sao.add(new Ensiklopedia.Character("Alice Zuberg", "19 Tahun", "Alice Zuberg (アリス・ツーベルク,) is one of the main characters in the Alicization Arc. She is the daughter of Rulid Village's chief Gasupht Zuberg, as well as the childhood friend of Eugeo and Kirito. Due to accidentally breaking a clause of the Taboo Index in her childhood, Alice was apprehended by Deusolbert Synthesis Seven and taken to the Central Cathedral, where she was forced to become an Integrity Knight, named Alice Synthesis Thirty (アリス・シンセシス・サーティ), with her memories sealed."));

        ArrayList<Ensiklopedia.Character> theIrregular = new ArrayList<>();
        theIrregular.add(new Ensiklopedia.Character("Shiba Tatsuya", "18 Tahun", "Shiba Tatsuya (司波 達也) is the main protagonist of The Irregular in Magic High School. He enrolled at the National Magic University Affiliated First High School in April 2095 with his younger sister, Miyuki (深雪).\nHe was accepted as one of the students to be placed in the Course 2 curriculum, marking the start of the series events.\nIn his second year, he transferred into the newly-created Magic Engineering Course."));
        theIrregular.add(new Ensiklopedia.Character("Shiba Miyuki", "17 Tahun", "Shiba Miyuki (司波 深雪) is the main female protagonist of the \"The Irregular in Magic High School\" light novel and animated series.\nShe is the biological sister of the main protagonist, Shiba Tatsuya and just like him, is a student of First High School."));


        ArrayList<Ensiklopedia.Character> haiToGen = new ArrayList<>();
        haiToGen.add(new Ensiklopedia.Character( "Haruhiro", "17 Tahun", " gw Haruhiro"));
        haiToGen.add(new Ensiklopedia.Character("Manato", "17 Tahun", "gw Manato"));


        ensiKlo.add(new Ensiklopedia("The irregular school", theIrregular));
        ensiKlo.add(new Ensiklopedia("Sword Art Online", sao));
        ensiKlo.add(new Ensiklopedia("Hai to gensou no grimgar", haiToGen));
        //ensiKlo.add(new Ensiklopedia("Golden Time", "Tada"));
    }


}