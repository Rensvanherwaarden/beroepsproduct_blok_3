package com.example.navigationdrawer;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class SociaalNetwerkFragment4 extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle saved) {
        View view = inflater.inflate(R.layout.fragment_sociaal_netwerk_fragment4,container,false);

        Button serviButton3 = (Button) view.findViewById(R.id.serviButton3);

        serviButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fr=getFragmentManager().beginTransaction();
                fr.replace(R.id.fragment_container, new SociaalNetwerkFragment());
                fr.commit();

            }
        });
        return view;

    }

}
