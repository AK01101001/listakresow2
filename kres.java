package com.example.kres;
public class kres {
    private String nazwa;
    private String data;
    private int id;
    private int kategoria;
    private int sila;
    private int idObrazka;
    private int powiadomieni;
    private static int licznik;


    public int getId() {
        return id;
    }

    public int getKategoria() {
        return kategoria;
    }

    public kres(String nazwa, String data, int kategoria, int sila, int idObrazka) {
        this.nazwa = nazwa;
        this.data = data;
        this.kategoria = kategoria;
        this.sila = sila;
        this.idObrazka = idObrazka;
        this.id = licznik;
        licznik++;
    }

    public String getNazwa() {
        return nazwa;
    }

    public String getData() {
        return data;
    }

    public int getSila() {
        return sila;
    }

    public int getIdObrazka() {
        return idObrazka;
    }

    public int getPowiadomieni() {
        return powiadomieni;
    }

    public void addPowiadomieni() {
        this.powiadomieni++;
    }

    @Override
    public String toString() {
        return nazwa;
    }
}
