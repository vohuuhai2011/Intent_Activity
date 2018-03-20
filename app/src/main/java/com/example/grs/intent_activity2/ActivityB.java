package com.example.grs.intent_activity2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ActivityB extends AppCompatActivity {
private TextView tvname,tvphone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
        tvname= findViewById(R.id.tv_name);
        tvphone = findViewById(R.id.tv_phone);
        setDataByExtras();

    }
    public void setDataByExtras(){

        Intent intent = getIntent();
        String name = intent.getStringExtra(ActivityA.vname);
        String phone = intent.getStringExtra(ActivityA.vphone);
        tvname.setText(name);
        tvphone.setText(phone);
    }
}
