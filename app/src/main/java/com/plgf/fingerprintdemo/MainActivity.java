package com.plgf.fingerprintdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.plgf.fingerprint.CheckFinger;
import com.plgf.fingerprint.FingerprintUtils;

public class MainActivity extends AppCompatActivity implements CheckFinger {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new  FingerprintUtils().check(this);


    }

    @Override
    public void onAuthenticated() {
        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);
        finish();
    }
}
