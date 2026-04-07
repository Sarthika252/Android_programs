package com.example.alllayoutsapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;

public class MenuFragment extends Fragment {

    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_menu, container, false);

        v.findViewById(R.id.btnLinear)
                .setOnClickListener(view -> open(new LinearLayoutFragment()));

        v.findViewById(R.id.btnRelative)
                .setOnClickListener(view -> open(new RelativeLayoutFragment()));

        v.findViewById(R.id.btnConstraint)
                .setOnClickListener(view -> open(new ConstraintLayoutFragment()));

        v.findViewById(R.id.btnFrame)
                .setOnClickListener(view -> open(new FrameLayoutFragment()));

        v.findViewById(R.id.btnTable)
                .setOnClickListener(view -> open(new TableLayoutFragment()));

        v.findViewById(R.id.btnGrid)
                .setOnClickListener(view -> open(new GridLayoutFragment()));

        v.findViewById(R.id.btnScroll)
                .setOnClickListener(view -> open(new ScrollLayoutFragment()));

        v.findViewById(R.id.btnAbsolute)
                .setOnClickListener(view -> open(new AbsoluteLayoutFragment()));

        v.findViewById(R.id.btnCallIntent).setOnClickListener(view -> {
            startActivity(new Intent(getActivity(), CallActivity.class));
        });

        v.findViewById(R.id.btnSmsIntent).setOnClickListener(view -> {
            startActivity(new Intent(getActivity(), SmsActivity.class));
        });

        v.findViewById(R.id.btnNetworkIntent).setOnClickListener(view -> {
            startActivity(new Intent(getActivity(), NetworkActivity.class));
        });

        v.findViewById(R.id.btnListView).setOnClickListener(view -> {
            startActivity(new Intent(getActivity(), LayoutListActivity.class));
        });




        return v;
    }

    private void open(Fragment fragment) {
        requireActivity()
                .getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.container, fragment)
                .addToBackStack(null)
                .commit();
    }
}
