package com.example.navigationdrawer;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import com.example.navigationdrawer.serviModels.serviQuizvragen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class SociaalNetwerkFragment3 extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle saved) {
        View view = inflater.inflate(R.layout.fragment_sociaal_netwerk_fragment3,container,false);


        Button serviButton2 = (Button) view.findViewById(R.id.serviButton2);
        Button serviButton3 = (Button) view.findViewById(R.id.serviButton3);
        final Spinner spinner2 = (Spinner) view.findViewById(R.id.spinner2);
        final Spinner spinner3 = (Spinner) view.findViewById(R.id.spinner3);
        final Spinner spinner4 = (Spinner) view.findViewById(R.id.spinner4);
        final Spinner spinner5 = (Spinner) view.findViewById(R.id.spinner5);
        final Spinner spinner6 = (Spinner) view.findViewById(R.id.spinner6);
        final Spinner spinner7 = (Spinner) view.findViewById(R.id.spinner7);
        final Spinner spinner8 = (Spinner) view.findViewById(R.id.spinner8);
        final Spinner spinner9 = (Spinner) view.findViewById(R.id.spinner9);


        /**
         * Data voor spinners
         */

        serviQuizvragen q1 = new serviQuizvragen("Waar ga jij eerst heen als je bij een feest binnenkomt?",
                "de Biertap", "de Dansvloer", "de WC",
                "je Ouders", "je Vrienden");
        serviQuizvragen q2 = new serviQuizvragen("Als je de loterij wint wat zou je dan kopen?",
                "een Auto", "een Huis", "een Vakantie",
                "een Spelcomputer", "een Vliegtuig");
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
        serviQuizvragen q7 = new serviQuizvragen("Op welke website zit jij graag?",
                "Youtube", "Twitter", "Facebook",
                "Nu", "Telegraaf");
        serviQuizvragen q8 = new serviQuizvragen("Welk van deze bordspellen vind jij het leukst?",
                "Monopoly", "Ganzenbord", "Mens erger je niet",
                "Scrabble", "Party en Co");



// String Array voor spinner2
        String[] antwoorden = new String[]{
                q1.getAntwoordoptie1(),
                q1.getAntwoordoptie2(),
                q1.getAntwoordoptie3(),
                q1.getAntwoordoptie4(),
                q1.getAntwoordoptie5()
        };

        final List<String> antwoordlijst = new ArrayList<>(Arrays.asList(antwoorden));

        // ArrayAdapter spinner2
        final ArrayAdapter<String> spinner2ArrayAdapter = new ArrayAdapter<String>(
                getActivity(), R.layout.support_simple_spinner_dropdown_item, antwoordlijst);
        spinner2ArrayAdapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        spinner2.setAdapter(spinner2ArrayAdapter);



// String Array voor spinner3 (Q2)
        String[] antwoorden2 = new String[]{
                q2.getAntwoordoptie1(),
                q2.getAntwoordoptie2(),
                q2.getAntwoordoptie3(),
                q2.getAntwoordoptie4(),
                q2.getAntwoordoptie5()
        };

        final List<String> antwoordlijst2 = new ArrayList<>(Arrays.asList(antwoorden2));

        // ArrayAdapter spinner3 (Q2)
        final ArrayAdapter<String> spinner3ArrayAdapter = new ArrayAdapter<String>(
                getActivity(), R.layout.support_simple_spinner_dropdown_item, antwoordlijst2);
        spinner3ArrayAdapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        spinner3.setAdapter(spinner3ArrayAdapter);




        // String Array voor spinner4 (Q3)
        String[] antwoorden3 = new String[]{
                q3.getAntwoordoptie1(),
                q3.getAntwoordoptie2(),
                q3.getAntwoordoptie3(),
                q3.getAntwoordoptie4(),
                q3.getAntwoordoptie5()
        };

        final List<String> antwoordlijst3 = new ArrayList<>(Arrays.asList(antwoorden3));

        // ArrayAdapter spinner3
        final ArrayAdapter<String> spinner4ArrayAdapter = new ArrayAdapter<String>(
                getActivity(), R.layout.support_simple_spinner_dropdown_item, antwoordlijst3);
        spinner4ArrayAdapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        spinner4.setAdapter(spinner4ArrayAdapter);




        // String Array voor spinner5 (Q4)
        String[] antwoorden4 = new String[]{
                q4.getAntwoordoptie1(),
                q4.getAntwoordoptie2(),
                q4.getAntwoordoptie3(),
                q4.getAntwoordoptie4(),
                q4.getAntwoordoptie5()
        };

        final List<String> antwoordlijst4 = new ArrayList<>(Arrays.asList(antwoorden4));

        // ArrayAdapter spinner5
        final ArrayAdapter<String> spinner5ArrayAdapter = new ArrayAdapter<String>(
                getActivity(), R.layout.support_simple_spinner_dropdown_item, antwoordlijst4);
        spinner5ArrayAdapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        spinner5.setAdapter(spinner5ArrayAdapter);



        // String Array voor spinner6 (Q5)
        String[] antwoorden5 = new String[]{
                q5.getAntwoordoptie1(),
                q5.getAntwoordoptie2(),
                q5.getAntwoordoptie3(),
                q5.getAntwoordoptie4(),
                q5.getAntwoordoptie5()
        };

        final List<String> antwoordlijst5 = new ArrayList<>(Arrays.asList(antwoorden5));

        // ArrayAdapter spinner6
        final ArrayAdapter<String> spinner6ArrayAdapter = new ArrayAdapter<String>(
                getActivity(), R.layout.support_simple_spinner_dropdown_item, antwoordlijst5);
        spinner6ArrayAdapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        spinner6.setAdapter(spinner6ArrayAdapter);



        // String Array voor spinner7 (Q6)
        String[] antwoorden6 = new String[]{
                q6.getAntwoordoptie1(),
                q6.getAntwoordoptie2(),
                q6.getAntwoordoptie3(),
                q6.getAntwoordoptie4(),
                q6.getAntwoordoptie5()
        };

        final List<String> antwoordlijst6 = new ArrayList<>(Arrays.asList(antwoorden6));

        // ArrayAdapter spinner7
        final ArrayAdapter<String> spinner7ArrayAdapter = new ArrayAdapter<String>(
                getActivity(), R.layout.support_simple_spinner_dropdown_item, antwoordlijst6);
        spinner7ArrayAdapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        spinner7.setAdapter(spinner7ArrayAdapter);



        // String Array voor spinner8 (Q7)
        String[] antwoorden7 = new String[]{
                q7.getAntwoordoptie1(),
                q7.getAntwoordoptie2(),
                q7.getAntwoordoptie3(),
                q7.getAntwoordoptie4(),
                q7.getAntwoordoptie5()
        };

        final List<String> antwoordlijst7 = new ArrayList<>(Arrays.asList(antwoorden7));

        // ArrayAdapter spinner8
        final ArrayAdapter<String> spinner8ArrayAdapter = new ArrayAdapter<String>(
                getActivity(), R.layout.support_simple_spinner_dropdown_item, antwoordlijst7);
        spinner8ArrayAdapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        spinner8.setAdapter(spinner8ArrayAdapter);



        // String Array voor spinner9 (Q8)
        String[] antwoorden8 = new String[]{
                q8.getAntwoordoptie1(),
                q8.getAntwoordoptie2(),
                q8.getAntwoordoptie3(),
                q8.getAntwoordoptie4(),
                q8.getAntwoordoptie5()
        };

        final List<String> antwoordlijst8 = new ArrayList<>(Arrays.asList(antwoorden8));

        // ArrayAdapter spinner9
        final ArrayAdapter<String> spinner9ArrayAdapter = new ArrayAdapter<String>(
                getActivity(), R.layout.support_simple_spinner_dropdown_item, antwoordlijst8);
        spinner9ArrayAdapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        spinner9.setAdapter(spinner9ArrayAdapter);





        // Wanneer je op button3(VERSTUUR)
        // drukt wordt je naar de volgende activity gestuurd.
        // De strings die je in de spinners hebt ingevuld word meegestuurd naar SociaalNetwerkView2
        serviButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), SociaalNetwerkView2.class);
                String q1antwoord = spinner2.getSelectedItem().toString();
                String q2antwoord = spinner3.getSelectedItem().toString();
                String q3antwoord = spinner4.getSelectedItem().toString();
                String q4antwoord = spinner5.getSelectedItem().toString();
                String q5antwoord = spinner6.getSelectedItem().toString();
                String q6antwoord = spinner7.getSelectedItem().toString();
                String q7antwoord = spinner8.getSelectedItem().toString();
                String q8antwoord = spinner9.getSelectedItem().toString();
                i.putExtra("ExtraStringQ1", q1antwoord); // Meesturen van antwoord bij vraag 1
                i.putExtra("ExtraStringQ2", q2antwoord); // Meesturen van antwoord bij vraag 2
                i.putExtra("ExtraStringQ3", q3antwoord); // Meesturen van antwoord bij vraag 3
                i.putExtra("ExtraStringQ4", q4antwoord); // Meesturen van antwoord bij vraag 4
                i.putExtra("ExtraStringQ5", q5antwoord); // Meesturen van antwoord bij vraag 5
                i.putExtra("ExtraStringQ6", q6antwoord); // Meesturen van antwoord bij vraag 6
                i.putExtra("ExtraStringQ7", q7antwoord); // Meesturen van antwoord bij vraag 7
                i.putExtra("ExtraStringQ8", q8antwoord); // Meesturen van antwoord bij vraag 8

                startActivity(i);

            }
        });

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
