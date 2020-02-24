package org.techtown.displaytest.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import org.techtown.displaytest.fragment.TabFragment1;
import org.techtown.displaytest.fragment.TabFragment2;

public class TabPagerAdapter extends  FragmentStatePagerAdapter{
    private int tabCount;

    public TabPagerAdapter(@NonNull FragmentManager fm,int tabCount) {
        super(fm);
        this.tabCount=tabCount;
    }


    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch(position){
            case 0:
                TabFragment1 tabFragment1 = new TabFragment1();
                return tabFragment1;
            case 1:
                TabFragment2 tabFragment2=new TabFragment2();
                return tabFragment2;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return tabCount;
    }
}
