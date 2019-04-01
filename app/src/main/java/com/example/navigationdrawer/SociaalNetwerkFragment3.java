package com.example.navigationdrawer;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Spinner;

import com.example.navigationdrawer.serviModels.serviQuizvragen;


public class SociaalNetwerkFragment3 extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle saved) {
        View view = inflater.inflate(R.layout.fragment_sociaal_netwerk_fragment3,container,false);


        Button serviButton2 = (Button) view.findViewById(R.id.serviButton2);
        Button serviButton3 = (Button) view.findViewById(R.id.serviButton3);
        Spinner spinner2 = (Spinner) view.findViewById(R.id.spinner2);
        Spinner spinner3 = (Spinner) view.findViewById(R.id.spinner3);
        Spinner spinner4 = (Spinner) view.findViewById(R.id.spinner4);
        Spinner spinner5 = (Spinner) view.findViewById(R.id.spinner5);
        Spinner spinner6 = (Spinner) view.findViewById(R.id.spinner6);
        Spinner spinner7 = (Spinner) view.findViewById(R.id.spinner7);
        Spinner spinner8 = (Spinner) view.findViewById(R.id.spinner8);
        Spinner spinner10 = (Spinner) view.findViewById(R.id.spinner10);


        /**
         * Data voor spinners
         */

        serviQuizvragen q1 = new serviQuizvragen("Waar ga jij eerst heen als je bij een feest binnenkomt?",
                "Biertap", "Dansvloer", "WC",
                "Ouders", "Vrienden");
        serviQuizvragen q2 = new serviQuizvragen("Als je de loterij wint wat zou je dan kopen?",
                "Auto", "Huis", "Vakantie",
                "Spelcomputer", "Vliegtuig");
        serviQuizvragen q3 = new serviQuizvragen("Wat wilde jij als kind worden?",
                "Papa/Mama", "Miljonair", "Danser/Danseres",
                "Politieagent", "Piloot");
        serviQuizvragen q4 = new serviQuizvragen("Wat is jou favoriete huisdier?",
                "Hond", "Kat", "Hamster",
                "Konijn", "Vis");
        serviQuizvragen q5 = new serviQuizvragen("Welke van deze sporten vind jij de leukste sport?",
                "Voetbal", "Hockey", "Schaatsen",
                "Zwemmen", "Wielrennen");
        serviQuizvragen q6 = new serviQuizvragen("Naar welk TV programma kijk jij het liefst?",
                "Wie is de mol", "Heel holland bakt", "Expeditie Robinson",
                "The Voice", "Dance Dance Dance");
        //serviQuizvragen q7 = new serviQuizvragen("Waar ga jij eerst heen als je bij een feest binnenkomt",
                "Biertap", "Dansvloer", "WC",
                "Ouders", "Vrienden");
        serviQuizvragen q8 = new serviQuizvragen("Waar ga jij eerst heen als je bij een feest binnenkomt",
                "Biertap", "Dansvloer", "WC",
                "Ouders", "Vrienden");
        serviQuizvragen q9 = new serviQuizvragen("Waar ga jij eerst heen als je bij een feest binnenkomt",
                "Biertap", "Dansvloer", "WC",
                "Ouders", "Vrienden");
        serviQuizvragen q10 = new serviQuizvragen("Waar ga jij eerst heen als je bij een feest binnenkomt",
                "Biertap", "Dansvloer", "WC",
                "Ouders", "Vrienden");

        serviButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fr=getFragmentManager().beginTransaction();
                fr.replace(R.id.fragment_container, new SociaalNetwerkFragment1());
                fr.commit();

            }
        });
        return view;

    }

}
