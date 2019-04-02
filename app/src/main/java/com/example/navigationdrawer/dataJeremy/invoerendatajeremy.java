package com.example.navigationdrawer.dataJeremy;


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




public class invoerendatajeremy extends AppCompatActivity implements OnItemSelectedListener {
    Spinner spinnerjeremy;
    Button btnAddjeremy;
    EditText inputLabeljeremy;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainjeremy);

        spinnerjeremy = findViewById(R.id.spinnerjeremy);
        btnAddjeremy = findViewById(R.id.buttonjeremy);
        inputLabeljeremy = findViewById(R.id.editTextnaamjeremy);

        spinnerjeremy.setOnItemSelectedListener(this);

// Loading spinner data from database
        loadSpinnerData();

        btnAddjeremy.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                String label = inputLabeljeremy.getText().toString();

                if (label.trim().length() > 0) {
                    DatabaseHandler db = new DatabaseHandler(getApplicationContext());
                    db.insertLabel(label);

// making input filed text to blank
                    inputLabeljeremy.setText("");

// Hiding the keyboard
                    InputMethodManager imm = (InputMethodManager)
                            getSystemService(Context.INPUT_METHOD_SERVICE);
                    imm.hideSoftInputFromWindow(inputLabeljeremy.getWindowToken(), 0);

// loading spinner with newly added data
                    loadSpinnerData();
                } else {
                    Toast.makeText(getApplicationContext(), "Please enter label name", Toast.LENGTH_SHORT).show();
                }
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
        spinnerjeremy.setAdapter(dataAdapter);

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
// On selecting a spinner item
        String label = parent.getItemAtPosition(position).toString();

// Showing selected spinner item
        Toast.makeText(parent.getContext(), "You selected: " + label,
                Toast.LENGTH_LONG).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> arg0) {
// TODO Auto-generated method stub
    }
}