package com.redmonj9.Shadowrun__Mobile_Character_Sheet.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.redmonj9.Shadowrun__Mobile_Character_Sheet.R;

/**
 * Created by James on 19/07/2015.
 */
public class ActiveSkillsFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_active_skills, container, false);
        return rootView;
    }
}
