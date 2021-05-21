package com.rzm.usingofnavigation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView mNavigationView;
    private NavHostFragment mHostFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mNavigationView = findViewById(R.id.bottom_navigation_view_id);
        mHostFragment = (NavHostFragment) getSupportFragmentManager().findFragmentById(R.id.fragment_container_view_tag);
        NavController navController = mHostFragment.getNavController();
        NavigationUI.setupWithNavController(mNavigationView,navController);
    }
}