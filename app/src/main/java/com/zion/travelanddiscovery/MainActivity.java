package com.zion.travelanddiscovery;


import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Datatype and variable

    TextView bottomExplore,signUp,backToLogin,loginBottom;
    RelativeLayout startPage,loginPage,signUpPage;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // variable link with xml degine id's

        bottomExplore=findViewById(R.id.bottomExplore);
        startPage=findViewById(R.id.startPage);
        loginPage=findViewById(R.id.loginPage);
        signUp=findViewById(R.id.signUp);
        signUpPage=findViewById(R.id.signUpPage);
        backToLogin=findViewById(R.id.backToLogin);
        loginBottom=findViewById(R.id.loginBottom);

        //explorebottom
        bottomExplore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // visibility
                startPage.setVisibility(View.GONE);
                loginPage.setVisibility(View.VISIBLE);
            }
        });

        // create an account bottom

        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startPage.setVisibility(View.GONE);
                loginPage.setVisibility(View.GONE);
                signUpPage.setVisibility(View.VISIBLE);
            }
        });

        // back to log in page from sign up page

        backToLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startPage.setVisibility(View.GONE);
                loginPage.setVisibility(View.VISIBLE);
                signUpPage.setVisibility(View.GONE);
            }
        });

        // log in bottom to change Activity by verifying identity..

        loginBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fstintent = new Intent(MainActivity.this,HomePage.class);
                startActivity(fstintent);
            }
        });


    }
}