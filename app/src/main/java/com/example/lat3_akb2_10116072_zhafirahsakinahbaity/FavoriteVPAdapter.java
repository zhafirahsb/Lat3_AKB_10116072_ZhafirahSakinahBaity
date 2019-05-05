package com.example.lat3_akb2_10116072_zhafirahsakinahbaity;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;

class FavoriteVPAdapter extends FragmentPagerAdapter {

    String[] title = new String[]{
            "MUSIC","VIDEO"
    };
    private int numOfTabs;
    public FavoriteVPAdapter(FragmentManager fm, int numOfTabs) {
        super(fm);
        this.numOfTabs = numOfTabs;
    }


    @Override
    public Fragment getItem(int i) {
        switch (i){
            case 0:
                FavMusicFragment favMusicFragment = new FavMusicFragment();
                return favMusicFragment;
            case 1:
                FavVideoFragment favVideoFragment= new FavVideoFragment();
                return favVideoFragment;
        }
        return  null;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {

        return title[position];
    }

    @Override
    public int getCount() {
        return numOfTabs;
    }
}
