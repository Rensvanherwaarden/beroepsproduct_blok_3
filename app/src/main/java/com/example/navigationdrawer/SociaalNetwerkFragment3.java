package com.example.navigationdrawer;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Spinner;


public class SociaalNetwerkFragment3 extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle saved) {
        View view = inflater.inflate(R.layout.fragment_sociaal_netwerk_fragment3,container,false);


        Button serviButton2 = (Button) view.findViewById(R.id.serviButton2);
        Button serviButton3 = (Button) view.findViewById(R.id.serviButton3);
        Spinner spinner2 = (Spinner) view.findViewById(R.id.spinner2);
        Spinner spinner3 = (Spinner) view.findViewById(R.id.spinner3);
        Spinner spinner4 = (Spinner) view.findViewById(R.id.spinner4);
        Spinner spinner5 = (Spinner) view.findViewById(R.id.spinner5);
        Spinner spinner6 = (Spinner) view.findViewById(R.id.spinner6);
        Spinner spinner7 = (Spinner) view.findViewById(R.id.spinner7);
        Spinner spinner8 = (Spinner) view.findViewById(R.id.spinner8);
        Spinner spinner10 = (Spinner) view.findViewById(R.id.spinner10);

        serviButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fr=getFragmentManager().beginTransaction();
                fr.replace(R.id.fragment_container, new SociaalNetwerkFragment1());
                fr.commit();

            }
        });
        return view;

    }

}
