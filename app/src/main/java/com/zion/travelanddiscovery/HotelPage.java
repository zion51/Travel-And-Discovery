package com.zion.travelanddiscovery;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class HotelPage extends AppCompatActivity {

    BottomNavigationView bottomNavigation;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_hotel_page);

        bottomNavigation=findViewById(R.id.bottomNavigation);

        bottomNavigation.setSelectedItemId(R.id.hotel);

        bottomNavigation.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                if(menuItem.getItemId()==R.id.transport){

                    Intent intent = new Intent(HotelPage.this,TransportPage.class);
                    startActivity(intent);
                }
                else if(menuItem.getItemId()==R.id.home){

                    Intent intent = new Intent(HotelPage.this,HomePage.class);
                    startActivity(intent);
                }
                else if(menuItem.getItemId()==R.id.profile){

                    Intent intent = new Intent(HotelPage.this,ProfilePage.class);
                    startActivity(intent);
                }
                else if(menuItem.getItemId()==R.id.explore){

                    Intent intent = new Intent(HotelPage.this,ExplorePage.class);
                    startActivity(intent);
                }

                return false;
            }
        });



    }
}