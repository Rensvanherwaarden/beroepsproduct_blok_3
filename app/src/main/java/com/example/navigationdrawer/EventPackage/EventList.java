package com.example.navigationdrawer.EventPackage;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;

import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

import android.widget.ListAdapter;
import android.widget.ListView;

import com.example.navigationdrawer.R;
import com.example.navigationdrawer.modelRens.RensEvent;


public class EventList extends AppCompatActivity {


    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle saved) {
        View view = inflater.inflate(R.layout.activity_event_list,container,false);

        RensEvent event1 = new RensEvent("1", "muziekfeest", "muziek feest in de omgeving van eindhoven", "2-3-20");
        RensEvent event2 = new RensEvent("2", "voetbalwedstrijd", "muziek feest in de omgeving van eindhoven", "2-3-20");
        RensEvent event3 = new RensEvent("3", "korfbalwedstrijd", "muziek feest in de omgeving van eindhoven", "2-3-20");
        RensEvent event4 = new RensEvent("4", "bezoek aan een museum", "muziek feest in de omgeving van eindhoven", "2-3-20");
        RensEvent event5 = new RensEvent("5", "muziekfeest", "muziek feest in de omgeving van eindhoven", "2-3-20");
        RensEvent event6 = new RensEvent("6", "muziekfeest", "muziek feest in de omgeving van eindhoven", "2-3-20");

        String[] eventnaam = new String[]{
                event1.getEvenementNaam(),
                event2.getEvenementNaam(),
                event3.getEvenementNaam(),
                event4.getEvenementNaam(),
                event5.getEvenementNaam()
        };

        ListAdapter Rensadapter1 = new ArrayAdapter<String>(view.getContext(), android.R.layout.simple_list_item_1, eventnaam);
        ListView rensiListView1 = (ListView) view.findViewById(R.id.RensEventlv1);
        rensiListView1.setAdapter(Rensadapter1);

        rensiListView1.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                        Intent toonEvent = new Intent(view.getContext(), EventInfoFragment.class);

                        startActivity(toonEvent);
                    }
                });

        return view;

    }
}

