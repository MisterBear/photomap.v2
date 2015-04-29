package com.itechart.group.nl.photomap.ui.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.itechart.group.nl.photomap.R;
import com.itechart.group.nl.photomap.ui.PhotoMapApplication;

/**
 * Created by mac-229 on 4/29/15.
 */
public class PhotoListFragment extends BaseFragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_photo_list, container, false);

        return rootView;
    }

    @Override
    public String getScreenName() {
        return PhotoMapApplication.getContext().getString(R.string.photo_list);
    }
}
