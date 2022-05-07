package com.apps.ridhamad.symcouring;

//Tanggal Pengerjaan : 15 April 2022 - 8 Mei 2022
//        Nim : 10119251
//        Nama : Muhamad Ridwan
//        Kelas :IF6

public class MainModel {
    Integer langLogo;
    String langName;
    String langDesc;

    public MainModel(Integer langLogo, String langName, String langDesc) {
        this.langLogo = langLogo;
        this.langName = langName;
        this.langDesc = langDesc;
    }

    public Integer getLangLogo() {
        return langLogo;
    }

    public String getLangName() {
        return langName;
    }

    public String getLangDesc() {
        return langDesc;
    }
}
