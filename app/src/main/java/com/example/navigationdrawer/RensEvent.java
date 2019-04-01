package com.example.navigationdrawer;

public class RensEvent {
    private String Evenementid;
    private String EvenementNaam;
    private String EvenementBeschrijving;
    private String EvenementDatum;


    public RensEvent(String id, String naam, String beschrijving, String Datum) {
        this.Evenementid = id;
        this.EvenementNaam = naam;
        this.EvenementBeschrijving = beschrijving;
        this.EvenementDatum = Datum;
    }

    public String getEvenementid() {
        return Evenementid;
    }

    public void setEvenementid(String evenementid) {
        Evenementid = evenementid;
    }

    public String getEvenementNaam() {
        return EvenementNaam;
    }

    public String getEvenementDatum() {
        return EvenementDatum;
    }

    public String getEvenementBeschrijving() {
        return EvenementBeschrijving;
    }

    public void setEvenementBeschrijving(String evenementBeschrijving) {
        EvenementBeschrijving = evenementBeschrijving;
    }

    public void setEvenementDatum(String evenementDatum) {
        EvenementDatum = evenementDatum;
    }

    public void setEvenementNaam(String evenementNaam) {
        EvenementNaam = evenementNaam;
    }


}

