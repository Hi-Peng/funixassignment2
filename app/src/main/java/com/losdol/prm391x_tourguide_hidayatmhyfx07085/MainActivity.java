package com.losdol.prm391x_tourguide_hidayatmhyfx07085;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    CardView hotelCV, atm_LL, hospitalCV, bus_LL;
    hotel mHotel;
    hospital mHospital;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hospitalCV = (CardView) findViewById(R.id.hospital_box);
        hotelCV = (CardView) findViewById(R.id.hotel_box);

        hotelCV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mHotel();
            }
        });

        hospitalCV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mHospital();
            }
        });
    }

    public void mHotel(){
        mHotel = new hotel();
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, mHotel);
        fragmentTransaction.addToBackStack("FragmentHotel");
        fragmentTransaction.commit();
    }

    public void mHospital(){
        mHospital = new hospital();
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, mHospital);
        fragmentTransaction.addToBackStack("FragmentHospital");
        fragmentTransaction.commit();
    }
}
