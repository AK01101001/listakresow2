package com.example.kres;

import java.util.ArrayList;

public class Irepozytorium {
    public static ArrayList<kresy> kresyL;
    public static void dodaj()
    {
        kresyL = new ArrayList<>();
        kresyL.add(new kresy("Ovatrax","nieznana","sztuczny",4,R.drawable.ovathrax));
        kresyL.add(new kresy("Port city","nieznana","naturalny",3,R.drawable.portcity));
    }
    public static ArrayList<kresy> getprzepisyatkategoria(String i) {
        ArrayList<kresy> wybrane =
                new ArrayList<>();
        for (kresy przepisik : kresyL) {
            if (przepisik.getKategoria().equals(i)) {
                wybrane.add(przepisik);
            }
        }
        return wybrane;
    }
    public static ArrayList<kresy> getprzepisyatid(int i) {
        ArrayList<kresy> wybrane =
                new ArrayList<>();
        for (kresy przepisik : kresyL) {
            if (przepisik.getId() == i) {
                wybrane.add(przepisik);
            }
        }
        return wybrane;
    }
}
