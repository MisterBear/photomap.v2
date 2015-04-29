package com.itechart.group.nl.photomap.ui.activities;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;

import com.itechart.group.nl.photomap.R;
import com.itechart.group.nl.photomap.ui.adapters.SectionsPagerAdapter;
import com.itechart.group.nl.photomap.ui.fragments.BaseFragment;
import com.itechart.group.nl.photomap.ui.fragments.MapFragment;
import com.itechart.group.nl.photomap.ui.fragments.PhotoGridFragment;
import com.itechart.group.nl.photomap.ui.fragments.PhotoListFragment;

import java.util.ArrayList;

public class HomeActivity extends ActionBarActivity implements ActionBar.TabListener {

    SectionsPagerAdapter mSectionsPagerAdapter;

    ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        configuratePager();

        mViewPager = (ViewPager) findViewById(R.id.pager);
        mViewPager.setAdapter(mSectionsPagerAdapter);
        mViewPager.setOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener() {
            @Override
            public void onPageSelected(int position) {
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
        mViewPager.setCurrentItem(tab.getPosition());
    }

    @Override
    public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
    }

    @Override
    public void onTabReselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
    }

    private void configuratePager() {
        ArrayList<BaseFragment> fragments = new ArrayList<BaseFragment>();
        BaseFragment fragment = new MapFragment();

        fragments.add(fragment);

        fragment = new PhotoListFragment();
        fragments.add(fragment);

        fragment = new PhotoGridFragment();
        fragments.add(fragment);

        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager(), fragments);
    }
}
