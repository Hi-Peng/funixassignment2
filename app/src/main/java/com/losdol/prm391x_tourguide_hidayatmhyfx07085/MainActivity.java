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
    //Init
    CardView hotelCV, atmCV, hospitalCV, busCV;
    hotel mHotel;
    hospital mHospital;
    atm mATM;
    bus mBus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Assigning cardview object to theirs layout id
        hospitalCV = (CardView) findViewById(R.id.hospital_box);
        hotelCV = (CardView) findViewById(R.id.hotel_box);
        atmCV = (CardView) findViewById(R.id.atm_box);
        busCV = (CardView) findViewById(R.id.bus_box);

        //I make on click listener for the card view
        hotelCV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mHotel(); //Call the fragment
            }
        });

        hospitalCV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mHospital(); //Call the fragment
            }
        });

        atmCV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mAtm(); //Call the fragment
            }
        });

        busCV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mBus(); //Call the fragment
            }
        });
    }

    //Method to call the fragment
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

    public void mBus(){
        mBus = new bus();
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, mBus);
        fragmentTransaction.addToBackStack("FragmentBus");
        fragmentTransaction.commit();
    }

    public void mAtm(){
        mATM = new atm();
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, mATM);
        fragmentTransaction.addToBackStack("FragmentATM");
        fragmentTransaction.commit();
    }
}
