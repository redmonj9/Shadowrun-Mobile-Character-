package com.redmonj9.Shadowrun__Mobile_Character_Sheet.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.redmonj9.Shadowrun__Mobile_Character_Sheet.R;

public class CharacterInfoFragment extends Fragment{
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_character_info, container, false);
        return rootView;
    }
}
