package com.example.newmyapplication;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;

public class MyService extends Service {
    MediaPlayer mplayer;
    public MyService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
       return null;
    }

    @Override
    public void onCreate() {
//        super.onCreate();
//     mplayer = MediaPlayer.create(this,R.raw.sample);
     mplayer.setLooping(false);

    }

    @Override
    public void onStart(Intent intent, int startId) {
//        super.onStart(intent, startId);
        mplayer.start();
    }

    @Override
    public void onDestroy() {
//        super.onDestroy();
        mplayer.stop();
    }
}