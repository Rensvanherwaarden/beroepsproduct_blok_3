package com.example.navigationdrawer.dataJeremy;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import com.example.navigationdrawer.R;




public class invoerendatajeremy extends AppCompatActivity  {

    Button btnAddjeremy;
    EditText inputLabeljeremy;
    EditText inputLabeljeremy2;
    EditText inputLabeljeremy3;
    EditText inputLabeljeremy4;
    EditText inputLabeljeremy5;
    EditText inputLabeljeremy6;
    EditText inputLabeljeremy7;



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainjeremy);


        btnAddjeremy = findViewById(R.id.buttonjeremy);
        inputLabeljeremy = findViewById(R.id.editTextnaamjeremy);
        inputLabeljeremy2 = findViewById(R.id.editTextgeboortedatumjeremy);
        inputLabeljeremy3 = findViewById(R.id.editTextwoonplaatsjeremy);
        inputLabeljeremy4 = findViewById(R.id.editTextinteresse1jeremy);
        inputLabeljeremy5 = findViewById(R.id.editTextinteresse2jeremy);
        inputLabeljeremy6 = findViewById(R.id.editTextinteresse3jeremy);
        inputLabeljeremy7 = findViewById(R.id.editTextwachtwoordjeremy);





        btnAddjeremy.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                String label = inputLabeljeremy.getText().toString();
                String label1 = inputLabeljeremy2.getText().toString();
                String label2 = inputLabeljeremy3.getText().toString();
                String label3 = inputLabeljeremy4.getText().toString();
                String label4 = inputLabeljeremy5.getText().toString();
                String label5 = inputLabeljeremy6.getText().toString();
                String label6 = inputLabeljeremy7.getText().toString();

                if (label.trim().length() > 0) {
                    DatabaseHandler db = new DatabaseHandler(getApplicationContext());
                    db.insertLabel(label, label1, label2, label3, label4, label5, label6);


                    inputLabeljeremy.setText("");
                    inputLabeljeremy2.setText("");
                    inputLabeljeremy3.setText("");
                    inputLabeljeremy4.setText("");
                    inputLabeljeremy5.setText("");
                    inputLabeljeremy6.setText("");
                    inputLabeljeremy7.setText("");



                } else {
                    Toast.makeText(getApplicationContext(), "Vul alstublieft de bovenstaande vakken in", Toast.LENGTH_SHORT).show();
                }
                Intent intent = new Intent(arg0.getContext(),inlogscherm.class);
                startActivity(intent);
            }
        });

    }

}
