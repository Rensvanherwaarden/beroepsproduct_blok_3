package com.example.navigationdrawer;

public class RensClient {
    private String id;
    private String naam;


    public RensClient(String id,String naam) {
        this.naam = naam;
        this.id = id;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getWoongroep() {
        return id;
    }

    public void setWoongroep(String woongroep) {
        this.id = woongroep;
    }


    @Override
    public String toString() {
        return naam;
    }
}
