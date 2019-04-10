package com.example.sarang.xylophoneapp;

import android.media.AudioManager;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    //Declaration of Member variables
    SoundPool mSoundPool;
    private int btnYellowId;
    private int btnORangeId;
    private int btnRedId;
    private int btnBlueId;
    private int btnGreenId;
    private int btnPinkId;
    private int btnPurpleId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //New SoundPool
        mSoundPool = new SoundPool(7 , AudioManager.STREAM_MUSIC, 0);

        //Load and get the IDs to identify sounds
        btnYellowId = mSoundPool.load(getApplicationContext(),R.raw.note1_c, 0);
        btnORangeId = mSoundPool.load(getApplicationContext(), R.raw.note2_d, 0);
        btnRedId = mSoundPool.load(getApplicationContext(), R.raw.note3_e, 0);
        btnGreenId = mSoundPool.load(getApplicationContext(), R.raw.note4_f, 0);
        btnBlueId = mSoundPool.load(getApplicationContext(), R.raw.note5_g, 0);
        btnPinkId = mSoundPool.load(getApplicationContext(), R.raw.note6_a, 0);
        btnPurpleId = mSoundPool.load(getApplicationContext(), R.raw.note7_b, 0);


        }

    //Methiods triggered by the buttons
        public void yellow(View v){
            mSoundPool.play(btnYellowId, 1.0f, 1.0f, 0, 0, 1.0f);
        }

        public void orange(View v){
        mSoundPool.play(btnORangeId, 1.0f, 1.0f, 0, 0, 1.0f);

        }

    public void red(View v){
        mSoundPool.play(btnORangeId, 1.0f, 1.0f, 0, 0, 1.0f);

    }

    public void blue(View v){
        mSoundPool.play(btnORangeId, 1.0f, 1.0f, 0, 0, 1.0f);

    }

    public void green(View v){
        mSoundPool.play(btnORangeId, 1.0f, 1.0f, 0, 0, 1.0f);

    }

    public void pink(View v){
        mSoundPool.play(btnORangeId, 1.0f, 1.0f, 0, 0, 1.0f);

    }

    public void purple(View v){
        mSoundPool.play(btnORangeId, 1.0f, 1.0f, 0, 0, 1.0f);

    }

    }

