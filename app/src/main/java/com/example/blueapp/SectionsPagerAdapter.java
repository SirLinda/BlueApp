package com.example.blueapp;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class SectionsPagerAdapter extends FragmentPagerAdapter {

    public SectionsPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        // Return the corresponding fragment for each tab position
        switch (position) {
            case 0:
                return new ChatsFragment();
            case 1:
                return new StatusFragment();
            case 2:
                return new CallsFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        // Return the number of tabs
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Return the title for each tab position
        switch (position) {
            case 0:
                return "Chats";
            case 1:
                return "Status";
            case 2:
                return "Calls";
            default:
                return null;
        }
    }
}