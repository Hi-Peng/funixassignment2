package com.losdol.prm391x_tourguide_hidayatmhyfx07085;


import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;


/**
 * A simple {@link Fragment} subclass.
 */
public class hotel extends Fragment {

    ListView listView;
    public hotel() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //Adding a view
        View view = inflater.inflate(R.layout.fragment_hotel, container, false);
        listView = view.findViewById(R.id.hotelList);

        return view;
    }

    class listAdapter extends ArrayAdapter<String> {
        void listAdapter ()
    }

}
