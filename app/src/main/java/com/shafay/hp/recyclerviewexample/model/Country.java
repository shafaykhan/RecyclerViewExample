package com.shafay.hp.recyclerviewexample.model;

/**
 * Created by hp on 25/04/2020.
 */

public class Country {

    private int id;
    private String countryName;
    private int img;

    public Country(int id, String countryName, int img) {
        this.id = id;
        this.countryName = countryName;
        this.img = img;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
