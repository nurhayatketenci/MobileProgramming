package com.example.rentacar;

import android.graphics.Bitmap;

import java.io.Serializable;

public class NK_CAR implements Serializable {
     private String nk_carName;
     private int nk_modelYear;
     private Double nk_dailyPrice;
     private String nk_description;
     private String nk_brand;
     private String nk_radio_add;
     private String nk_checkbox_add;
     private String nk_color;
     private Bitmap nk_image;


    public NK_CAR(String nk_carName, String nk_radio_add,String nk_checkbox_add,int nk_modelYear, Double nk_dailyPrice, String nk_description, String nk_brand, String nk_color,Bitmap nk_image ){
        this.nk_carName = nk_carName;
        this.nk_modelYear = nk_modelYear;
        this.nk_dailyPrice = nk_dailyPrice;
        this.nk_description = nk_description;
        this.nk_brand = nk_brand;
        this.nk_color = nk_color;
        this.nk_image = nk_image;
        this.nk_radio_add=nk_radio_add;
        this.nk_checkbox_add=nk_checkbox_add;
    }
    public String getNk_checkbox_add() {
        return nk_checkbox_add;
    }

    public void setNk_checkbox_add(String nk_checkbox_add) {
        this.nk_checkbox_add = nk_checkbox_add;
    }
    public Bitmap getNk_image() {
        return nk_image;
    }

    public void setNk_image(Bitmap nk_image) {
        this.nk_image = nk_image;
    }
    public String getNk_radio_add() {
        return nk_radio_add;
    }

    public void setNk_radio_add(String nk_radio_add) {
        this.nk_radio_add = nk_radio_add;
    }
    public String getNk_carName() {
        return nk_carName;
    }

    public void setNk_carName(String nk_carName) {
        this.nk_carName = nk_carName;
    }

    public int getNk_modelYear() {
        return nk_modelYear;
    }

    public void setNk_modelYear(int nk_modelYear) {
        this.nk_modelYear = nk_modelYear;
    }

    public Double getNk_dailyPrice() {
        return nk_dailyPrice;
    }

    public void setNk_dailyPrice(Double nk_dailyPrice) {
        this.nk_dailyPrice = nk_dailyPrice;
    }

    public String getNk_description() {
        return nk_description;
    }

    public void setNk_description(String nk_description) {
        this.nk_description = nk_description;
    }

    public String getNk_brand() {
        return nk_brand;
    }

    public void setNk_brand(String nk_brand) {
        this.nk_brand = nk_brand;
    }

    public String getNk_color() {
        return nk_color;
    }

    public void setNk_color(String nk_color) {
        this.nk_color = nk_color;
    }





}
