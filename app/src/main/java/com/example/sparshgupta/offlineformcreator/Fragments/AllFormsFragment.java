package com.example.sparshgupta.offlineformcreator.Fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.sparshgupta.offlineformcreator.R;

/**
 * Created by sparshgupta on 01/08/17.
 */

public class AllFormsFragment extends Fragment{

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.all_forms_fragment, null, false);
        
        return v;
    }
}
