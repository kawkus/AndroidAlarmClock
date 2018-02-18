package com.example.uytkownik.alarm;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;


import com.example.uytkownik.alarm.R;

import static com.example.uytkownik.alarm.R.raw.kbzb;

public class playSound  extends Service implements MediaPlayer.OnPreparedListener {

    private String soundName;
    final static private int seconds = 10;
    private static final String ACTION_PLAY = "com.example.action.PLAY";
    MediaPlayer mMediaPlayer = null;

    public int onStartCommand(Intent intent, int flags, int startId) {

        if (intent.getAction().equals(ACTION_PLAY)) {

            mMediaPlayer.setOnPreparedListener(this);
            mMediaPlayer.prepareAsync(); // prepare async to not block main thread
        }
        return Service.START_STICKY_COMPATIBILITY;
    }

    /** Called when MediaPlayer is ready */
    public void onPrepared(MediaPlayer player) {
        player.start();
    }
    public IBinder onBind(Intent intent)
    {
       return null;
    }



    public playSound(String soundName) {
        this.soundName = soundName;
    }

    public String getSoundName() {
        return soundName;
    }

    public void setSoundName(String soundName) {
        this.soundName = soundName;
    }

    public int getSeconds() {
        return seconds;
    }


    public void playSoundTheme ()
    {
        //MediaPlayer mediaPlayer = MediaPlayer.create(context, kbzb);
       // mediaPlayer.start(); // no need to call prepare(); create() does that for you
    }

}
