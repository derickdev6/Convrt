package com.mangobrew.converterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class TempActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temp);

        Button HomeBtn = (Button) findViewById(R.id.tempHome);
        Button tempCalc = (Button) findViewById(R.id.tempCalc);
        Button tempCalcfa = (Button) findViewById(R.id.tempCalcfa);
        HomeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TempActivity.this, HomeActivity.class));
            }
        });
        tempCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText et = (EditText)findViewById(R.id.cnNum);
                String sTextFromET = et.getText().toString();
                double cn = new Double(sTextFromET).doubleValue();
                double result = cn * 1.8 + 32;
                TextView res = (TextView) findViewById(R.id.tempReslut);
                res.setText(String.valueOf(result));
            }
        });
        tempCalcfa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText et = (EditText)findViewById(R.id.faNum);
                String sTextFromET = et.getText().toString();
                double fa = new Double(sTextFromET).doubleValue();
                double result = (fa-32)*5/9;
                TextView res = (TextView) findViewById(R.id.tempReslutfa);
                res.setText(String.valueOf(result));
            }
        });
    }
}