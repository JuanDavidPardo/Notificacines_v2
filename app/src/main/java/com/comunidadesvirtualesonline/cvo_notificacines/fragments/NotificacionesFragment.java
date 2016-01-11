package com.comunidadesvirtualesonline.cvo_notificacines.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.comunidadesvirtualesonline.cvo_notificacines.R;
import com.comunidadesvirtualesonline.cvo_notificacines.adapters.EstudianteAdapter;
import com.comunidadesvirtualesonline.cvo_notificacines.models.Estudiante;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class NotificacionesFragment extends Fragment {


    public NotificacionesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragments_notificaciones, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        ArrayList<Estudiante> estudiantesArray = new ArrayList<>();

         Estudiante estudiante1 = new Estudiante();

        estudiante1.setTitulo("PRIMERA NOTIFICACION C.V.O");
        estudiante1.setNomEstudiante("DANIEL PARDO");
        estudiante1.setFecha("02/04/2016");

        estudiantesArray.add(estudiante1);

        RecyclerView recyclerView = (RecyclerView) getActivity().findViewById(R.id.my_recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(new EstudianteAdapter(estudiantesArray, R.layout.row_estudiantes));
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setItemAnimator(new DefaultItemAnimator());


    }
}
