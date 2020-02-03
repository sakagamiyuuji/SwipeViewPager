package com.e.swipeviewpager;

import java.util.ArrayList;

public class Ensiklopedia {

    private String judulAnime, mainChar;
    private ArrayList<Character> data;

    public static class Character{
        private String nama;
        private String umur;

        public Character(String nama, String umur){
            this.nama = nama;
            this.umur = umur;
        }

        public String getNama() {
            return nama;
        }

        public String getUmur() {
            return umur;
        }
    }



    public Ensiklopedia(String judulAnime, ArrayList<Character> data){
        this.judulAnime = judulAnime;
        this.data = data;
    }

    public String getJudulAnime() {
        return judulAnime;
    }

    public ArrayList<Character> getData() {
        return data;
    }


}
