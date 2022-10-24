package com.mangobrew.converterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CurrencyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currency);

        Button HomeBtn = (Button) findViewById(R.id.currHome);
        Button currCalc = (Button) findViewById(R.id.currCalc);
        Button currCalcdl = (Button) findViewById(R.id.currCalcdl);

        HomeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CurrencyActivity.this, HomeActivity.class));
            }
        });
        currCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText et = (EditText)findViewById(R.id.coNum);
                String sTextFromET = et.getText().toString();
                double co = new Double(sTextFromET).doubleValue();
                double result = co * 0.00021;
                TextView res = (TextView) findViewById(R.id.currResult);
                res.setText(String.valueOf(result + " Ayudanos señor"));
            }
        });
        currCalcdl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText et = (EditText)findViewById(R.id.dlNum);
                String sTextFromET = et.getText().toString();
                double dl = new Double(sTextFromET).doubleValue();
                double result = dl * 4857.31;
                TextView res = (TextView) findViewById(R.id.currResultdl);
                res.setText(String.valueOf(result + " De verdad ayudanos señor"));
            }
        });

    }

}