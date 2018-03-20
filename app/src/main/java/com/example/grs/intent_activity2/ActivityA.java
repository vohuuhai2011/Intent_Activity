package com.example.grs.intent_activity2;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ActivityA extends AppCompatActivity {
    private EditText mName, mPhone;
    private Button mData;
    public static final String vname="NAME";
    public static final String vphone="PHONE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);

        mName = findViewById(R.id.name);
        mPhone = findViewById(R.id.phone);
        mData = findViewById(R.id.send);

        mData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = mName.getText().toString();
                String phone = mPhone.getText().toString();
                byExtras(name,phone);

            }
        });

    }

    public void byExtras(String name, String phone) {
        Intent intent = new Intent(ActivityA.this, ActivityB.class);
        intent.putExtra(vname,name);
        intent.putExtra(vphone,phone);
        startActivity(intent);
    }
}