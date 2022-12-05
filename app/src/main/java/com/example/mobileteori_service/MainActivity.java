package com.example.mobileteori_service;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener {
    Button buttonStart, buttonStop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonStart = findViewById(R.id.buttonStart);
        buttonStop = findViewById(R.id.buttonStop);

        buttonStart.setOnClickListener(this);
        buttonStop.setOnClickListener(this);
    }
    public void onClick(View source){
        switch (source.getId()){
            case R.id.buttonStart:
                startService(new Intent(this,MyService.class));
                break;
            case R.id.buttonStop:
                stopService(new Intent(this,MyService.class));
                break;
        }
    }
}