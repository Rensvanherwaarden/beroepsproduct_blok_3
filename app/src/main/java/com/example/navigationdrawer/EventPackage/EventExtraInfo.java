package com.example.navigationdrawer.EventPackage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.navigationdrawer.R;

public class EventExtraInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_extra_info);
        Intent i = getIntent();
        // Als de intent die meegestuurd word een Extra heeft worden textview 4,10 & 12 aangepast naar de meegestuurde data.
        if (i.hasExtra("ExtraString1")) {
            TextView naam = (TextView) findViewById(R.id.Rensnaaminvul);
            TextView info = (TextView) findViewById(R.id.Rensinfoinvul);
            TextView datum = (TextView) findViewById(R.id.Rensdatuminvul);

            // Textview4 word veranderd naar welke naam er is ingevuld bij de MainActivity in spinner2
            naam.setText(i.getStringExtra("ExtraString1"));
            info.setText(i.getStringExtra("ExtraString2"));
            datum.setText(i.getStringExtra("ExtraString3"));

        }
    }

}
