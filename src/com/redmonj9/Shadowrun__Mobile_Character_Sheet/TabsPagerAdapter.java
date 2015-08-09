package com.redmonj9.Shadowrun__Mobile_Character_Sheet;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import com.redmonj9.Shadowrun__Mobile_Character_Sheet.fragments.*;

public class TabsPagerAdapter extends FragmentPagerAdapter {

    public TabsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int index) {

        switch (index) {
            case 0:
                return new AttributesFragment();
            case 1:
                return new QualitiesFragment();
            case 2:
                return new ContactsFragment();
            case 3:
                return new ActiveSkillsFragment();
            case 4:
                return new KnowledgeSkillsFragment();
            case 5:
                return new SpellsFragment();
            case 6:
                return new SpiritsFragment();
            case 7:
                return new AugmentationsFragment();
            case 8:
                return new GearFragment();
            case 9:
                return new CharacterInfoFragment();
        }

        return null;
    }

    @Override
    public int getCount() {
        return 10;
    }

}