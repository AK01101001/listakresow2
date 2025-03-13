package com.example.kres;

import java.util.ArrayList;

public class Irepozytorium {
    public static ArrayList<kres> kresL;
    public static void dodaj()
    {
        kresL = new ArrayList<>();
        kresL.add(new kres("Ovatrax","nieznana",1,4,R.drawable.ovathrax));
        kresL.add(new kres("Port city","nieznana",0,3,R.drawable.portcity));
    }
    public static ArrayList<kres> getkresyatkategoria(int i) {
        ArrayList<kres> wybrane =
                new ArrayList<>();
        for (com.example.kres.kres kres : kresL) {
            if (kres.getKategoria()==i) {
                wybrane.add(kres);
            }
        }
        return wybrane;
    }
    public static ArrayList<kres> getprzepisyatid(int i) {
        ArrayList<kres> wybrane =
                new ArrayList<>();
        for (kres przepisik : kresL) {
            if (przepisik.getId() == i) {
                wybrane.add(przepisik);
            }
        }
        return wybrane;
    }
}
