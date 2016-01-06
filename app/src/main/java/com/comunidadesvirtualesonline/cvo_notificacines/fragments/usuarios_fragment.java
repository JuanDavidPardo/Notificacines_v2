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
public class usuarios_fragment extends Fragment {


    public usuarios_fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_usuarios, container, false);
    }

}
