package com.tab.app;

import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.SherlockFragmentActivity;

import android.os.Bundle;
import android.support.v4.app.Fragment;

public class MainActivity extends SherlockFragmentActivity {
	ActionBar.Tab Tab1, Tab2, Tab3;
	Fragment fragmentTab1 = new SatuActivity();
	Fragment fragmentTab2 = new DuaActivity();
	Fragment fragmentTab3 = new TigaActivity();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		setContentView(R.layout.activity_main);
		getSupportActionBar().setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

		ActionBar actionBar = getSupportActionBar();

		// Hide Actionbar Icon
		actionBar.setDisplayShowHomeEnabled(false);

		// Hide Actionbar Title
		actionBar.setDisplayShowTitleEnabled(false);

		// Create Actionbar Tabs
		actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

		// Set Tab Icon and Titles
		// Tab1 = actionBar.newTab().setIcon(R.drawable.ic_launcher);
		Tab1 = actionBar.newTab().setText("satu");
		Tab2 = actionBar.newTab().setText("dua");
		Tab3 = actionBar.newTab().setText("tiga");

		// Set Tab Listeners
		Tab1.setTabListener(new TabListener(fragmentTab1));
		Tab2.setTabListener(new TabListener(fragmentTab2));
		Tab3.setTabListener(new TabListener(fragmentTab3));

		// Add tabs to actionbar
		actionBar.addTab(Tab1);
		actionBar.addTab(Tab2);
		actionBar.addTab(Tab3);

		actionBar.selectTab(Tab2);
	}

}
