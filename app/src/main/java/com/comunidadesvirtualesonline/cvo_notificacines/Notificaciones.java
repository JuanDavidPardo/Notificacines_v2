package com.comunidadesvirtualesonline.cvo_notificacines;

import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.app.Fragment;
import com.comunidadesvirtualesonline.cvo_notificacines.gcmquickstart.*;

import com.comunidadesvirtualesonline.cvo_notificacines.fragments.NotificacionesFragment;
import com.comunidadesvirtualesonline.cvo_notificacines.fragments.usuarios_fragment;

public class Notificaciones extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private DrawerLayout drawerLayout;
    private String drawerTitle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notificaciones);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

      // setToolbar();

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Snackbar.make(view, "Envio Mensajes Al Colegio", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);

        /*
        if (navigationView != null) {
            setupDrawerContent(navigationView);
        }
        drawerTitle = "Inicio";
         if(savedInstanceState == null){
             selectItem(drawerTitle);

         }*/

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigation = (NavigationView) findViewById(R.id.nav_view);
        navigation.setNavigationItemSelectedListener(this);


        FragmentManager fragmentManager = getSupportFragmentManager ();

        fragmentManager . beginTransaction ()
                . replace ( R . id . main_Content , new  NotificacionesFragment()).commit ();

    }

    /* NO SIRVIO
   private void setToolbar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final android.support.v7.app.ActionBar ab = getSupportActionBar();
        if (ab != null) {

            ab.setHomeAsUpIndicator(R.drawable.ic_menu);
            ab.setDisplayHomeAsUpEnabled(true);
        }
    } */
/*
private void setupDrawerContent(NavigationView navigationView){
        navigationView.setNavigationItemSelectedListener(
                new NavigationView.OnNavigationItemSelectedListener(){
                    @Override
                    public boolean onNavigationItemSelected(MenuItem item) {

                        item.setChecked(true);

                        String title = item.getTitle().toString();
                        selectItem(title);
                        return false;
                    }
                }
        );
    }


    private void selectItem(String title){
        //enviar titulo como argumento del fragmento
        Bundle args = new Bundle();
        args.putString(NotificacionesFragment.ARG_SECTION_TITLE, title);

        NotificacionesFragment fragment = NotificacionesFragment.newInstance(title);
        fragment.setArguments(args);
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager
                .beginTransaction()
                .replace(R.id.main_Content, fragment)
                .commit();

        drawerLayout.closeDrawers();

        setTitle(title);

    } */

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.notificaciones, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {

        FragmentManager fragmentManager = getSupportFragmentManager ();



        int id = item.getItemId();

        if (id == R.id.nav_inicio) {
            fragmentManager . beginTransaction ()
                    . replace ( R . id . main_Content , new  NotificacionesFragment()).commit ();
        } else if (id == R.id.nav_usuario) {
            fragmentManager . beginTransaction ()
                    . replace ( R . id . main_Content , new usuarios_fragment()).commit();

        } else if (id == R.id.nav_config) {

        } else if (id == R.id.nav_cerrar_Sesion) {
            Intent i = new Intent(this, com.comunidadesvirtualesonline.cvo_notificacines.Main.class);
            startActivity(i);

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
