package com.example.navigationdrawer.EventPackage;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.navigationdrawer.R;
import com.example.navigationdrawer.modelRens.RensEvent;

import java.util.ArrayList;
import java.util.List;



public class EventListAdapter extends ArrayAdapter<RensEvent> {

    private static final String TAG = "PersonListAdapter";

    private Context mContext;
    private int mResource;

    public EventListAdapter(Context context, int resource, ArrayList<RensEvent> objects) {
        super(context, resource, objects);
        mContext = context;
        mResource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //get the persons information
        String naam = getItem(position).getEvenementNaam();
        String info = getItem(position).getEvenementBeschrijving();
        String datum = getItem(position).getEvenementDatum();

        //Create the person object with the information
        RensEvent event = new RensEvent(naam, info, datum);

        LayoutInflater inflater = LayoutInflater.from(mContext);
        convertView = inflater.inflate(mResource, parent, false);

        TextView tvnaam = (TextView) convertView.findViewById(R.id.RensListEvent1);
        TextView tvinfo = (TextView) convertView.findViewById(R.id.RensListEvent2);
        TextView tvdatum = (TextView) convertView.findViewById(R.id.RensListEvent3);


        tvnaam.setText(naam);
        tvinfo.setText(info);
        tvdatum.setText(datum);

        return convertView;
    }

}
