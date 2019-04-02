package com.example.navigationdrawer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class SociaalNetwerkView3 extends AppCompatActivity {

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



    }
}
