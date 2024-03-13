package com.zion.travelanddiscovery;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class HomePage extends AppCompatActivity {

    BottomNavigationView bottomNavigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        Fragment fragment = new Map_Fragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.frame_Layout,fragment).commit();

        bottomNavigation=findViewById(R.id.bottomNavigation);

        bottomNavigation.setSelectedItemId(R.id.home);

        bottomNavigation.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                if(menuItem.getItemId()==R.id.transport){

                   Intent intent = new Intent(HomePage.this,TransportPage.class);
                    startActivity(intent);
                }
                else if(menuItem.getItemId()==R.id.hotel){

                    Intent intent = new Intent(HomePage.this,HotelPage.class);
                    startActivity(intent);
                }
                else if(menuItem.getItemId()==R.id.profile){

                Intent intent = new Intent(HomePage.this,ProfilePage.class);
                startActivity(intent);
                }
                else if(menuItem.getItemId()==R.id.explore){

                    Intent intent = new Intent(HomePage.this,ExplorePage.class);
                    startActivity(intent);
                }

                return false;
            }
        });

    }
}