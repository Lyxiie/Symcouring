package com.apps.ridhamad.symcouring;

public class datamodel {
    int image;
    String header, desc, date;

    public datamodel(int image, String header, String desc, String date) {
        this.image = image;
        this.header = header;
        this.desc = desc;
        this.date = date;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
