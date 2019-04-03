package com.example.navigationdrawer;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.navigationdrawer.serviModels.serviInschrijfOpties;


public class SociaalNetwerkFragment2 extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle saved) {
        View view = inflater.inflate(R.layout.fragment_sociaal_netwerk_fragment2, container, false);

// Alle attributen die ik gebruik aanmaken en vinden uit het layout bestand.
        Button serviButton1 = (Button) view.findViewById(R.id.serviButton1);
        TextView serviSNTextView1 = (TextView) view.findViewById(R.id.serviSNTextView1);
        TextView serviSNTextView2 = (TextView) view.findViewById(R.id.serviSNTextView2);
        TextView serviSNTextView3 = (TextView) view.findViewById(R.id.serviSNTextView3);
        TextView serviSNTextView4 = (TextView) view.findViewById(R.id.serviSNTextView4);
        ImageButton serviSNImageButton1 = (ImageButton) view.findViewById(R.id.serviSNImageButton1);
        ImageButton serviSNImageButton2 = (ImageButton) view.findViewById(R.id.serviSNImageButton2);
        ImageButton serviSNImageButton3 = (ImageButton) view.findViewById(R.id.serviSNImageButton3);
        ImageButton serviSNImageButton4 = (ImageButton) view.findViewById(R.id.serviSNImageButton4);


// Inschrijfopties aanmaken.
        final serviInschrijfOpties inoptie1 = new serviInschrijfOpties("Persoonlijke Begeleider", "Het inschrijven bij een persoonlijke begeleider is heel makkelijk. Je gaat naar jou eigen persoonlijke begeleider toe en geeft aan dat je bij een sociaal netwerk wil horen. Je moet de volgende gegevens doorgeven: Welk sociaal netwerk je wilt betreden, je naam, je leeftijd, je woongroep. Hiermee zal de persoonlijke begeleider naar de leiding van het sociale netwerk toe gaan en jou inschrijven.");
        final serviInschrijfOpties inoptie2 = new serviInschrijfOpties("Dagbesteding", "Bij de dagbesteding waar je heen gaat kun je jezelf altijd laten inschrijven.");
        final serviInschrijfOpties inoptie3 = new serviInschrijfOpties("Ouders", "Inschrijven bij een sociaal netwerk kan door je ouders aangevraagd worden.");
        final serviInschrijfOpties inoptie4 = new serviInschrijfOpties("Bij een evenement", "Tijdens een evenement zijn er mensen aanwezig die jou kunnen inschrijven bij een sociaal netwerk.");


// Textviews veranderen.
        serviSNTextView1.setText(inoptie1.getInschrijfoptie());
        serviSNTextView2.setText(inoptie2.getInschrijfoptie());
        serviSNTextView3.setText(inoptie3.getInschrijfoptie());
        serviSNTextView4.setText(inoptie4.getInschrijfoptie());

// Imagebutton 1 onclicklistener (stuurt beschrijving door naar volgende activity.)
        serviSNImageButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), SociaalNetwerkView1.class);
                String beschrijving1 = inoptie1.getOptieBeschrijving();
                String titel1 = inoptie1.getInschrijfoptie();
                i.putExtra("ExtraStringTitel", titel1); // Meesturen van data inschrijfoptie om als titel te fungeren.
                i.putExtra("ExtraStringBeschrijving", beschrijving1); // Meesturen van data beschrijving van sociaal netwerk
                startActivity(i);

            }
        });

// Imagebutton 2 onclicklistener (stuurt beschrijving door naar volgende activity.)
        serviSNImageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), SociaalNetwerkView1.class);
                String beschrijving2 = inoptie2.getOptieBeschrijving();
                String titel2 = inoptie2.getInschrijfoptie();
                i.putExtra("ExtraStringTitel", titel2); // Meesturen van data inschrijfoptie om als titel te fungeren.
                i.putExtra("ExtraStringBeschrijving", beschrijving2); // Meesturen van data beschrijving van sociaal netwerk
                startActivity(i);

            }
        });

// Imagebutton 3 onclicklistener (stuurt beschrijving door naar volgende activity.)
        serviSNImageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), SociaalNetwerkView1.class);
                String beschrijving3 = inoptie3.getOptieBeschrijving();
                String titel3 = inoptie3.getInschrijfoptie();
                i.putExtra("ExtraStringTitel", titel3); // Meesturen van data inschrijfoptie om als titel te fungeren.
                i.putExtra("ExtraStringBeschrijving", beschrijving3); // Meesturen van data beschrijving van sociaal netwerk
                startActivity(i);

            }
        });

// Imagebutton 4 onclicklistener (stuurt beschrijving door naar volgende activity.)
        serviSNImageButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), SociaalNetwerkView1.class);
                String beschrijving4 = inoptie4.getOptieBeschrijving();
                String titel4 = inoptie4.getInschrijfoptie();
                i.putExtra("ExtraStringTitel", titel4); // Meesturen van data inschrijfoptie om als titel te fungeren.
                i.putExtra("ExtraStringBeschrijving", beschrijving4); // Meesturen van data beschrijving van sociaal netwerk
                startActivity(i);

            }
        });


// Terug button om naar het hoofdmenu van sociale netwerken terug te keren.
        serviButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fr = getFragmentManager().beginTransaction();
                fr.replace(R.id.fragment_container, new SociaalNetwerkFragment1());
                fr.commit();

            }
        });
        return view;

    }

}
