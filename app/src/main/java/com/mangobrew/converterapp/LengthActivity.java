package com.mangobrew.converterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LengthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_length);

        Button HomeBtn = (Button) findViewById(R.id.lengthHome);
        Button lengthCalc = (Button) findViewById(R.id.lengthCalc);
        Button lengthCalcin = (Button) findViewById(R.id.lengthCalcin);

        HomeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LengthActivity.this, HomeActivity.class));
            }
        });
        lengthCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText et = (EditText)findViewById(R.id.cmNum);
                String sTextFromET = et.getText().toString();
                double cm = new Double(sTextFromET).doubleValue();
                double result = cm / 2.54;
                TextView res = (TextView) findViewById(R.id.lengthReslut);
                res.setText(String.valueOf(result));
            }
        });
        lengthCalcin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText et = (EditText)findViewById(R.id.inNum);
                String sTextFromET = et.getText().toString();
                double in = new Double(sTextFromET).doubleValue();
                double result = in * 2.54;
                TextView res = (TextView) findViewById(R.id.lengthReslutin);
                res.setText(String.valueOf(result));
            }
        });

    }
}