package com.example.navigationdrawer.EventPackage;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.navigationdrawer.R;
import com.example.navigationdrawer.modelRens.RensEvent;

import java.util.ArrayList;
import java.util.List;

    public class EventList2 extends AppCompatActivity {

        private static final String TAG = "MainActivity";

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_event_list);
            Log.d(TAG, "onCreate: Started.");
            ListView mListView = (ListView) findViewById(R.id.listView);

            //Create the Person objects
            RensEvent event1 = new RensEvent("kroeg","12-20-1998","Male");
            RensEvent event2 = new RensEvent("museum","12-20-1998","Male");
            RensEvent event3 = new RensEvent("park","12-20-1998","Male");
            RensEvent event4 = new RensEvent("de boel","12-20-1998","Male");
            RensEvent event5 = new RensEvent("beers and barrals ","12-20-1998","Male");

            //Add the Person objects to an ArrayList
            ArrayList<RensEvent> evenmentenlijst = new ArrayList<>();
            evenmentenlijst.add(event1);
            evenmentenlijst.add(event2);
            evenmentenlijst.add(event3);
            evenmentenlijst.add(event4);
            evenmentenlijst.add(event5);


            EventListAdapter adapter = new EventListAdapter(this, R.layout.activity_event_list_adapter, evenmentenlijst);
            mListView.setAdapter(adapter);
        }
    }}
