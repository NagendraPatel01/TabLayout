package com.example.tablayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.TableLayout;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    TabLayout teblayout;
    ViewPager viewpager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        teblayout = findViewById(R.id.teblayout);
        viewpager = findViewById(R.id.viewpager);

        Adapater adapter = new Adapater(getSupportFragmentManager());
        viewpager.setAdapter(adapter);
        teblayout.setupWithViewPager(viewpager);

    }
}
