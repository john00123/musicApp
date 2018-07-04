package com.example.john.musicapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class RadioActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // Create a list of Songs
        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("God's Plan", "Scary Hours · 2018"));
        songs.add(new Song("Nice For What", "Scary Hours · 2018"));
        songs.add(new Song("Hotline Bling", "Views · 2016"));
        songs.add(new Song("I'm upset", "Scary Hours · 2018"));
        songs.add(new Song("Once Dance", "Views · 2016"));

        // Display Drake's Songs
        SongAdapter adapter = new SongAdapter(this, songs); //new adapter
        ListView listView = (ListView) findViewById(R.id.list); //find view
        listView.setAdapter(adapter); //use adapter
    }
}
