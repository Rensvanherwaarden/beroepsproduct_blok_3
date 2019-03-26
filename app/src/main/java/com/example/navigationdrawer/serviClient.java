package com.example.navigationdrawer;

public class serviClient {
    private String naam;
    private String woongroep;

    public serviClient(String naam, String woongroep) {
        this.naam = naam;
        this.woongroep = woongroep;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getWoongroep() {
        return woongroep;
    }

    public void setWoongroep(String woongroep) {
        this.woongroep = woongroep;
    }


    @Override
    public String toString() {
        return naam;
    }
}
