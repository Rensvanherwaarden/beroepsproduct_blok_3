package com.example.navigationdrawer.serviModels;

public class serviSociaalNetwerk {
    String SNID;
    String SNNaam;

    /**
     * De constructor wordt gebruikt om object te maken.
     *
     * @param SNID : De ID van het sociale netwerk.
     * @param SNNaam: De naam van het betreffende sociale netwerk
     *
     */

    public serviSociaalNetwerk(String SNID, String SNNaam){
this.SNID= SNID;
this.SNNaam= SNNaam;
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
}
