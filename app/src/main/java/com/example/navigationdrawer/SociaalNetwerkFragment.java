package com.example.navigationdrawer;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

public class SociaalNetwerkFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle saved) {
        View view = inflater.inflate(R.layout.fragment_sociaal_netwerk,container,false);
        ImageButton serviImageButton1 = (ImageButton) view.findViewById(R.id.rensImageButton1);
        ImageButton serviImageButton2 = (ImageButton) view.findViewById(R.id.zelfdeid);
        ImageButton serviImageButton3 = (ImageButton) view.findViewById(R.id.rensImageButton3);
        ImageButton serviImageButton4 = (ImageButton) view.findViewById(R.id.rensImageButton4);

        serviImageButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fr=getFragmentManager().beginTransaction();
                fr.replace(R.id.fragment_container, new SociaalNetwerkFragment2());
                fr.commit();

            }
        });
        serviImageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fr=getFragmentManager().beginTransaction();
                fr.replace(R.id.fragment_container, new SociaalNetwerkFragment3());
                fr.commit();

            }
        });

        return view; //test2
    }
}