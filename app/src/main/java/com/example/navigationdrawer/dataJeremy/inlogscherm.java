package com.example.navigationdrawer.dataJeremy;


import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;
import com.example.navigationdrawer.R;
import com.example.navigationdrawer.MainActivity;




public class inlogscherm extends AppCompatActivity implements OnItemSelectedListener {
    Spinner spinnerinlog;
    Button buttoninlogjeremy;
    Button buttonregistreren;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inlogscherm);
        final ArrayList<modeljeremy> array1 = new ArrayList<>();

        spinnerinlog = findViewById(R.id.spinnerinlog);
        buttoninlogjeremy = findViewById(R.id.buttoninlogjeremy);
        buttonregistreren = findViewById(R.id.buttonregistreren);


        spinnerinlog.setOnItemSelectedListener(this);

// Laad de spinner met data van de database
        loadSpinnerData();
// De button hieronder leest de gekozen string uit van de spinner en plaats deze op het begingscherm persoon_fragement via de mainactivity.
        buttoninlogjeremy.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

        String welkom = ((Spinner)findViewById(R.id.spinnerinlog)).getSelectedItem().toString();
        modeljeremy model = new modeljeremy();
        model.setNaam(welkom);
        array1.add(model);

        Intent intent = new Intent(arg0.getContext(),MainActivity.class);
                intent.putExtra("naam",model.getNaam());


                startActivity(intent);

            }
        });
// Deze button gaat naar de activity invoerendatajeremy
        buttonregistreren.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),invoerendatajeremy.class);
                startActivity(intent);
            }
        });

    }


    private void loadSpinnerData() {
        DatabaseHandler db = new DatabaseHandler(getApplicationContext());
        List label3 = db.getAllLabels();

// Creeër een adapter voor de spinner
        ArrayAdapter dataAdapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, label3);
// gebruik de Drop down layout style
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// data adapter aan spinner toevoegen
        spinnerinlog.setAdapter(dataAdapter);

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

        String label3 = parent.getItemAtPosition(position).toString();


        Toast.makeText(parent.getContext(), "Je koos: " + label3,
                Toast.LENGTH_LONG).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> arg0) {
// TODO Auto-generated method stub
    }
}

