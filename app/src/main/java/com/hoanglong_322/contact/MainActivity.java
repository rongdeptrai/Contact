package com.hoanglong_322.contact;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    TabLayout tabLayout;
    ViewPager viewPager;
    ViewPagerAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabLayout= findViewById(R.id.tablayout);
        viewPager=findViewById(R.id.viewpager);
        adapter= new ViewPagerAdapter(getSupportFragmentManager());
        //Add Fragment
        adapter.AddFragment(new ContactFragment(),"Liên Hệ");
        adapter.AddFragment(new ContactFragment(),"Lịch sử");
        adapter.AddFragment(new ContactFragment(),"Yêu Thích");

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}