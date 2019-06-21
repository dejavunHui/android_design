package com.example.yuxue.lockscreen;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

import com.dev.sacot41.scviewpager.SCViewPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class ViewPagerAdapter extends SCViewPagerAdapter {

    private List<Fragment> mFragments = null;

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
        this.mFragments = new ArrayList<>();
    }

    @Override
    public Fragment getItem(int i) {
        return mFragments.get(i);
    }

    @Override
    public int getCount() {
        return mFragments.size();
    }

    public void setmFragments(List<Fragment> mFragments) {
        this.mFragments = mFragments;
    }
}
