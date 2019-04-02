package com.example.navigationdrawer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.navigationdrawer.serviModels.serviSociaalNetwerk;

public class SociaalNetwerkView2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_sociaal_netwerk_2);

        final TextView tekst4TextView = (TextView) findViewById(R.id.tekst4TextView);

        serviSociaalNetwerk sn1 = new serviSociaalNetwerk("1", "De Biervaten", "Biertap", "...");
        serviSociaalNetwerk sn2 = new serviSociaalNetwerk("2", "De Dansers", "Dansvloer", "...");
        serviSociaalNetwerk sn3 = new serviSociaalNetwerk("3", "De Toiletbezoekers", "WC", "...");
        serviSociaalNetwerk sn4 = new serviSociaalNetwerk("4", "De Ouders", "Ouders", "...");
        serviSociaalNetwerk sn5 = new serviSociaalNetwerk("5", "De Maatjesmannen", "Vrienden", "...");
        serviSociaalNetwerk sn6 = new serviSociaalNetwerk("6", "Automaniaccen", "Auto", "...");
        serviSociaalNetwerk sn7 = new serviSociaalNetwerk("7", "Huizenhouders", "Huis", "...");
        serviSociaalNetwerk sn8 = new serviSociaalNetwerk("8", "Vakantiegangers", "Vakantie", "...");
        serviSociaalNetwerk sn9 = new serviSociaalNetwerk("9", "Gamers", "Spelcomputer", "...");
        serviSociaalNetwerk sn10 = new serviSociaalNetwerk("10", "Potentiele miljonairs", "Miljonair", "...");
        serviSociaalNetwerk sn11 = new serviSociaalNetwerk("8", "Vakantieganers", "Piloot", "...");
        serviSociaalNetwerk sn12 = new serviSociaalNetwerk("2", "De Dansers", "Danser", "...");
        serviSociaalNetwerk sn13 = new serviSociaalNetwerk("4", "De Ouders", "Papa", "...");
        serviSociaalNetwerk sn15 = new serviSociaalNetwerk("11", "De Hamsteraars", "Hamster", "...");
        serviSociaalNetwerk sn16 = new serviSociaalNetwerk("12", "De Waterratten", "Vis", "...");
        serviSociaalNetwerk sn17 = new serviSociaalNetwerk("12", "De Waterratten", "Zwemmen", "...");
        serviSociaalNetwerk sn18 = new serviSociaalNetwerk("2", "De Dansers", "Dance Dance Dance", "...");
        serviSociaalNetwerk sn19 = new serviSociaalNetwerk("13", "De Nieuwslezers", "Nu", "...");
        serviSociaalNetwerk sn20 = new serviSociaalNetwerk("13", "De Nieuwslezers", "Telegraaf", "...");


        /**
         *
         *
         * Verhaal creeeren door items uit spinners.
         * We zullen eens gaan kijken welk sociaal netwerk het beste bij jou past.
         * Als jij binnenkomt op een feest ben je als eerste te vinden bij: ..... .
         * Als jij de loterij wint koop jij: .... .
         * Jij wilde .... worden als je oud was.
         * Jou favoriete huisdier is een ..... .
         * De sport .... vind jij het leukst.
         * Op TV kijk jij graag naar: ..... .
         * En op het internet zit je het liefst op: ..... .
         * Als laatste vind jij het bordspel: .... echt het leukst!
         * Op basis van deze gegevens lijkt dit netwerk ons het leukste netwerk voor jou: ......!
         *
         * Genereren welk sociaal netwerk hierbij past.
         */


        Intent i = getIntent();
        // Als de intent die meegestuurd word een Extra heeft worden textview 4,10 & 12 aangepast naar de meegestuurde data.
        if (i.hasExtra("ExtraStringQ1")) {
            TextView tekst3TextView = (TextView) findViewById(R.id.tekst3TextView);


            // antwoord1TextView wordt veranderd naar het antwoord wat in spinner2 is ingevuld enz.
            tekst3TextView.setText("We zullen eens gaan kijken welk sociaal netwerk het beste bij jou past. " +

                    "\nAls jij binnenkomt op een feest ben je als eerste te vinden bij "
                    + i.getStringExtra("ExtraStringQ1") +
                    "." +

                    "\nAls jij de loterij wint koop jij "
                    + i.getStringExtra("ExtraStringQ2") +
                    "." +

                    "\nJij wilde "
                    + i.getStringExtra("ExtraStringQ3") +
                    " worden als je oud was." +

                    "\nJou favoriete huisdier is een "
                    + i.getStringExtra("ExtraStringQ4") +
                    "." +

                    "\nDe sport "
                    + i.getStringExtra("ExtraStringQ5") +
                    " vind jij het leukst." +

                    "\nOp TV kijk jij graag naar "
                    + i.getStringExtra("ExtraStringQ6") +
                    "." +

                    "\nEn op het internet zit je het liefst op "
                    + i.getStringExtra("ExtraStringQ7") +
                    "." +

                    "\nTot slot vind jij het bordspel "
                    + i.getStringExtra("ExtraStringQ8") +
                    " echt het leukst!" +

                    "\nOp basis van deze gegevens lijkt dit netwerk ons het leukste netwerk voor jou: ....."

            );

            if (tekst3TextView.getText().toString().contains(sn1.getSNVoorwaarde())) {
                tekst4TextView.setText(sn1.getSNNaam());
            }
            if (tekst3TextView.getText().toString().contains(sn2.getSNVoorwaarde())) {
                tekst4TextView.setText(sn2.getSNNaam());
            }
            if (tekst3TextView.getText().toString().contains(sn3.getSNVoorwaarde())) {
                tekst4TextView.setText(sn3.getSNNaam());
            }
            if (tekst3TextView.getText().toString().contains(sn4.getSNVoorwaarde())) {
                tekst4TextView.setText(sn4.getSNNaam());
            }
            if (tekst3TextView.getText().toString().contains(sn5.getSNVoorwaarde())) {
                tekst4TextView.setText(sn5.getSNNaam());
            }
            if (tekst3TextView.getText().toString().contains(sn6.getSNVoorwaarde())) {
                tekst4TextView.setText(sn6.getSNNaam());
            }
            if (tekst3TextView.getText().toString().contains(sn7.getSNVoorwaarde())) {
                tekst4TextView.setText(sn7.getSNNaam());
            }
            if (tekst3TextView.getText().toString().contains(sn8.getSNVoorwaarde())) {
                tekst4TextView.setText(sn8.getSNNaam());
            }
            if (tekst3TextView.getText().toString().contains(sn9.getSNVoorwaarde())) {
                tekst4TextView.setText(sn9.getSNNaam());
            }
            if (tekst3TextView.getText().toString().contains(sn10.getSNVoorwaarde())) {
                tekst4TextView.setText(sn10.getSNNaam());
            }
            if (tekst3TextView.getText().toString().contains(sn11.getSNVoorwaarde())) {
                tekst4TextView.setText(sn11.getSNNaam());
            }
            if (tekst3TextView.getText().toString().contains(sn12.getSNVoorwaarde())) {
                tekst4TextView.setText(sn12.getSNNaam());
            }
            if (tekst3TextView.getText().toString().contains(sn13.getSNVoorwaarde())) {
                tekst4TextView.setText(sn13.getSNNaam());
            }

            if (tekst3TextView.getText().toString().contains(sn15.getSNVoorwaarde())) {
                tekst4TextView.setText(sn15.getSNNaam());
            }
            if (tekst3TextView.getText().toString().contains(sn16.getSNVoorwaarde())) {
                tekst4TextView.setText(sn16.getSNNaam());
            }
            if (tekst3TextView.getText().toString().contains(sn17.getSNVoorwaarde())) {
                tekst4TextView.setText(sn17.getSNNaam());
            }
            if (tekst3TextView.getText().toString().contains(sn18.getSNVoorwaarde())) {
                tekst4TextView.setText(sn18.getSNNaam());
            }
            if (tekst3TextView.getText().toString().contains(sn19.getSNVoorwaarde())) {
                tekst4TextView.setText(sn19.getSNNaam());
            }
            if (tekst3TextView.getText().toString().contains(sn20.getSNVoorwaarde())) {
                tekst4TextView.setText(sn20.getSNNaam());
            }


            Button serviButton6 = (Button) findViewById(R.id.serviButton6);
            serviButton6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(v.getContext(), SociaalNetwerkView3.class);
                    startActivity(i);

                }
            });


        }


    }
}
