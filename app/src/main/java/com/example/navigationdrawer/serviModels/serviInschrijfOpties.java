package com.example.navigationdrawer.serviModels;

public class serviInschrijfOpties extends Inschrijfoptie {
    public String OptieBeschrijving;

    public serviInschrijfOpties(String Inschrijfoptie , String optieBeschrijving) {
        this.OptieBeschrijving = optieBeschrijving;
        this.Inschrijfoptie = Inschrijfoptie;
    }

    public String getOptieBeschrijving() {
        return OptieBeschrijving;
    }

    public void setOptieBeschrijving(String optieBeschrijving) {
        OptieBeschrijving = optieBeschrijving;
    }
}
