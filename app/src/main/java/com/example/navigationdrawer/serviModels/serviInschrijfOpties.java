package com.example.navigationdrawer.serviModels;

public class serviInschrijfOpties {
    public String Inschrijfoptie;
    public String OptieBeschrijving;

    public serviInschrijfOpties(String inschrijfoptie, String optieBeschrijving) {
        Inschrijfoptie = inschrijfoptie;
        OptieBeschrijving = optieBeschrijving;
    }

    public String getInschrijfoptie() {
        return Inschrijfoptie;
    }

    public void setInschrijfoptie(String inschrijfoptie) {
        Inschrijfoptie = inschrijfoptie;
    }

    public String getOptieBeschrijving() {
        return OptieBeschrijving;
    }

    public void setOptieBeschrijving(String optieBeschrijving) {
        OptieBeschrijving = optieBeschrijving;
    }
}
