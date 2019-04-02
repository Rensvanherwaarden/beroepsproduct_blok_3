package com.example.navigationdrawer.modelRens;

public class RensEvent {

    private String EvenementNaam;
    private String EvenementBeschrijving;
    private String EvenementDatum;


    public RensEvent(String naam, String beschrijving, String Datum) {

        this.EvenementNaam = naam;
        this.EvenementBeschrijving = beschrijving;
        this.EvenementDatum = Datum;
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

