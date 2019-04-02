package com.example.navigationdrawer;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.navigationdrawer.dataJeremy.invoerendatajeremy;
import com.example.navigationdrawer.dataJeremy.uitlezendatajeremy;


public class PersoonFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_persoon, container, false);


        Button Button2 = view.findViewById(R.id.Button2persoon);
        Button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), invoerendatajeremy.class);
                startActivity(intent);

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
}