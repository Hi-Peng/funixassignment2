package com.losdol.prm391x_tourguide_hidayatmhyfx07085;


import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;


/**
 * Here is the fragment for the Hospital
 * This class generated automatically by the IDE generator
 * Every fragment nearly same, just change some variable
 */
public class hospital extends Fragment {
    ListView listView;

    //Initialize the content of list view, i'm using my own content here
    String mHospital[] = {"Maeda Hospital", "Yamamoto Hospital", "RSCM Hospital", "Roto Hospital", "Nganjuk Hospital", "Waton Hospital", "Tejo Hospital"};
    String mAddress[] = {"Jalan Pemuda", "Jalan Maeda", "Jalan Hanoi", "Jalan Patimura", "Jalan Laksamana", "Jalan Perumdis", "Jalan Abdul Syukur"};

    public hospital() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
        //Adding a view
        View view = inflater.inflate(R.layout.fragment_layout, container, false);
        listView = view.findViewById(R.id.hotelList);
        hospital.listAdapter adapter = new hospital.listAdapter(getContext(), mHospital, mAddress);
        listView.setAdapter(adapter);
        return view;
    }

    //Here's where I make the custom view for the list view
    class listAdapter extends ArrayAdapter<String> {
        Context context;
        String rHotel[];
        String rAddress[];


        listAdapter(Context c, String title[], String address[]){
            super(c, R.layout.custom_list_view, R.id.judul_gede, title);
            this.context = c;
            this.rHotel = title;
            this.rAddress = address;
        }

        //Here's where I make the custom view for the list view
        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View customRow =  layoutInflater.inflate(R.layout.custom_list_view, parent, false);
            TextView iAddress = customRow.findViewById(R.id.isi);
            TextView iTitle = customRow.findViewById(R.id.judul_gede);
            ImageView icon = (ImageView) customRow.findViewById(R.id.icon);

            iAddress.setText(rAddress[position]);
            iTitle.setText(rHotel[position]);
            icon.setImageResource(R.drawable.hospital);

            return customRow;
        }
    }
}
