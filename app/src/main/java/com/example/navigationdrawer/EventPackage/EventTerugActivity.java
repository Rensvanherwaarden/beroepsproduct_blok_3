package com.example.navigationdrawer.EventPackage;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.navigationdrawer.R;
import com.example.navigationdrawer.SociaalNetwerkFragment;


public class EventTerugActivity extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle saved) {
        View view = inflater.inflate(R.layout.activity_event_terug,container,false);

        Button rensButton4 = (Button) view.findViewById(R.id.rensButton4);

        rensButton4.setOnClickListener(new View.OnClickListener() {
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
