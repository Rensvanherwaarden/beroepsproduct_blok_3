package com.example.navigationdrawer.EventPackage;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.navigationdrawer.R;
import com.example.navigationdrawer.modelRens.RensEvent;

import java.util.ArrayList;
import java.util.List;

public class EventList extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_list);
        Log.d(TAG, "onCreate: Started.");
        final ListView mListView = (ListView) findViewById(R.id.listView);

        //Create the Event objects
        final RensEvent event1 = new RensEvent("kroeg", "een leuk uitje in d kroeg", "12-20-1998");
        RensEvent event2 = new RensEvent("museum", "12-20-1998", "12-20-1998");
        RensEvent event3 = new RensEvent("park", "12-20-1998", "12-20-1998");
        RensEvent event4 = new RensEvent("de boel", "12-20-1998", "12-20-1998");
        RensEvent event5 = new RensEvent("beers and barrals ", "12-20-1998", "12-20-1998");
        RensEvent event6 = new RensEvent("kroeg", "12-20-1998", "12-20-1998");
        RensEvent event7 = new RensEvent("museum", "12-20-1998", "12-20-1998");
        RensEvent event8 = new RensEvent("park", "12-20-1998", "12-20-1998");
        RensEvent event9 = new RensEvent("de boel", "12-20-1998", "12-20-1998");
        RensEvent event10 = new RensEvent("beers and barrals ", "12-20-1998", "12-20-1998");

        //Add the Person objects to an ArrayList
        ArrayList<RensEvent> evenenmentenlijst = new ArrayList<>();
        evenenmentenlijst.add(event1);
        evenenmentenlijst.add(event2);
        evenenmentenlijst.add(event3);
        evenenmentenlijst.add(event4);
        evenenmentenlijst.add(event5);
        evenenmentenlijst.add(event6);
        evenenmentenlijst.add(event7);
        evenenmentenlijst.add(event8);
        evenenmentenlijst.add(event9);
        evenenmentenlijst.add(event10);

        EventListAdapter adapter = new EventListAdapter(this, R.layout.activity_event_list_adapter, evenenmentenlijst);
        mListView.setAdapter(adapter);

        mListView.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(view.getContext(), EventExtraInfo.class);
                String eventnaam = mListView.getItemAtPosition(position).toString();
                String eventinfo = mListView.getItemAtPosition(position).toString();
                String eventdatum = mListView.getItemAtPosition(position).toString();

                i.putExtra("ExtraString1", eventnaam); // Meesturen van naam van een event
                i.putExtra("ExtraString2", eventinfo); //Meesturen van info van een event
                i.putExtra("ExtraString3", eventdatum); //Meesturen van datum van een event

                startActivity(i);


            }
        });

    }
}