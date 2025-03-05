package com.example.kresy;public class kresy {
    private String nazwa;
    private String data;
    private int sila;
    private int idObrazka;
    private int powiadomieni;

    public kresy(String nazwa, String data, int sila, int idObrazka) {
        this.nazwa = nazwa;
        this.data = data;
        this.sila = sila;
        this.idObrazka = idObrazka;
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

    public void setPowiadomieni(int powiadomieni) {
        this.powiadomieni = powiadomieni;
    }

    @Override
    public String toString() {
        return nazwa;
    }
}
