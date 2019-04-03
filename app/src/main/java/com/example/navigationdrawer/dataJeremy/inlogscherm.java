package com.example.navigationdrawer.dataJeremy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import com.example.navigationdrawer.R;
import com.example.navigationdrawer.PersoonFragment;
import com.example.navigationdrawer.MainActivity;


public class inlogscherm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inlogscherm);

        Button buttoninlog = findViewById(R.id.buttoninlogjeremy);
        buttoninlog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),MainActivity.class);
                startActivity(intent);
            }
        });
        Button buttonregistreren = findViewById(R.id.buttonregistreren);
        buttonregistreren.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),invoerendatajeremy.class);
                startActivity(intent);
            }
        });


    }
}
