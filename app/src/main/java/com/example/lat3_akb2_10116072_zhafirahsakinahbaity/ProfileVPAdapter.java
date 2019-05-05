package com.example.lat3_akb2_10116072_zhafirahsakinahbaity;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

class ProfileVPAdapter extends FragmentPagerAdapter {

    private int numOfTabs;
    public ProfileVPAdapter(FragmentManager fm, int numOfTabs) {
        super(fm);
        this.numOfTabs = numOfTabs;
    }


    @Override
    public Fragment getItem(int i) {
        switch (i){
            case 0:
                ProfileProfileFragment profileFragment= new ProfileProfileFragment();
                return profileFragment;
            case 1:
                ProfileContactFragment contactFragment= new ProfileContactFragment();
                return contactFragment;
            case 2:
                ProfileFindmeFragment findmeFragment= new ProfileFindmeFragment();
                return findmeFragment;
            case 3:
                ProfileAboutFragment aboutFragment= new ProfileAboutFragment();
                return aboutFragment;
        }
        return  null;
    }

    @Override
    public int getCount() {
        return numOfTabs;
    }
}
