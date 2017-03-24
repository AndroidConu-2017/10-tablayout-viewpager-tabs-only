/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.viewpager;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Provides the appropriate {@link Fragment} for a view pager.
 */
public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {
    private static final int FRAG_COUNT = 3;
    protected String[] titles = new String[]{"Mon", "Tues", "Weds", "Thurs", "Fri"};

    public CharSequence getPageTitle(int position) {
        return titles[position];
    }

    public SimpleFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment frag = null;
        switch(position) {
            case 0: frag = new MondayFragment();
                    break;
            case 1: frag =  new TuesdayFragment();
                    break;
            case 2: frag = new WednesdayFragment();
                    break;
            }
        if (frag == null) {
            throw new IllegalArgumentException("No matching fragment");
        }
        return frag;
    }

    @Override
    public int getCount() {
        return FRAG_COUNT;
    }
}
