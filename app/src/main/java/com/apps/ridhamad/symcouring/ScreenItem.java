package com.apps.ridhamad.symcouring;

//Tanggal Pengerjaan : 15 April 2022 - 8 Mei 2022
//        Nim : 10119251
//        Nama : Muhamad Ridwan
//        Kelas :IF6

public class ScreenItem {

    String Title,Description;
    int ScreenImg;

    public ScreenItem(String title, String description, int screenImg) {
        Title = title;
        Description = description;
        ScreenImg = screenImg;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public void setScreenImg(int screenImg) {
        ScreenImg = screenImg;
    }

    public String getTitle() {
        return Title;
    }

    public String getDescription() {
        return Description;
    }

    public int getScreenImg() {
        return ScreenImg;
    }
}
