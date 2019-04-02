package com.example.navigationdrawer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.navigationdrawer.serviModels.serviSociaalNetwerk;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SociaalNetwerkView3 extends AppCompatActivity {

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


        final TextView tekst4TextView = (TextView) findViewById(R.id.tekst4TextView);
        serviSpinner11.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                tekst4TextView.setText("");
                tekst4TextView.setText(tekst4TextView.getText() + parent.getItemAtPosition(position).toString());

            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                //Another interface callback
            }
        });

        Button serviButton7 = (Button) findViewById(R.id.serviButton7);
        serviButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), SociaalNetwerkView4.class);
                String gekozensociaalnetwerk = serviSpinner11.getSelectedItem().toString();
                i.putExtra("ExtraStringGekozenNetwerk", gekozensociaalnetwerk); // Meesturen van gekozen netwerk
                startActivity(i);

            }
        });
        }
    }

