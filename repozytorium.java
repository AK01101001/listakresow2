package com.example.kresy;

import java.util.ArrayList;

public class repozytorium {
    public static ArrayList<kresy> kresy;
    public static void dodaj()
    {
        kresy = new ArrayList<>();
        kresy.add(new kresy("Ovatrax","nieznana",4,R.drawable.ovathrax));
        kresy.add(new kresy("Port city","nieznana",3,R.drawable.portcity));
    }
}
