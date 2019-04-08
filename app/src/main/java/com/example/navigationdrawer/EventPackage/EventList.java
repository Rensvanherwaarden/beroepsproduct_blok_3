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
        final RensEvent event1 = new RensEvent("Rondleiding door een in Woerden", "Het Stadsmuseum Woerden is gevestigd in het hart van Woerden. In dit voormalige 16de-eeuwse 'Stedehuys’ met schandpaal wisselen historie en kunst elkaar af. Het museumgebouw op zichzelf is al een bezienswaardigheid. De begane grond werd in 1501 als ‘Stedehuys’ van Woerden in gebruik genomen. ", "4-7-2019");
        RensEvent event2 = new RensEvent("Escape room Den Bosch", "Doe mee aan de leukste escape room van Brabant. Kom jij er optijd uit?", "18-9-2019");
        RensEvent event3 = new RensEvent("Park uitje", "Laat je betoveren door het park van Breda. Geniet van de vogels, kippen en de bekende fontein", "7-4-2019");
        RensEvent event4 = new RensEvent("Optreden van Ed Sheeran", "De roodharige Brit Ed Sheeran brak in 2011 door met zijn hit The A Team. Daarna volgden de hits Lego House, Don’t, Give Me Love en Thinking Out Loud, waarmee Ed Sheeran uitgroeide tot een wereldster met duizenden, miljoenen fans. Hij speelt in de grootste arena's over heel de wereld.", "30-8-2019");
        RensEvent event5 = new RensEvent("beers and barrals ", "Ga mee uiteten in het meest Bourgondische restaurant van Breda", "12-20-1998");
        RensEvent event6 = new RensEvent("Een tour door Nederland", "Molens, klompen en… kleurrijke velden vol tulpen. Dat is Nederland op een ansichtkaart. Het voorjaar in Nederland staat dan ook in het teken van bloemen en bollen. Iedereen kent natuurlijk de Keukenhof en de bollenstreek, maar wist u dat de langste en kleurrijkste tulpenroute van Nederland in Flevoland ligt? Ontsnap de drukte van de Keukenhof en ontdek wat voor leuks er allemaal tijdens het Tulpenfestival te doen is!", "12-8-2019");
        RensEvent event7 = new RensEvent("Rondleiding door een in Woerden", "Het Stadsmuseum Woerden is gevestigd in het hart van Woerden. In dit voormalige 16de-eeuwse 'Stedehuys’ met schandpaal wisselen historie en kunst elkaar af. Het museumgebouw op zichzelf is al een bezienswaardigheid. De begane grond werd in 1501 als ‘Stedehuys’ van Woerden in gebruik genomen. ", "4-7-2019");
        RensEvent event8 = new RensEvent("Escape room Den Bosch", "Doe mee aan de leukste escape room van Brabant. Kom jij er optijd uit?", "18-9-2019");
        RensEvent event9 = new RensEvent("Park uitje", "Laat je betoveren door het park van Breda. Geniet van de vogels, kippen en de bekende fontein", "7-4-2019");
        RensEvent event10 = new RensEvent("Optreden van Ed Sheeran", "De roodharige Brit Ed Sheeran brak in 2011 door met zijn hit The A Team. Daarna volgden de hits Lego House, Don’t, Give Me Love en Thinking Out Loud, waarmee Ed Sheeran uitgroeide tot een wereldster met duizenden, miljoenen fans. Hij speelt in de grootste arena's over heel de wereld.", "30-8-2019");
        RensEvent event11 = new RensEvent("beers and barrals ", "Ga mee uiteten in het meest Bourgondische restaurant van Breda", "12-20-1998");
        RensEvent event12 = new RensEvent("Een tour door Nederland", "Molens, klompen en… kleurrijke velden vol tulpen. Dat is Nederland op een ansichtkaart. Het voorjaar in Nederland staat dan ook in het teken van bloemen en bollen. Iedereen kent natuurlijk de Keukenhof en de bollenstreek, maar wist u dat de langste en kleurrijkste tulpenroute van Nederland in Flevoland ligt? Ontsnap de drukte van de Keukenhof en ontdek wat voor leuks er allemaal tijdens het Tulpenfestival te doen is!", "12-8-2019");
        RensEvent event13 = new RensEvent("Rondleiding door een in Woerden", "Het Stadsmuseum Woerden is gevestigd in het hart van Woerden. In dit voormalige 16de-eeuwse 'Stedehuys’ met schandpaal wisselen historie en kunst elkaar af. Het museumgebouw op zichzelf is al een bezienswaardigheid. De begane grond werd in 1501 als ‘Stedehuys’ van Woerden in gebruik genomen. ", "4-7-2019");
        RensEvent event14 = new RensEvent("Escape room Den Bosch", "Doe mee aan de leukste escape room van Brabant. Kom jij er optijd uit?", "18-9-2019");
        RensEvent event15= new RensEvent("Park uitje", "Laat je betoveren door het park van Breda. Geniet van de vogels, kippen en de bekende fontein", "7-4-2019");
        RensEvent event16= new RensEvent("Optreden van Ed Sheeran", "De roodharige Brit Ed Sheeran brak in 2011 door met zijn hit The A Team. Daarna volgden de hits Lego House, Don’t, Give Me Love en Thinking Out Loud, waarmee Ed Sheeran uitgroeide tot een wereldster met duizenden, miljoenen fans. Hij speelt in de grootste arena's over heel de wereld.", "30-8-2019");


        //Add the Person objects to an ArrayList
        final ArrayList<RensEvent> evenenmentenlijst = new ArrayList<>();
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
        evenenmentenlijst.add(event11);
        evenenmentenlijst.add(event12);
        evenenmentenlijst.add(event13);
        evenenmentenlijst.add(event14);
        evenenmentenlijst.add(event15);
        evenenmentenlijst.add(event16);

        EventListAdapter adapter = new EventListAdapter(this, R.layout.activity_event_list_adapter, evenenmentenlijst);
        mListView.setAdapter(adapter);

        mListView.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(view.getContext(), EventExtraInfo.class);
                String eventnaam = evenenmentenlijst.get(position).getEvenementNaam();
                String eventinfo = evenenmentenlijst.get(position).getEvenementBeschrijving();
                String eventdatum = evenenmentenlijst.get(position).getEvenementDatum();

                i.putExtra("ExtraString1", eventnaam); // Meesturen van naam van een event
                i.putExtra("ExtraString2", eventinfo); //Meesturen van info van een event
                i.putExtra("ExtraString3", eventdatum); //Meesturen van datum van een event

                startActivity(i);


            }
        });

    }
}