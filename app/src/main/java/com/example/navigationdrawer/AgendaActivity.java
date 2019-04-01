package com.example.navigationdrawer;

import android.app.ActionBar;
import android.app.AppComponentFactory;
import android.os.Bundle;

import com.github.sundeepk.compactcalendarview.CompactCalendarView;

import java.text.SimpleDateFormat;
import java.util.Locale;

public class AgendaActivity extends AppComponentFactory {

    CompactCalendarView compactCalendar;
    private SimpleDateFormat dateFormatMonth = new SimpleDateFormat("MMMM-YYYY", Locale.getDefault());


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_agenda);


        final ActionBar actionBar = getSuportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(false);
        actionBar.setTitle(null);

        compactCalendar = (CompactCalendarView).;
    }
}




