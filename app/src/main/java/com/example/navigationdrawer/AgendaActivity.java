package com.example.navigationdrawer;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

// import com.squareup.timessquare.CalendarPickerView;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class AgendaActivity extends AppCompatActivity {

/**
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_agenda);


        Date vandaag = new Date();
        Calendar nextyear = Calendar.getInstance();
        nextyear.add(Calendar.YEAR, 1);

        CalendarPickerView datePicker = findViewById(R.id.calendar);
        datePicker.init(vandaag, nextyear.getTime()).withSelectedDate(vandaag);

        datePicker.setOnDateSelectedListener(new CalendarPickerView.OnDateSelectedListener() {
            @Override
            public void onDateSelected(Date date) {
                // String selectedDate= DateFormat.getDateInstance(DateFormat.FULL).format(date);

                Calendar calSelected = Calendar.getInstance();
                calSelected.setTime(date);

                String selectedDate = "De geselecteerde datum is:" + calSelected.get(Calendar.DAY_OF_MONTH) +
                        "-" + (calSelected.get(Calendar.MONTH)) +
                        "-" + (calSelected.get(Calendar.YEAR));

                Toast.makeText(AgendaActivity.this, selectedDate, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onDateUnselected(Date date) {

            }
        });


    }
}
    **/
}