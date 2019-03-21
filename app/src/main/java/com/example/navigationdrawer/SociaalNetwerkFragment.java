package com.example.navigationdrawer;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class SociaalNetwerkFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_sociaalnetwerk,container,false);
      /**  TextView tekst1TextView = (TextView) findViewById(R.id.tekst1TextView);
        TextView tekst2TextView = (TextView) findViewById(R.id.tekst2TextView);
        TextView tekst3TextView = (TextView) findViewById(R.id.tekst3TextView);
        TextView tekst4TextView = (TextView) findViewById(R.id.tekst4TextView);
        TextView tekst5TextView = (TextView) findViewById(R.id.tekst5TextView);
        TextView tekst6TextView = (TextView) findViewById(R.id.tekst6TextView);
**/
      afb1ImageButton = (ImageButton) findViewById(R.id.afb1ImageButton);

    }
}
