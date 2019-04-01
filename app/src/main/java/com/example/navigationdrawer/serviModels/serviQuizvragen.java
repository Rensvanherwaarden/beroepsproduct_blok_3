package com.example.navigationdrawer.serviModels;

public class serviQuizvragen {
    public String Quizvraag;
    public String Antwoordoptie1;
    public String Antwoordoptie2;
    public String Antwoordoptie3;
    public String Antwoordoptie4;
    public String Antwoordoptie5;

    public serviQuizvragen(String Quizvraag, String Antwoordoptie1, String Antwoordoptie2,
                           String Antwoordoptie3, String Antwoordoptie4, String Antwoordoptie5){
        this.Quizvraag = Quizvraag;
        this.Antwoordoptie1 = Antwoordoptie1;
        this.Antwoordoptie2 = Antwoordoptie2;
        this.Antwoordoptie3 = Antwoordoptie3;
        this.Antwoordoptie4 = Antwoordoptie4;
        this.Antwoordoptie5 = Antwoordoptie5;
    }
    public String getQuizvraag() {
        return Quizvraag;
    }

    public void setQuizvraag(String quizvraag) {
        Quizvraag = quizvraag;
    }

    public String getAntwoordoptie1() {
        return Antwoordoptie1;
    }

    public void setAntwoordoptie1(String antwoordoptie1) {
        Antwoordoptie1 = antwoordoptie1;
    }

    public String getAntwoordoptie2() {
        return Antwoordoptie2;
    }

    public void setAntwoordoptie2(String antwoordoptie2) {
        Antwoordoptie2 = antwoordoptie2;
    }

    public String getAntwoordoptie3() {
        return Antwoordoptie3;
    }

    public void setAntwoordoptie3(String antwoordoptie3) {
        Antwoordoptie3 = antwoordoptie3;
    }

    public String getAntwoordoptie4() {
        return Antwoordoptie4;
    }

    public void setAntwoordoptie4(String antwoordoptie4) {
        Antwoordoptie4 = antwoordoptie4;
    }

    public String getAntwoordoptie5() {
        return Antwoordoptie5;
    }

    public void setAntwoordoptie5(String antwoordoptie5) {
        Antwoordoptie5 = antwoordoptie5;
    }
}
