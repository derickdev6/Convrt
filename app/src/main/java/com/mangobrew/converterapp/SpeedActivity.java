package com.mangobrew.converterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SpeedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_speed);

        Button HomeBtn = (Button) findViewById(R.id.speedHome);
        Button speedCalc = (Button) findViewById(R.id.speedCalc);
        Button speedCalcmh = (Button) findViewById(R.id.speedCalcmh);

        HomeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SpeedActivity.this, HomeActivity.class));
            }
        });
        speedCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText et = (EditText)findViewById(R.id.khNum);
                String sTextFromET = et.getText().toString();
                double kh = new Double(sTextFromET).doubleValue();
                double result = kh / 1.609;
                TextView res = (TextView) findViewById(R.id.speedReslut);
                res.setText(String.valueOf(result));
            }
        });
        speedCalcmh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText et = (EditText)findViewById(R.id.mhNum);
                String sTextFromET = et.getText().toString();
                double mh = new Double(sTextFromET).doubleValue();
                double result = mh * 1.609;
                TextView res = (TextView) findViewById(R.id.speedReslutmh);
                res.setText(String.valueOf(result));
            }
        });

    }
}