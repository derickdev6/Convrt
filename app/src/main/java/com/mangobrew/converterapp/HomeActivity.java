package com.mangobrew.converterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Button massActBtn = (Button) findViewById(R.id.massbtn);
        Button tempActBtn = (Button) findViewById(R.id.tempbtn);
        Button speedActBtn = (Button) findViewById(R.id.speedbtn);
        Button lengthActBtn = (Button) findViewById(R.id.lengthbtn);
        Button currencyActBtn = (Button) findViewById(R.id.currencybtn);
        Button creditsActBtn = (Button) findViewById(R.id.creditsbtn);
        massActBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, MassActivity.class));
            }
        });
        tempActBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, TempActivity.class));
            }
        });
        speedActBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, SpeedActivity.class));
            }
        });
        lengthActBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, LengthActivity.class));
            }
        });
        currencyActBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, CurrencyActivity.class));
            }
        });
        creditsActBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, CreditsActivity.class));
            }
        });
    }
}