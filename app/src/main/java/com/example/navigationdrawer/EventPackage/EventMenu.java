package com.example.navigationdrawer.EventPackage;

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

public class EventMenu extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle saved) {
        View view = inflater.inflate(R.layout.activity_event_menu, container, false);
        ImageButton rensImageButton1 = (ImageButton) view.findViewById(R.id.rensImageButton1);
        ImageButton rensImageButton2 = (ImageButton) view.findViewById(R.id.rensImageButton2);


        rensImageButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fr = getFragmentManager().beginTransaction();
                Intent i = new Intent(v.getContext(),EventCalanderActivity.class);
                startActivity(i);
            }
        });
        rensImageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), EventList.class);
                startActivity(i);
               }
        });

        return view;
    }
}