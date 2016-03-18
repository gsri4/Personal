package com.telugu.storyhub;

import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;

import java.io.IOException;
import java.sql.Time;

public class StoryDetailView extends AppCompatActivity {

    ImageButton img_play;
    MediaPlayer mediaPlayer;
    boolean  isPlaying = false;
    Handler durationHandler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story_detail_view);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mediaPlayer = new MediaPlayer();
        try {
            AssetFileDescriptor fileDescriptor = getAssets().openFd("sample.mp3");
            mediaPlayer.setDataSource(fileDescriptor.getFileDescriptor());
            mediaPlayer.prepare();
        } catch (IOException e) {
            e.printStackTrace();
        }

        img_play =(ImageButton)findViewById(R.id.imbBtn_music);
        img_play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(mediaPlayer.isPlaying()){
                    if(mediaPlayer!=null){
                        mediaPlayer.pause();
                        // Changing button image to play button
                        img_play.setImageResource(android.R.drawable.ic_media_play);
                    }
                }else{
                    // Resume song
                    if(mediaPlayer!=null){
                        mediaPlayer.start();
                        // Changing button image to pause button
                        img_play.setImageResource(android.R.drawable.ic_media_pause);
                    }
                }
            }
        });





    }




}
