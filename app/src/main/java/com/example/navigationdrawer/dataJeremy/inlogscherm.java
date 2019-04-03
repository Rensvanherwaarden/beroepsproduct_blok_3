package com.example.navigationdrawer.dataJeremy;



import android.content.Intent;
import android.os.Bundle;


import java.util.List;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
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
    EditText EditTextinlog;




    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inlogscherm);

        spinnerinlog = findViewById(R.id.spinnerinlog);
        buttoninlogjeremy = findViewById(R.id.buttoninlogjeremy);
        buttonregistreren = findViewById(R.id.buttonregistreren);


        spinnerinlog.setOnItemSelectedListener(this);

// Loading spinner data from database
        loadSpinnerData();

        buttoninlogjeremy.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

// geef data door dat je bij weergave een overzicht krijgt..

                Intent intent = new Intent(arg0.getContext(),MainActivity.class);
                startActivity(intent);

            }
        });

        buttonregistreren.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),invoerendatajeremy.class);
                startActivity(intent);
            }
        });

    }

/*
Function to load the spinner data from SQLite database
*/

    private void loadSpinnerData() {
        DatabaseHandler db = new DatabaseHandler(getApplicationContext());
        List labels = db.getAllLabels();

// Creating adapter for spinner
        ArrayAdapter dataAdapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, labels);

// Drop down layout style - list view with radio button
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

// attaching data adapter to spinner
        spinnerinlog.setAdapter(dataAdapter);

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
// On selecting a spinner item
        String label = parent.getItemAtPosition(position).toString();


        Toast.makeText(parent.getContext(), "Je koos: " + label,
                Toast.LENGTH_LONG).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> arg0) {
// TODO Auto-generated method stub
    }
}
