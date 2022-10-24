package com.mangobrew.converterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MassActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mass);

        Button HomeBtn = (Button) findViewById(R.id.massHome);
        Button massCalc = (Button) findViewById(R.id.massCalc);
        Button massCalclb = (Button) findViewById(R.id.massCalclb);
        HomeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MassActivity.this, HomeActivity.class));
            }
        });
        massCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText et = (EditText)findViewById(R.id.kgNum);
                String sTextFromET = et.getText().toString();
                double kg = new Double(sTextFromET).doubleValue();
                double result = kg * 2.20462;
                TextView res = (TextView) findViewById(R.id.massReslut);
                res.setText(String.valueOf(result));
            }
        });
        massCalclb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText et = (EditText)findViewById(R.id.lbNum);
                String sTextFromET = et.getText().toString();
                double lb = new Double(sTextFromET).doubleValue();
                double result = lb / 2.20462;
                TextView res = (TextView) findViewById(R.id.massReslutlb);
                res.setText(String.valueOf(result));
            }
        });
    }
}