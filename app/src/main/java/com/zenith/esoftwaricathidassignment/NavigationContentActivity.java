package com.zenith.esoftwaricathidassignment;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.zenith.esoftwaricathidassignment.fragments.aboutFragment;
import com.zenith.esoftwaricathidassignment.fragments.homeFragment;
import com.zenith.esoftwaricathidassignment.fragments.studentFragment;

public class NavigationContentActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation_content);

        BottomNavigationView bottomNav = findViewById(R.id.bottom_navigation);
        bottomNav.setOnNavigationItemSelectedListener(this);

         getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new homeFragment()).commit();
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        switch (menuItem.getItemId()) {
            case R.id.nav_home:


                homeFragment homeFragment = new homeFragment();
                fragmentTransaction.replace(R.id.fragment_container, homeFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();


                break;
            case R.id.nav_add_student:

                studentFragment studentFragment = new studentFragment();
                fragmentTransaction.replace(R.id.fragment_container, studentFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
                break;
            case R.id.nav_about_us:

                aboutFragment aboutFragment = new aboutFragment();
                fragmentTransaction.replace(R.id.fragment_container, aboutFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
                break;
        }

        return true;

    }
}

