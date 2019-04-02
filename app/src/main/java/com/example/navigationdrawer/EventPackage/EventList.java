package com.example.navigationdrawer.EventPackage;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ArrayAdapter;
import android.widget.EditText;

import android.widget.ListAdapter;
import android.widget.ListView;

import com.example.navigationdrawer.R;
import com.example.navigationdrawer.RensEvent;

import java.util.ArrayList;
import java.util.Arrays;


public class EventList extends AppCompatActivity {
    String[] items;
    ArrayList<String> listItems;
    ArrayAdapter<String> adapter;
    ListView listView;
    EditText editText;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_list);
        listView = (ListView) findViewById(R.id.RensEventlv1);
        editText = (EditText) findViewById(R.id.renseventzoekbar);
        eventList();

        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.toString().equals("")) {
                    //reset listview
                    eventList();

                } else {
                    //uitvoeren zoekopdracht
                    searchItem(s.toString());
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

    }

    public void searchItem(String textToSearch) {
        for (String item : items) {
            if (!item.contains(textToSearch)) {
                listItems.remove(item);
            }
        }
        adapter.notifyDataSetChanged();

    }

    public void eventList() {
        RensEvent eventnaam1 = new RensEvent("1", "kroeg", "iets", "22-20-8");
        RensEvent eventnaam2 = new RensEvent("1", "muzea", "iets", "22-20-8");
        RensEvent eventnaam3 = new RensEvent("1", "hoppa", "iets", "22-20-8");

        String[] activiteiten = new String[]{
                eventnaam1.getEvenementNaam(),
                eventnaam2.getEvenementNaam(),
                eventnaam3.getEvenementNaam(),

        };
        ListAdapter rensAdapter1 = new ArrayAdapter<String>(this, android.R.layout.activity_list_item, activiteiten);
        ListView rensListView1 = (ListView) findViewById(R.id.RensEventlv1);
        rensListView1.setAdapter(rensAdapter1);


    }
}


