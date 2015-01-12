package com.nonsensecoder.viewpagerwithfragmentpageradapter.adapter;

import java.util.ArrayList;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Ratul Ghosh on 1/7/2015.
 */

public class ViewPagerAdapter extends FragmentPagerAdapter {

	private final ArrayList<Fragment> fragments;

	public ViewPagerAdapter(FragmentManager fm, ArrayList<Fragment> fragments) {
		// mandatory to call the super() with a fragment manager
		super(fm);
		this.fragments = fragments;
	}

	@Override
	public Fragment getItem(int position) {
		// returning fragment of particular page
		return fragments.get(position);
	}

	@Override
	public int getCount() {
		// returning total number of page
		return fragments.size();
	}

}
