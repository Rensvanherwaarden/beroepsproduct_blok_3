package com.example.navigationdrawer;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.navigationdrawer.dataJeremy.invoerendatajeremy;
import com.example.navigationdrawer.dataJeremy.uitlezendatajeremy;
import com.example.navigationdrawer.dataJeremy.inlogscherm;
import com.example.navigationdrawer.dataJeremy.modeljeremy;


public class PersoonFragment extends Fragment {
    TextView textViewnaamwelkom;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_persoon, container, false);


        textViewnaamwelkom = view.findViewById(R.id.textViewnaamjeremy);

       try {
               if (getArguments().containsKey("naam")) {

            TextView textViewnaamwelkom = view.findViewById(R.id.textViewnaamwelkom);
            textViewnaamwelkom.setText(getArguments().getString("naam"));
        }
        else  {  TextView textViewnaamwelkom = view.findViewById(R.id.textViewnaamwelkom);
            textViewnaamwelkom.setText("");}}
            catch(Exception i){};

        Button Button2 = view.findViewById(R.id.Button2persoon);
        Button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), inlogscherm.class);



                startActivityForResult(intent,1);

            }
        });

        Button Button3 = view.findViewById(R.id.Button1persoon);
        Button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(v.getContext(), uitlezendatajeremy.class);
                startActivity(intent);


            }
        });




        return view;
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
       if (requestCode == 1){
           if (resultCode == Activity.RESULT_OK)
           {

               textViewnaamwelkom.setText(getArguments().getString("naam"));
           }
       }

    }
}