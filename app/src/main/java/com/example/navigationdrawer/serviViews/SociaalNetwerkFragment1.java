package com.example.navigationdrawer.serviViews;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.example.navigationdrawer.R;

public class SociaalNetwerkFragment1 extends Fragment {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle saved) {
        View view = inflater.inflate(R.layout.fragment_sociaal_netwerk_fragment1, container, false);
        ImageButton serviImageButton1 = (ImageButton) view.findViewById(R.id.serviImageButton1);
        ImageButton serviImageButton2 = (ImageButton) view.findViewById(R.id.serviImageButton2);
        ImageButton serviImageButton3 = (ImageButton) view.findViewById(R.id.serviImageButton3);


        serviImageButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fr = getFragmentManager().beginTransaction();
                fr.replace(R.id.fragment_container, new SociaalNetwerkFragment2());
                fr.commit();

            }
        });
        serviImageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fr = getFragmentManager().beginTransaction();
                fr.replace(R.id.fragment_container, new SociaalNetwerkFragment3());
                fr.commit();

            }
        });
        serviImageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), SociaalNetwerkView3.class);
                startActivity(i);

            }
        });


        return view; //test2
    }
}