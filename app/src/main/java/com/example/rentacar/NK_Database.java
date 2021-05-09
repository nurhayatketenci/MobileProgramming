package com.example.rentacar;

import java.util.ArrayList;

public  class NK_Database {
    static ArrayList<NK_CAR> nk_mycars=new ArrayList<>();

    public static ArrayList<NK_CAR> getNk_mycars() {
        return nk_mycars;
    }

    public static void setNk_mycars(ArrayList<NK_CAR> nk_mycars) {
        NK_Database.nk_mycars = nk_mycars;
    }


}
