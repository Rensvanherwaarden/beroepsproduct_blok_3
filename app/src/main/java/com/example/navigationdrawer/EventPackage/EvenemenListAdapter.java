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
// link https://www.youtube.com/watch?v=E6vE8fqQPTE
/**
 * Created by User on 3/14/2017.
 */

public class EvenemenListAdapter extends ArrayAdapter<RensEvent> {

    private static final String TAG = "PersonListAdapter";

    private Context mContext;
    private int mResource;
    private int lastPosition = -1;

    /**
     * Holds variables in a View
     */
    private static class ViewHolder {
        TextView naam;
        TextView info;
        TextView datum;
    }

    /**
     * Default constructor for the PersonListAdapter
     *
     * @param context
     * @param resource
     * @param objects
     */
    public EvenemenListAdapter(Context context, int resource, ArrayList<RensEvent> objects) {
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

        //create the view result for showing the animation
        final View result;

        //ViewHolder object
        ViewHolder holder;


        if (convertView == null) {
            LayoutInflater inflater = LayoutInflater.from(mContext);
            convertView = inflater.inflate(mResource, parent, false);
            holder = new ViewHolder();
            holder.naam = (TextView) convertView.findViewById(R.id.textView1);
            holder.info = (TextView) convertView.findViewById(R.id.textView2);
            holder.datum = (TextView) convertView.findViewById(R.id.textView3);

            result = convertView;

            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
            result = convertView;
        }


        Animation animation = AnimationUtils.loadAnimation(mContext,
                (position > lastPosition) ? R.anim.load_down_anim : R.anim.load_up_anim);
        result.startAnimation(animation);
        lastPosition = position;

        holder.naam.setText(event.getName());
        holder.info.setText(event.getBirthday());
        holder.datum.setText(event.getSex());


        return convertView;
    }
}
