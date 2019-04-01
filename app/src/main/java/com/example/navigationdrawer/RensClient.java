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

    public String getClient() {
        return id;
    }

    public void setClient(String client) {
        this.id = client;
    }


    @Override
    public String toString() {
        return naam;
    }
}
