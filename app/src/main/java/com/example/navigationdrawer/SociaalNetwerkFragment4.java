package com.example.navigationdrawer;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Spinner;

import com.example.navigationdrawer.Model.serviSociaalNetwerk;
import com.example.navigationdrawer.serviClient;


public class SociaalNetwerkFragment4 extends Fragment {
    @Nullable


    private Spinner serviSpinner1;

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle saved) {

        View view = inflater.inflate(R.layout.fragment_sociaal_netwerk_fragment4, container, false);
        Button serviButton3 = (Button) view.findViewById(R.id.serviButton3);
        serviSociaalNetwerk SNNaam1 = new serviSociaalNetwerk("1", "Testnetwerk1");
        serviSociaalNetwerk SNNaam2 = new serviSociaalNetwerk("2", "Testnetwerk2");
        serviSociaalNetwerk SNNaam3 = new serviSociaalNetwerk("3", "Testnetwerk3");
        serviSociaalNetwerk SNNaam4 = new serviSociaalNetwerk("4", "Testnetwerk4");
        serviSociaalNetwerk SNNaam5 = new serviSociaalNetwerk("5", "Testnetwerk5");
        serviSociaalNetwerk SNNaam6 = new serviSociaalNetwerk("6", "Testnetwerk6");
        serviSociaalNetwerk SNNaam7 = new serviSociaalNetwerk("7", "Testnetwerk7");

//test
        String[] namen = new String[]{
                SNNaam1.getSNNaam(),
                SNNaam2.getSNNaam(),
                SNNaam3.getSNNaam(),
                SNNaam4.getSNNaam(),
                SNNaam5.getSNNaam(),
                SNNaam6.getSNNaam(),
                SNNaam7.getSNNaam()


        };
        ListAdapter serviAdapter1 = new ArrayAdapter<String>(view.getContext(), android.R.layout.simple_list_item_1, namen);
        ListView serviListView1 = (ListView) view.findViewById(R.id.serviListView1);
        serviListView1.setAdapter(serviAdapter1);

        serviListView1.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                        Intent toonLeden = new Intent(view.getContext(), snDetail.class);
                         toonLeden.putExtra("com.example.navigationdrawer.LIJST", i);
                         startActivity(toonLeden);
                    }
                }
        );

        //test



        serviButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fr = getFragmentManager().beginTransaction();
                fr.replace(R.id.fragment_container, new SociaalNetwerkFragment());
                fr.commit();

            }
        });
        return view;

    }

}
