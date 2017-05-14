package com.creativeerror.finalproject;

/**
 * Created by User on 14/05/2017.
 */

public class Model {
    String namaIndo;
    String namaEng;
    int gambar;

    public Model(int gambar, String namaIndo, String namaEng){
        this.namaIndo=namaIndo;
        this.namaEng=namaEng;
        this.gambar=gambar;

    }

    public String getNamaIndo() {
        return namaIndo;
    }

    public void setNamaIndo(String namaIndo) {
        this.namaIndo = namaIndo;
    }

    public String getNamaEng() {
        return namaEng;
    }

    public void setNamaEng(String namaEng) {
        this.namaEng = namaEng;
    }

    public int getGambar() {
        return gambar;
    }

    public void setGambar(int gambar) {
        this.gambar = gambar;
    }}
