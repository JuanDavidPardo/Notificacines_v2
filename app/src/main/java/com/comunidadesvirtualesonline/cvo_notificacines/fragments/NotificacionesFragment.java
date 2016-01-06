package com.comunidadesvirtualesonline.cvo_notificacines.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.comunidadesvirtualesonline.cvo_notificacines.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class NotificacionesFragment extends Fragment {

    public static final String ARG_SECTION_TITLE= "section number";

    public NotificacionesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragments_notificaciones, container, false);
    }


}
