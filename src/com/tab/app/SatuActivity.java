package com.tab.app;

import java.lang.ref.WeakReference;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

import com.actionbarsherlock.app.SherlockFragment;

public class SatuActivity extends SherlockFragment {
	private LayoutInflater mInflater;
	private WeakReference<View> mRootView = null;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);

	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		if (inflater != null)
			mInflater = inflater;
		else
			mInflater = LayoutInflater.from(getActivity());
		View rootView = mRootView == null ? null : mRootView.get();
		if (rootView != null) {
			final ViewParent parent = rootView.getParent();
			if (parent != null && parent instanceof ViewGroup)
				((ViewGroup) parent).removeView(rootView);
		} else {

			rootView = mInflater.inflate(R.layout.activity_satu, null, false);

		}
		return rootView;
	}
}
