package com.example.navigationdrawer.serviViews;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.navigationdrawer.R;
import com.example.navigationdrawer.serviModels.serviSociaalNetwerk;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SociaalNetwerkView3 extends AppCompatActivity {

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
        setContentView(R.layout.view_sociaal_netwerk_3);
        Intent i = getIntent();
        // Als de intent die meegestuurd word een Extra heeft worden textview 4,10 & 12 aangepast naar de meegestuurde data.
        if (i.hasExtra("ExtraStringUitkomstSN")) {
            TextView tekst2TextView = (TextView) findViewById(R.id.sndetailTextView1);
            // Textview4 word veranderd naar welke naam er is ingevuld bij de MainActivity in spinner2
            tekst2TextView.setText(i.getStringExtra("ExtraStringUitkomstSN"));

        }
        final Spinner serviSpinner11 = (Spinner) findViewById(R.id.serviSpinner11);
        // String Array voor spinner2
        String[] socialenetwerkenlijst = new String[]{
                sn1.getSNNaam(),
                sn2.getSNNaam(),
                sn3.getSNNaam(),
                sn4.getSNNaam(),
                sn5.getSNNaam(),
                sn6.getSNNaam(),
                sn7.getSNNaam(),
                sn8.getSNNaam(),
                sn9.getSNNaam(),
                sn10.getSNNaam(),
                sn11.getSNNaam(),
                sn12.getSNNaam(),
                sn13.getSNNaam()

        };

        final List<String> sociaalnetwerklijst = new ArrayList<>(Arrays.asList(socialenetwerkenlijst));

        // ArrayAdapter spinner2
        final ArrayAdapter<String> spinner11ArrayAdapter = new ArrayAdapter<String>(
                this, R.layout.support_simple_spinner_dropdown_item, sociaalnetwerklijst);
        spinner11ArrayAdapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        serviSpinner11.setAdapter(spinner11ArrayAdapter);


        Button serviButton12 = (Button) findViewById(R.id.serviButton12);
        serviButton12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), SociaalNetwerkView4.class);
                String infooversn = serviSpinner11.getSelectedItem().toString();
                i.putExtra("ExtraStringInfooversn", infooversn); // Meesturen van geselecteerde sociaal netwerk
                startActivity(i);

            }
        });

    }
}
