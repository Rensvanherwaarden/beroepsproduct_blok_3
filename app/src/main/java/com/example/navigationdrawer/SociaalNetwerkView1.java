package com.example.navigationdrawer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SociaalNetwerkView1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_sociaal_netwerk_1);
        Intent i = getIntent();
        // Als de intent die meegestuurd word een Extra heeft worden textview 4,10 & 12 aangepast naar de meegestuurde data.
        if (i.hasExtra("ExtraStringBeschrijving")) {
            TextView sndetailTextView1 = (TextView) findViewById(R.id.sndetailTextView1);
            TextView sndetailTextView2 = (TextView) findViewById(R.id.sndetailTextView2);
            // Textview4 word veranderd naar welke naam er is ingevuld bij de MainActivity in spinner2
            sndetailTextView1.setText(i.getStringExtra("ExtraStringBeschrijving"));
            sndetailTextView2.setText(i.getStringExtra("ExtraStringTitel"));

        }



    }
}
