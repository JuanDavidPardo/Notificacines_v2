package com.comunidadesvirtualesonline.cvo_notificacines.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.comunidadesvirtualesonline.cvo_notificacines.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class NotificacionesFragment extends Fragment {

    public static final String ARG_SECTION_TITLE= "section number";

    public NotificacionesFragment() {
        // Required empty public constructor
    }
    public static NotificacionesFragment newInstance(){
        NotificacionesFragment fragment = new NotificacionesFragment();
        return fragment;

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragments_main, container, false);


        return view;

    }



}
