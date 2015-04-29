package com.itechart.group.nl.photomap.ui.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

import com.itechart.group.nl.photomap.ui.fragments.BaseFragment;

/**
 * Created by mac-229 on 4/28/15.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    private ArrayList<BaseFragment> mFragments;

    public SectionsPagerAdapter(FragmentManager fm, ArrayList<BaseFragment> fragments) {
        super(fm);

        mFragments = fragments;
    }

    @Override
    public Fragment getItem(int position) {
        return mFragments.get(position);
    }

    @Override
    public int getCount() {
        return mFragments.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mFragments.get(position).getScreenName();
    }
}
