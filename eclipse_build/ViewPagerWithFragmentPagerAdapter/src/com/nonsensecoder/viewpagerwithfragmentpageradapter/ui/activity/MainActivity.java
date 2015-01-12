package com.nonsensecoder.viewpagerwithfragmentpageradapter.ui.activity;

import java.util.ArrayList;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;
import android.widget.Toast;

import com.nonsensecoder.viewpagerwithfragmentpageradapter.R;
import com.nonsensecoder.viewpagerwithfragmentpageradapter.adapter.ViewPagerAdapter;
import com.nonsensecoder.viewpagerwithfragmentpageradapter.ui.fragment.TestFragment;

public class MainActivity extends ActionBarActivity implements
		ViewPager.OnPageChangeListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		findViewsAndConfigure();

	}

	private void findViewsAndConfigure() {
		ViewPager viewPager = (ViewPager) findViewById(R.id.viewPager);

		// set number of cache page
		// I am setting it to 2 , so that all our fragments remain in cached
		// state
		viewPager.setOffscreenPageLimit(2);

		ArrayList<Fragment> fragments = new ArrayList<Fragment>();
		fragments.add(TestFragment.newInstance("Fragment A", "#770000"));
		fragments.add(TestFragment.newInstance("Fragment B", "#007700"));
		fragments.add(TestFragment.newInstance("Fragment C", "#000077"));

		viewPager.setAdapter(new ViewPagerAdapter(getSupportFragmentManager(),
				fragments));

		viewPager.setOnPageChangeListener(this);

	}

	@Override
	public void onPageScrolled(int position, float positionOffset,
			int positionOffsetPixels) {

	}

	@Override
	public void onPageSelected(int position) {
		// called when a new page been selected
		Toast.makeText(this, "Page : " + position, Toast.LENGTH_SHORT).show();
	}

	@Override
	public void onPageScrollStateChanged(int state) {

	}
}
