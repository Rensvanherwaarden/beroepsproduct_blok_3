package com.example.navigationdrawer;


import android.os.Bundle;
import android.support.annotation.NonNull;

import android.support.design.widget.NavigationView;

import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private DrawerLayout drawer;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        //begin pagina van de applicatie
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new PersoonFragment()).commit();
        navigationView.setCheckedItem(R.id.nav_persoon);
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            // voor menu items die geselecteerd blijven als je er op klikt

            case R.id.nav_persoon:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new AgendaFragment()).commit();
                break;
            case R.id.nav_agenda:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new PersoonFragment()).commit();
                break;

            case R.id.nav_sociaalnetwerk:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new SociaalNetwerkFragment()).commit();
                break;

// voor menu items die enkel  iets moeten laten zien
            case R.id.nav_event_calander:
                setContentView(R.layout.activity_agenda);
                Toast.makeText(this, "Evenementen Kalender", Toast.LENGTH_SHORT).show();
                break;
            case R.id.nav_beschikbare_event:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new EventInfoFragment()).commit();
                Toast.makeText(this, "Beschikbare Evenementen", Toast.LENGTH_SHORT).show();
                break;
        }
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onBackPressed() {
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }
}




