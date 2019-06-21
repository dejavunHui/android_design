package com.example.yuxue.lockscreen;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import com.dev.sacot41.scviewpager.DotsView;
import com.dev.sacot41.scviewpager.SCViewPager;
import com.example.yuxue.R;

import java.util.ArrayList;
import java.util.List;


public class LockScreenActivity extends AppCompatActivity {


    private ViewPager viewPager = null;
    private ViewPagerAdapter viewPagerAdapter = null;
    private FragmentManager fragmentManager = null;
    private DotsView dotsView = null;
    private static final int NUMS = 2;
    private List<Fragment> mFragmentList = new ArrayList<Fragment>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().requestFeature(Window.FEATURE_ACTION_BAR);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_lock_screen);
        init();
        initFragments();
        viewPagerAdapter.setmFragments(mFragmentList);
        initViewPager();

    }

    public void initViewPager() {
        viewPager.setAdapter(viewPagerAdapter);
        viewPager.setCurrentItem(0);
    }

    private void initFragments() {
        Fragment day = new LockDayFragment();
        Fragment week = new LockWeekFragment();
        mFragmentList.add(day);
        mFragmentList.add(week);
    }

    private void bindTouchEvent()
    {
        for(Fragment fragment:mFragmentList){

        }
    }

    private void init(){

        viewPager = findViewById(R.id.lock_viewPager);
        dotsView = findViewById(R.id.dotsview_main);
        fragmentManager = getSupportFragmentManager();
        viewPagerAdapter = new ViewPagerAdapter(fragmentManager);


        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i1) {

            }

            @Override
            public void onPageSelected(int i) {
                dotsView.selectDot(i);
            }

            @Override
            public void onPageScrollStateChanged(int i) {

            }
        });

        dotsView.setDotRessource(R.drawable.dot_selected, R.drawable.dot_unselected);
        dotsView.setNumberOfPage(NUMS);


    }



}


