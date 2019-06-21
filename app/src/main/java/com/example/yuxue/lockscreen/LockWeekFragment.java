package com.example.yuxue.lockscreen;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.yuxue.R;

public class LockWeekFragment extends Fragment {

    View mview = null;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        if(mview == null){
            mview = inflater.inflate(R.layout.lock_screen_week,null);
        }

        return mview;
    }
}
