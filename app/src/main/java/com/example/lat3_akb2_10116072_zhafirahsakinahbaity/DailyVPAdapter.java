package com.example.lat3_akb2_10116072_zhafirahsakinahbaity;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class DailyVPAdapter extends FragmentPagerAdapter {

    private int numOfTabs;
    public DailyVPAdapter(FragmentManager fm, int numOfTabs) {
        super(fm);
        this.numOfTabs = numOfTabs;
    }


    @Override
    public Fragment getItem(int i) {
        switch (i){
            case 0:
                DailyDailyFragment dailyFragment= new DailyDailyFragment();
                return dailyFragment;
            case 1:
                DailyFriendFragment friendFragment= new DailyFriendFragment();
                return friendFragment;
        }
        return  null;
    }

    @Override
    public int getCount() {
        return numOfTabs;
    }
}
