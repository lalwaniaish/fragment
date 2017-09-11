package com.example.aishlalwani.fragment;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
viewpageadpter adapter;
    ViewPager view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        view = (ViewPager) findViewById(R.id.vpPager) ;
        adapter = new viewpageadpter(getSupportFragmentManager());
        adapter.addFragment(new frg1()  , "Best Offers");
        adapter.addFragment(new frg2(), "Categories");
        view.setAdapter(adapter);
    }
}
