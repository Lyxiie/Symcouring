package com.apps.ridhamad.symcouring;

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
