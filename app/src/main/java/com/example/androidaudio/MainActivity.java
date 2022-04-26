package com.example.androidaudio;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void buttonTapped(View view) {

        int id = view.getId();
        String Id = view.getResources().getResourceEntryName(id);
        int resourceId = getResources().getIdentifier(Id, "raw", this.getPackageName());
        MediaPlayer ring = MediaPlayer.create(MainActivity.this, resourceId);

        if (ring.isPlaying()) {
            ring.stop();
        }
//        else {
//            ring.start();
//        }

        ring.start();
//        if (ring.isPlaying()) {
//            Log.i("ring", "true");
//        }


    }
}