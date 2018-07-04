package com.example.john.musicapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class PlayNowActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // Create a list of Songs
        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("The middle ", "▶  1:30/3:00"));

        //Display Playing Song
        SongAdapter adapter = new SongAdapter(this, songs); //new adapter
        ListView listView = (ListView) findViewById(R.id.list); //find view
        listView.setAdapter(adapter); //use adapter
    }
}
