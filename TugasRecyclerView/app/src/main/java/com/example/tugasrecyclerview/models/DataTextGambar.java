package com.example.tugasrecyclerview.models;

public class DataTextGambar {

    public String namaMobil;
    public int urutanMobil;

    public int getUrutanMobil() {
        return urutanMobil;
    }

    public void setUrutanMobil(int urutanMobil) {
        this.urutanMobil = urutanMobil;
    }

    public String getNamaMobil() {
        return namaMobil;
    }

    public void setNamaMobil(String namaMobil) {
        this.namaMobil = namaMobil;
    }

    public DataTextGambar(int urutanMobil,String namaMobil) {
        this.namaMobil = namaMobil;
        this.urutanMobil = urutanMobil;
    }
}
