package com.example.mnit.task15;

import android.content.ComponentName;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ComponentName name = new ComponentName("com.example.mnit.task15", "com.example.mnit.task15.ReceiverCall");

        Intent abc = new Intent();
        abc.setComponent(name);
        sendBroadcast(abc);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        ComponentName name = new ComponentName("com.example.mnit.task15", "com.example.mnit.task15.ReceiverCall");

        Intent abc = new Intent();
        abc.setComponent(name);
        sendBroadcast(abc);
        super.onStart();
    }

    @Override
    protected void onResume() {
        ComponentName name = new ComponentName("com.example.mnit.task15", "com.example.mnit.task15.ReceiverCall");

        Intent abc = new Intent();
        abc.setComponent(name);
        sendBroadcast(abc);
        super.onResume();
    }
}
