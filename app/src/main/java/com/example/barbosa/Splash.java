package com.example.barbosa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.ProgressBar;

import java.util.Timer;
import java.util.TimerTask;

public class Splash extends AppCompatActivity {

    MediaPlayer song;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        song=MediaPlayer.create(this,R.raw.s);
        song.start();

        TimerTask s=new TimerTask() {
            @Override
            public void run() {
                Intent main= new Intent(Splash.this, MainActivity.class);
                startActivity(main);
                finish();
            }
        };

        Timer tiempo = new Timer();
        tiempo.schedule(s,10000);
    }
}

// 10.23:58