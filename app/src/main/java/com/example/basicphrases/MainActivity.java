package com.example.basicphrases;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button konichiwa, arigato, sumimasen, dozo, hai, kampai, sayonara, yokatta;
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.konichiwa).setOnClickListener(this);
        findViewById(R.id.arigato).setOnClickListener(this);
        findViewById(R.id.sumimasen).setOnClickListener(this);
        findViewById(R.id.dozo).setOnClickListener(this);
        findViewById(R.id.hai).setOnClickListener(this);
        findViewById(R.id.kampai).setOnClickListener(this);
        findViewById(R.id.sayonara).setOnClickListener(this);
        findViewById(R.id.yokatta).setOnClickListener(this);

        mediaPlayer = MediaPlayer.create(this,R.raw.konichiwa);
    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.konichiwa){
            playMedia(R.raw.konichiwa);
        }
        else if(view.getId() == R.id.arigato){
            playMedia(R.raw.arigato);
        }
        else if(view.getId() == R.id.sumimasen){
            playMedia(R.raw.sunimasen);
        }
        else if(view.getId() == R.id.dozo){
            playMedia(R.raw.dozo);
        }
        else if(view.getId() == R.id.hai){
            playMedia(R.raw.hai);
        }
        else if(view.getId() == R.id.kampai){
            playMedia(R.raw.kampai);
        }
        else if(view.getId() == R.id.sayonara){
            playMedia(R.raw.sayonara);
        }
        else if(view.getId() == R.id.yokatta){
            playMedia(R.raw.yokatta);
        }
    }

    private void playMedia(int mediaId){
        if(mediaPlayer.isPlaying()){
            mediaPlayer.pause();
        }

        mediaPlayer = MediaPlayer.create(this,mediaId);
        mediaPlayer.start();
    }
}
