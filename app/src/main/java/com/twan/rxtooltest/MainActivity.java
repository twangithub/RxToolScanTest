package com.twan.rxtooltest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.vondear.rxfeature.activity.ActivityScanerCode;
import com.vondear.rxfeature.module.scaner.OnRxScanerListener;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this, ActivityScanerCode.class));

            }
        });

        ActivityScanerCode.setScanerListener(new OnRxScanerListener() {
            @Override
            public void onSuccess(String type, String result) {
                Log.d("twan","扫描成功:"+result);
            }

            @Override
            public void onFail(String type, String message) {
                Log.d("twan","扫描失败:"+message);
            }
        });
    }

}
