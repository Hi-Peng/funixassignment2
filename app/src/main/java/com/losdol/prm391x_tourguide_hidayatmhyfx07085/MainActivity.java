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

    CardView hotelCV, atm_LL, hospital_LL, bus_LL;
    hotel mHotel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hotelCV = (CardView) findViewById(R.id.hotel_box);

        hotelCV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mHotel();
            }
        });
    }

    public void mHotel(){
        mHotel = new hotel();
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, mHotel);
        fragmentTransaction.commit();
    }
}
