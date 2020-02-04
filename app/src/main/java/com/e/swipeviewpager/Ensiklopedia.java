package com.e.swipeviewpager;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;

public class Ensiklopedia {

    private String judulAnime;
    private ArrayList<Character> data;

    public static class Character implements Parcelable {
        private String nama;
        private String umur;
        private String des;

        public Character(String nama, String umur, String des){
            this.nama = nama;
            this.umur = umur;
            this.des = des;
        }

        public String getNama() {
            return nama;
        }

        public String getUmur() {
            return umur;
        }

        public String getDes(){
            return des;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.nama);
            dest.writeString(this.umur);
            dest.writeString(this.des);
        }

        public Character(){

        }

        protected Character(Parcel in){
            this.nama = in.readString();
            this.umur = in.readString();
            this.des = in.readString();
        }

        public static final Parcelable.Creator<Character> CREATOR = new Parcelable.Creator<Character>(){

            @Override
            public Character createFromParcel(Parcel source) {
                return new Character(source);
            }

            @Override
            public Character[] newArray(int size) {
                return new Character[size];
            }
        };
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
