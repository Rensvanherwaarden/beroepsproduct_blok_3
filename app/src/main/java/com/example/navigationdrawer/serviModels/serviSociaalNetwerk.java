package com.example.navigationdrawer.serviModels;

public class serviSociaalNetwerk {
    String SNID;
    String SNNaam;
    String SNVoorwaarde;
    String SNBeschrijving;

    /**
     * De constructor wordt gebruikt om object te maken.
     *
     * @param SNID : De ID van het sociale netwerk.
     * @param SNNaam: De naam van het betreffende sociale netwerk
     * @param SNVoorwaarde: De voorwaarde die moet staan om voorgesteld te worden
     * @param SNBeschrijving: De beschrijving van het sociale netwerk
     */

    public serviSociaalNetwerk(String SNID, String SNNaam, String SNVoorwaarde, String SNBeschrijving){
this.SNID= SNID;
this.SNNaam= SNNaam;
this.SNVoorwaarde = SNVoorwaarde;
this.SNBeschrijving = SNBeschrijving;
    }

    /**
     *
     * Accessor voor de eigenschappen SNID & SNNaam
     * @return de ID en de naam van het sociale netwerk
     *
     */


    public String getSNID() {
        return SNID;
    }

    public void setSNID(String SNID) {
        this.SNID = SNID;
    }

    public String getSNNaam() {
        return SNNaam;
    }

    public void setSNNaam(String SNNaam) {
        this.SNNaam = SNNaam;
    }

    public String getSNVoorwaarde() {
        return SNVoorwaarde;
    }

    public void setSNVoorwaarde(String SNVoorwaarde) {
        this.SNVoorwaarde = SNVoorwaarde;
    }

    public String getSNBeschrijving() {
        return SNBeschrijving;
    }

    public void setSNBeschrijving(String SNBeschrijving) {
        this.SNBeschrijving = SNBeschrijving;
    }
}
