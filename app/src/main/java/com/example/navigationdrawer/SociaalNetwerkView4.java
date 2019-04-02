package com.example.navigationdrawer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.navigationdrawer.serviModels.serviSociaalNetwerk;

public class SociaalNetwerkView4 extends AppCompatActivity {
    serviSociaalNetwerk sn1 = new  serviSociaalNetwerk("1", "De Biervaten", "Biertap");
    serviSociaalNetwerk sn2 = new  serviSociaalNetwerk("2", "De Dansers", "Dansvloer");
    serviSociaalNetwerk sn3 = new  serviSociaalNetwerk("3", "De Toiletbezoekers", "WC");
    serviSociaalNetwerk sn4 = new  serviSociaalNetwerk("4", "De Ouders", "Ouders");
    serviSociaalNetwerk sn5 = new  serviSociaalNetwerk("5", "De Maatjesmannen", "Vrienden");
    serviSociaalNetwerk sn6 = new  serviSociaalNetwerk("6", "Automaniaccen", "Auto");
    serviSociaalNetwerk sn7 = new  serviSociaalNetwerk("7", "Huizenhouders", "Huis");
    serviSociaalNetwerk sn8 = new  serviSociaalNetwerk("8", "Vakantiegangers", "Vakantie");
    serviSociaalNetwerk sn9 = new  serviSociaalNetwerk("9", "Gamers", "Spelcomputer");
    serviSociaalNetwerk sn10 = new  serviSociaalNetwerk("10", "Potentiele miljonairs", "Miljonair");
    serviSociaalNetwerk sn11 = new  serviSociaalNetwerk("11", "De Hamsteraars", "Hamster");
    serviSociaalNetwerk sn12 = new  serviSociaalNetwerk("12", "De Waterratten", "Zwemmen");
    serviSociaalNetwerk sn13 = new  serviSociaalNetwerk("13", "De Nieuwslezers", "Telegraaf");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_sociaal_netwerk_4);
        Intent i = getIntent();
        TextView tekst12TextView = (TextView) findViewById(R.id.tekst12TextView);
        TextView tekst13TextView = (TextView) findViewById(R.id.tekst13TextView);

        // Als de intent die meegestuurd word een Extra heeft worden textview 4,10 & 12 aangepast naar de meegestuurde data.
        if (i.hasExtra("ExtraStringGekozenNetwerk")) {
            tekst12TextView.setText(i.getStringExtra("ExtraStringGekozenNetwerk"));
        }
        if(tekst12TextView.getText().toString().contains(sn2.getSNNaam())) {
            tekst13TextView.setText(sn1.getSNVoorwaarde());
        }
        if(tekst12TextView.getText().toString().contains(sn3.getSNNaam())) {
            tekst13TextView.setText(sn1.getSNVoorwaarde());
        }
        if(tekst12TextView.getText().toString().contains(sn4.getSNNaam())) {
            tekst13TextView.setText(sn1.getSNVoorwaarde());
        }
        if(tekst12TextView.getText().toString().contains(sn5.getSNNaam())) {
            tekst13TextView.setText(sn1.getSNVoorwaarde());

        }  if(tekst12TextView.getText().toString().contains(sn6.getSNNaam())) {
            tekst13TextView.setText(sn1.getSNVoorwaarde());

        }  if(tekst12TextView.getText().toString().contains(sn7.getSNNaam())) {
            tekst13TextView.setText(sn1.getSNVoorwaarde());

        }  if(tekst12TextView.getText().toString().contains(sn8.getSNNaam())) {
            tekst13TextView.setText(sn1.getSNVoorwaarde());

        }  if(tekst12TextView.getText().toString().contains(sn9.getSNNaam())) {
            tekst13TextView.setText(sn1.getSNVoorwaarde());

        }  if(tekst12TextView.getText().toString().contains(sn10.getSNNaam())) {
            tekst13TextView.setText(sn1.getSNVoorwaarde());

        }  if(tekst12TextView.getText().toString().contains(sn11.getSNNaam())) {
            tekst13TextView.setText(sn1.getSNVoorwaarde());

        } if(tekst12TextView.getText().toString().contains(sn12.getSNNaam())) {
            tekst13TextView.setText(sn1.getSNVoorwaarde());

        } if(tekst12TextView.getText().toString().contains(sn13.getSNNaam())) {
            tekst13TextView.setText(sn1.getSNVoorwaarde());
        }







    }
}
