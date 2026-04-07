//package com.example.alllayoutsapp;
//
//import android.os.Bundle;
//import androidx.appcompat.app.AppCompatActivity;
//
//public class MainActivity extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        if (savedInstanceState == null) {
//            getSupportFragmentManager()
//                    .beginTransaction()
//                    .replace(R.id.container, new MenuFragment())
//                    .commit();
//        }
//    }
//}


package com.example.alllayoutsapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int position = getIntent().getIntExtra("layout_position", -1);

        Fragment fragment;

        if (position == -1) {
            // App opened normally
            fragment = new MenuFragment();
        } else {
            // App opened from ListView
            switch (position) {
                case 0:
                    fragment = new LinearLayoutFragment();
                    break;
                case 1:
                    fragment = new RelativeLayoutFragment();
                    break;
                case 2:
                    fragment = new ConstraintLayoutFragment();
                    break;
                case 3:
                    fragment = new FrameLayoutFragment();
                    break;
                case 4:
                    fragment = new TableLayoutFragment();
                    break;
                case 5:
                    fragment = new GridLayoutFragment();
                    break;
                case 6:
                    fragment = new ScrollLayoutFragment();
                    break;
                case 7:
                    fragment = new AbsoluteLayoutFragment();
                    break;
                default:
                    fragment = new MenuFragment();
            }
        }

        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.container, fragment)
                .commit();
    }
}


