package com.example.train_shadowlinedemo.fragment.movieDetailsFragment;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.example.train_shadowlinedemo.R;

public class FragmentCity extends androidx.fragment.app.Fragment {
    public android.view.View onCreateView(LayoutInflater inflater, ViewGroup container, android.os.Bundle savedInstanceState) {
        android.view.View view = null;
        view = inflater.inflate(R.layout.fragment_movie_detail_undetermined, container, false);
        return view;
    }
}
