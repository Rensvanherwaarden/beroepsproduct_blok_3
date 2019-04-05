package com.example.navigationdrawer.serviViews;
import com.example.navigationdrawer.R;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.navigationdrawer.serviModels.serviSociaalNetwerk;

import org.w3c.dom.Text;

public class SociaalNetwerkView4 extends AppCompatActivity {
    serviSociaalNetwerk sn1 = new serviSociaalNetwerk("1", "De Biervaten", "Biertap", "Het sociale netwerk 'De Biervaten' krijg jij voorgesteld omdat je bij vraag 1 'Biertap' hebt ingevuld. ");
    serviSociaalNetwerk sn2 = new serviSociaalNetwerk("2", "De Dansers", "Dansvloer", "Het sociale netwerk 'De Dansers' krijg jij voorgesteld omdat je bij vraag 1 'Dansvloer' hebt ingevuld.");
    serviSociaalNetwerk sn3 = new serviSociaalNetwerk("3", "De Toiletbezoekers", "WC", "Het sociale netwerk 'De Toiletbezoekers' krijg jij voorgesteld omdat je bij vraag 1 'WC' hebt ingevuld.");
    serviSociaalNetwerk sn4 = new serviSociaalNetwerk("4", "De Ouders", "Ouders", "Het sociale netwerk 'De Ouders' krijg jij voorgesteld omdat je bij vraag 1 'Ouders' hebt ingevuld.");
    serviSociaalNetwerk sn5 = new serviSociaalNetwerk("5", "De Maatjesmannen", "Vrienden", "Het sociale netwerk 'De Maatjesmannen' krijg jij voorgesteld omdat je bij vraag 1 'Vrienden' hebt ingevuld.");
    serviSociaalNetwerk sn6 = new serviSociaalNetwerk("6", "Automaniaccen", "Auto", "Het sociale netwerk 'Automaniaccen' krijg jij voorgesteld omdat je bij vraag 2 'Auto' hebt ingevuld.");
    serviSociaalNetwerk sn7 = new serviSociaalNetwerk("7", "Huizenhouders", "Huis", "Het sociale netwerk 'Huizenhouders' krijg jij voorgesteld omdat je bij vraag 2 'Huis' hebt ingevuld.");
    serviSociaalNetwerk sn8 = new serviSociaalNetwerk("8", "Vakantiegangers", "Vakantie", "Het sociale netwerk 'Vakantiegangers' krijg jij voorgesteld omdat je bij vraag 2 'Vakantie' hebt ingevuld.");
    serviSociaalNetwerk sn9 = new serviSociaalNetwerk("9", "Gamers", "Spelcomputer", "Het sociale netwerk 'Gamers' krijg jij voorgesteld omdat je bij vraag 2 'Spelcomputer' hebt ingevuld.");
    serviSociaalNetwerk sn10 = new serviSociaalNetwerk("10", "Potentiele miljonairs", "Miljonair", "Het sociale netwerk 'Potentiele Miljonairs' krijg jij voorgesteld omdat je bij vraag 3 'Miljonair' hebt ingevuld.");
    serviSociaalNetwerk sn11 = new serviSociaalNetwerk("11", "De Hamsteraars", "Hamster", "Het sociale netwerk 'De Hamsteraars' krijg jij voorgesteld omdat je bij vraag 4 'Hamster' hebt ingevuld.");
    serviSociaalNetwerk sn12 = new serviSociaalNetwerk("12", "De Waterratten", "Zwemmen", "Het sociale netwerk 'De Waterratten' krijg jij voorgesteld omdat je bij vraag 5 'Zwemmen' hebt ingevuld.");
    serviSociaalNetwerk sn13 = new serviSociaalNetwerk("13", "De Nieuwslezers", "Telegraaf", "Het sociale netwerk 'De Nieuwslezers' krijg jij voorgesteld omdat je bij vraag 7 'Telegraaf of Nu' hebt ingevuld.");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_sociaal_netwerk_4);
        TextView tekst13TextView = (TextView) findViewById(R.id.tekst13TextView);
        TextView tekst14TextView = (TextView) findViewById(R.id.tekst14TextView);

        Intent i = getIntent();

        // Als de intent die meegestuurd word een Extra heeft worden textview 4,10 & 12 aangepast naar de meegestuurde data.
        if (i.hasExtra("ExtraStringInfooversn")) {
            // Textview4 word veranderd naar welke naam er is ingevuld bij de MainActivity in spinner2
            tekst13TextView.setText(i.getStringExtra("ExtraStringInfooversn"));
        }

        if (tekst13TextView.getText().toString().contains(sn1.getSNNaam())) {
            tekst14TextView.setText(sn1.getSNBeschrijving());
        }
        if (tekst13TextView.getText().toString().contains(sn2.getSNNaam())) {
            tekst14TextView.setText(sn2.getSNBeschrijving());
        }
        if (tekst13TextView.getText().toString().contains(sn3.getSNNaam())) {
            tekst14TextView.setText(sn3.getSNBeschrijving());
        }
        if (tekst13TextView.getText().toString().contains(sn4.getSNNaam())) {
            tekst14TextView.setText(sn4.getSNBeschrijving());
        }
        if (tekst13TextView.getText().toString().contains(sn5.getSNNaam())) {
            tekst14TextView.setText(sn5.getSNBeschrijving());
        }
        if (tekst13TextView.getText().toString().contains(sn6.getSNNaam())) {
            tekst14TextView.setText(sn6.getSNBeschrijving());
        }
        if (tekst13TextView.getText().toString().contains(sn7.getSNNaam())) {
            tekst14TextView.setText(sn7.getSNBeschrijving());
        }
        if (tekst13TextView.getText().toString().contains(sn8.getSNNaam())) {
            tekst14TextView.setText(sn8.getSNBeschrijving());
        }
        if (tekst13TextView.getText().toString().contains(sn9.getSNNaam())) {
            tekst14TextView.setText(sn9.getSNBeschrijving());
        }
        if (tekst13TextView.getText().toString().contains(sn10.getSNNaam())) {
            tekst14TextView.setText(sn10.getSNBeschrijving());
        }
        if (tekst13TextView.getText().toString().contains(sn11.getSNNaam())) {
            tekst14TextView.setText(sn11.getSNBeschrijving());
        }
        if (tekst13TextView.getText().toString().contains(sn12.getSNNaam())) {
            tekst14TextView.setText(sn12.getSNBeschrijving());
        }
        if (tekst13TextView.getText().toString().contains(sn13.getSNNaam())) {
            tekst14TextView.setText(sn13.getSNBeschrijving());
        }

    }
}
