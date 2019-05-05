package com.example.lat3_akb2_10116072_zhafirahsakinahbaity;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class HomeVPAdapter extends FragmentPagerAdapter{

    private int numOfTabs;
    public HomeVPAdapter(FragmentManager fm, int numOfTabs) {
        super(fm);
        this.numOfTabs = numOfTabs;
    }


    @Override
    public Fragment getItem(int i) {
        switch (i){
            case 0:
                HomeProfileFragment profileFragment= new HomeProfileFragment();
                return profileFragment;
            case 1:
                HomeInterestFragment interestFragment= new HomeInterestFragment();
                return interestFragment;
        }
        return  null;
    }

    @Override
    public int getCount() {
        return numOfTabs;
    }
}
