package com.example.mobileteori_service;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.widget.Toast;

public class MyService extends Service {
    MediaPlayer mPlayer;

    @Override
    public IBinder onBind(Intent a){
        return null;
    }

    @Override
    public void onCreate(){
        Toast.makeText(this, "Service Created!", Toast.LENGTH_SHORT).show();

        mPlayer = MediaPlayer.create(this,R.raw.neffex);
    }
    @Override
    public void onStart(Intent intent, int startid) {
        Toast.makeText(this, "Service Started and Music Is Playing !", Toast.LENGTH_LONG).show();
        mPlayer.start();
    }
    @Override
    public void onDestroy() {
        Toast.makeText(this, "Service Stopped and Music Stopped!", Toast.LENGTH_LONG).show();
        mPlayer.stop();
    }
}
