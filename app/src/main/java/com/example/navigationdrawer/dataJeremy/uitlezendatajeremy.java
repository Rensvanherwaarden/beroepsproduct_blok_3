package com.example.navigationdrawer.dataJeremy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.navigationdrawer.R;

public class uitlezendatajeremy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uitlezendatajeremy);

        Bundle extras = getIntent().getExtras();

        TextView textViewnaamjeremy = findViewById(R.id.textViewnaamjeremy);

        textViewnaamjeremy.setText(extras.getString( "Naam"));
    }
}
