package com.example.uytkownik.alarm;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity);


    }

    public void playSound(View view) {
        MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.kbzb);
        mediaPlayer.start(); // no need to call prepare(); create() does that for you

    }
}
