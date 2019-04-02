package com.example.navigationdrawer.EventPackage;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.example.navigationdrawer.R;
import com.example.navigationdrawer.SociaalNetwerkFragment2;
import com.example.navigationdrawer.SociaalNetwerkFragment3;
import com.example.navigationdrawer.SociaalNetwerkFragment4;
import com.example.navigationdrawer.SociaalNetwerkFragment5;

public class EventMenu extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle saved) {
        View view = inflater.inflate(R.layout.fragment_sociaal_netwerk,container,false);
        ImageButton rensImageButton1 = (ImageButton) view.findViewById(R.id.rensImageButton1);
        ImageButton rensImageButton2 = (ImageButton) view.findViewById(R.id.zelfdeid);
        ImageButton rensImageButton3 = (ImageButton) view.findViewById(R.id.rensImageButton3);
        ImageButton rensImageButton4 = (ImageButton) view.findViewById(R.id.serviImageButton4);

        rensImageButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fr=getFragmentManager().beginTransaction();
                fr.replace(R.id.fragment_container, new EventAgendaFragment());
                fr.commit();

            }
        });
        rensImageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fr=getFragmentManager().beginTransaction();
                fr.replace(R.id.fragment_container, new EventList());
                fr.commit();

            }
        });
        rensImageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fr=getFragmentManager().beginTransaction();
                fr.replace(R.id.fragment_container, new EventInfoFragment());
                fr.commit();

            }
        });
        rensImageButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fr=getFragmentManager().beginTransaction();
                fr.replace(R.id.fragment_container, new SociaalNetwerkFragment5());
                fr.commit();

            }
        });
        return view; //test2
    }
}